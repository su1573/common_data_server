package com.chinare.common_data.system.shiro;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.chinare.common_data.common.config.ApplicationContextRegister;
import com.chinare.common_data.common.utils.ShiroUtils;
import com.chinare.common_data.system.dao.UserDao;
import com.chinare.common_data.system.domain.UserDO;
import com.chinare.common_data.system.service.AuthCenterService;
import com.chinare.common_data.system.service.MenuService;

public class UserRealm extends AuthorizingRealm {
	@Value("${generator.authServer}")
	private String authServer;
	
	@Autowired
	UserDao userMapper;
	
	/*	@Autowired
	MenuService menuService;*/

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		Long userId = ShiroUtils.getUserId();
		MenuService menuService = ApplicationContextRegister.getBean(MenuService.class);
		Set<String> perms = menuService.listPerms(userId);
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		info.setStringPermissions(perms);
		return info;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String username = (String) token.getPrincipal();
		Map<String, Object> params = new HashMap<>(16);
		params.put("username", username);
		String password = new String((char[]) token.getCredentials());

		
		UserDO user = null;
		if("AUTH-CENTER".equals(authServer)) {
			AuthCenterService authCenterService = ApplicationContextRegister.getBean(AuthCenterService.class);
			user = authCenterService.getUserByUserName(params);
		}else {
			user = userMapper.getUserByUserName(params);
		}

		// 账号不存在
		if (user == null) {
			throw new UnknownAccountException("账号或密码不正确");
		}

		// 密码错误
		if (!password.equals(user.getPassword())) {
			throw new IncorrectCredentialsException("账号或密码不正确");
		}

		// 账号锁定
		if (user.getStatus() == 0) {
			throw new LockedAccountException("账号已被锁定,请联系管理员");
		}
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, password, getName());
		return info;
	}

}
