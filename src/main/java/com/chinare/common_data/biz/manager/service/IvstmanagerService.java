package com.chinare.common_data.biz.manager.service;

import com.chinare.common_data.biz.manager.domain.IvstmanagerDO;

import java.util.List;
import java.util.Map;

/**
 * 投资管理人信息管理表
 * 
 * @author chinare
 * @email devops@chinare.com.cn
 * @date 2020-09-24 16:31:56
 */
public interface IvstmanagerService {
	
	IvstmanagerDO get(String ivstmngcode);
	
	List<IvstmanagerDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(IvstmanagerDO ivstmanager);
	
	int update(IvstmanagerDO ivstmanager);
	
	int remove(Map<String, Object> params);
	
	int batchRemove(String[] ivstmngcodes);
}
