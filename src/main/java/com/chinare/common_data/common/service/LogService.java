package com.chinare.common_data.common.service;

import com.chinare.common_data.common.domain.LogDO;
import com.chinare.common_data.common.domain.PageDO;
import com.chinare.common_data.common.utils.Query;
import org.springframework.stereotype.Service;
@Service
public interface LogService {
	void save(LogDO logDO);
	PageDO<LogDO> queryList(Query query);
	int remove(Long id);
	int batchRemove(Long[] ids);
}
