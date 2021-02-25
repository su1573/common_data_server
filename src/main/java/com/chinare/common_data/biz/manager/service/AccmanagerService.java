package com.chinare.common_data.biz.manager.service;

import com.chinare.common_data.biz.manager.domain.AccmanagerDO;

import java.util.List;
import java.util.Map;

/**
 * 帐户管理人信息管理表
 * 
 * @author chinare
 * @email devops@chinare.com.cn
 * @date 2020-09-24 16:31:56
 */
public interface AccmanagerService {
	
	AccmanagerDO get(String accmngcode);
	
	List<AccmanagerDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(AccmanagerDO accmanager);
	
	int update(AccmanagerDO accmanager);
	
	int remove(Map<String, Object> params);
	
	int batchRemove(String[] accmngcodes);
}
