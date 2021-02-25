package com.chinare.common_data.biz.manangeAccLink.service;

import com.chinare.common_data.biz.manangeAccLink.domain.MngacclinkDO;

import java.util.List;
import java.util.Map;

/**
 * 管理人账户关联表
 * 
 * @author chinare
 * @email devops@chinare.com.cn
 * @date 2020-09-24 16:31:56
 */
public interface MngacclinkService {
	
	MngacclinkDO get(String mngaccno);
	
	List<MngacclinkDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(MngacclinkDO mngacclink);
	
	int update(MngacclinkDO mngacclink);
	
	int remove(Map<String, Object> params);
	
	int batchRemove(String[] mngaccnos);
}
