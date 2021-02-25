package com.chinare.common_data.biz.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.chinare.common_data.biz.manager.dao.IvstmanagerDao;
import com.chinare.common_data.biz.manager.domain.IvstmanagerDO;
import com.chinare.common_data.biz.manager.service.IvstmanagerService;



@Service
public class IvstmanagerServiceImpl implements IvstmanagerService {
	@Autowired
	private IvstmanagerDao ivstmanagerDao;
	
	@Override
	public IvstmanagerDO get(String ivstmngcode){
		return ivstmanagerDao.get(ivstmngcode);
	}
	
	@Override
	public List<IvstmanagerDO> list(Map<String, Object> map){
		return ivstmanagerDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return ivstmanagerDao.count(map);
	}
	
	@Override
	public int save(IvstmanagerDO ivstmanager){
		return ivstmanagerDao.save(ivstmanager);
	}
	
	@Override
	public int update(IvstmanagerDO ivstmanager){
		return ivstmanagerDao.update(ivstmanager);
	}
	
	@Override
	public int remove(Map<String, Object> params){
		return ivstmanagerDao.remove(params);
	}
	
	@Override
	public int batchRemove(String[] ivstmngcodes){
		return ivstmanagerDao.batchRemove(ivstmngcodes);
	}
	
}
