package com.chinare.common_data.biz.manager.dao;

import com.chinare.common_data.biz.manager.domain.IvstmanagerDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 投资管理人信息管理表
 * @author chinare
 * @email devops@chinare.com.cn
 * @date 2020-09-24 16:31:56
 */
@Mapper
public interface IvstmanagerDao {

	IvstmanagerDO get(String ivstmngcode);
	
	List<IvstmanagerDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(IvstmanagerDO ivstmanager);
	
	int update(IvstmanagerDO ivstmanager);
	
	int remove(Map<String, Object> params);
	
	int batchRemove(String[] ivstmngcodes);
}
