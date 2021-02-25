package com.chinare.common_data.biz.manangeAccLink.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.chinare.common_data.biz.manangeAccLink.dao.MngacclinkDao;
import com.chinare.common_data.biz.manangeAccLink.domain.MngacclinkDO;
import com.chinare.common_data.biz.manangeAccLink.service.MngacclinkService;



@Service
public class MngacclinkServiceImpl implements MngacclinkService {
	@Autowired
	private MngacclinkDao mngacclinkDao;
	
	@Override
	public MngacclinkDO get(String mngaccno){
		return mngacclinkDao.get(mngaccno);
	}
	
	@Override
	public List<MngacclinkDO> list(Map<String, Object> map){
		return mngacclinkDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return mngacclinkDao.count(map);
	}
	
	@Override
	public int save(MngacclinkDO mngacclink){
		return mngacclinkDao.save(mngacclink);
	}
	
	@Override
	public int update(MngacclinkDO mngacclink){
		return mngacclinkDao.update(mngacclink);
	}
	
	@Override
	public int remove(Map<String, Object> params){
		return mngacclinkDao.remove(params);
	}
	
	@Override
	public int batchRemove(String[] mngaccnos){
		return mngacclinkDao.batchRemove(mngaccnos);
	}
	
}
