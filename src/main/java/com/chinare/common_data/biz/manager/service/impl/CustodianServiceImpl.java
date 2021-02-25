package com.chinare.common_data.biz.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.chinare.common_data.biz.manager.dao.CustodianDao;
import com.chinare.common_data.biz.manager.domain.CustodianDO;
import com.chinare.common_data.biz.manager.service.CustodianService;



@Service
public class CustodianServiceImpl implements CustodianService {
	@Autowired
	private CustodianDao custodianDao;
	
	@Override
	public CustodianDO get(String custodiancode){
		return custodianDao.get(custodiancode);
	}
	
	@Override
	public List<CustodianDO> list(Map<String, Object> map){
		return custodianDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return custodianDao.count(map);
	}
	
	@Override
	public int save(CustodianDO custodian){
		return custodianDao.save(custodian);
	}
	
	@Override
	public int update(CustodianDO custodian){
		return custodianDao.update(custodian);
	}
	
	@Override
	public int remove(Map<String, Object> params){
		return custodianDao.remove(params);
	}
	
	@Override
	public int batchRemove(String[] custodiancodes){
		return custodianDao.batchRemove(custodiancodes);
	}
	
}
