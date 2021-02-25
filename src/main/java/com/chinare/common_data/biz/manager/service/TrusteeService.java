package com.chinare.common_data.biz.manager.service;

import com.chinare.common_data.biz.manager.domain.TrusteeDO;

import java.util.List;
import java.util.Map;

/**
 * 受托人信息管理表
 * 
 * @author chinare
 * @email devops@chinare.com.cn
 * @date 2020-09-24 16:31:56
 */
public interface TrusteeService {
	
	TrusteeDO get(String trusteecode);
	
	List<TrusteeDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TrusteeDO trustee);
	
	int update(TrusteeDO trustee);
	
	int remove(Map<String, Object> params);
	
	int batchRemove(String[] trusteecodes);
}
