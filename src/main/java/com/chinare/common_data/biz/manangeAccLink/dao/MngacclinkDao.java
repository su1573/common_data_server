package com.chinare.common_data.biz.manangeAccLink.dao;

import com.chinare.common_data.biz.manangeAccLink.domain.MngacclinkDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 管理人账户关联表
 * @author chinare
 * @email devops@chinare.com.cn
 * @date 2020-09-24 16:31:56
 */
@Mapper
public interface MngacclinkDao {

	MngacclinkDO get(String mngaccno);
	
	List<MngacclinkDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(MngacclinkDO mngacclink);
	
	int update(MngacclinkDO mngacclink);
	
	int remove(Map<String, Object> params);
	
	int batchRemove(String[] mngaccnos);
}
