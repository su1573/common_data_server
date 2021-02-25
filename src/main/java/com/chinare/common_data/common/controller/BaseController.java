package com.chinare.common_data.common.controller;

import com.chinare.common_data.common.utils.ShiroUtils;
import com.chinare.common_data.system.domain.UserDO;
import org.springframework.stereotype.Controller;

@Controller
public class BaseController {
	public UserDO getUser() {
		return ShiroUtils.getUser();
	}

	public Long getUserId() {
		return getUser().getUserId();
	}

	public String getUsername() {
		return getUser().getUsername();
	}
}
