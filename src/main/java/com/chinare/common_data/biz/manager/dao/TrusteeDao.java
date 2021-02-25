package com.chinare.common_data.biz.manager.dao;

import com.chinare.common_data.biz.manager.domain.TrusteeDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 受托人信息管理表
 * @author chinare
 * @email devops@chinare.com.cn
 * @date 2020-09-24 16:31:56
 */
@Mapper
public interface TrusteeDao {

	TrusteeDO get(String trusteecode);
	
	List<TrusteeDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(TrusteeDO trustee);
	
	int update(TrusteeDO trustee);
	
	int remove(Map<String, Object> params);
	
	int batchRemove(String[] trusteecodes);
}
