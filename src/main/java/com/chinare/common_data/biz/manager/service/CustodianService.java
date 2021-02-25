package com.chinare.common_data.biz.manager.service;

import com.chinare.common_data.biz.manager.domain.CustodianDO;

import java.util.List;
import java.util.Map;

/**
 * 托管人信息管理表
 * 
 * @author chinare
 * @email devops@chinare.com.cn
 * @date 2020-09-24 16:31:56
 */
public interface CustodianService {
	
	CustodianDO get(String custodiancode);
	
	List<CustodianDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CustodianDO custodian);
	
	int update(CustodianDO custodian);
	
	int remove(Map<String, Object> params);
	
	int batchRemove(String[] custodiancodes);
}
