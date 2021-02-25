package com.chinare.common_data.biz.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.chinare.common_data.biz.manager.dao.AccmanagerDao;
import com.chinare.common_data.biz.manager.domain.AccmanagerDO;
import com.chinare.common_data.biz.manager.service.AccmanagerService;



@Service
public class AccmanagerServiceImpl implements AccmanagerService {
	@Autowired
	private AccmanagerDao accmanagerDao;
	
	@Override
	public AccmanagerDO get(String accmngcode){
		return accmanagerDao.get(accmngcode);
	}
	
	@Override
	public List<AccmanagerDO> list(Map<String, Object> map){
		return accmanagerDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return accmanagerDao.count(map);
	}
	
	@Override
	public int save(AccmanagerDO accmanager){
		return accmanagerDao.save(accmanager);
	}
	
	@Override
	public int update(AccmanagerDO accmanager){
		return accmanagerDao.update(accmanager);
	}
	
	@Override
	public int remove(Map<String, Object> params){
		return accmanagerDao.remove(params);
	}
	
	@Override
	public int batchRemove(String[] accmngcodes){
		return accmanagerDao.batchRemove(accmngcodes);
	}
	
}
