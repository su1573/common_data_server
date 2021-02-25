package com.chinare.common_data.biz.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.chinare.common_data.biz.manager.dao.TrusteeDao;
import com.chinare.common_data.biz.manager.domain.TrusteeDO;
import com.chinare.common_data.biz.manager.service.TrusteeService;



@Service
public class TrusteeServiceImpl implements TrusteeService {
	@Autowired
	private TrusteeDao trusteeDao;
	
	@Override
	public TrusteeDO get(String trusteecode){
		return trusteeDao.get(trusteecode);
	}
	
	@Override
	public List<TrusteeDO> list(Map<String, Object> map){
		return trusteeDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return trusteeDao.count(map);
	}
	
	@Override
	public int save(TrusteeDO trustee){
		return trusteeDao.save(trustee);
	}
	
	@Override
	public int update(TrusteeDO trustee){
		return trusteeDao.update(trustee);
	}
	
	@Override
	public int remove(Map<String, Object> params){
		return trusteeDao.remove(params);
	}
	
	@Override
	public int batchRemove(String[] trusteecodes){
		return trusteeDao.batchRemove(trusteecodes);
	}
	
}
