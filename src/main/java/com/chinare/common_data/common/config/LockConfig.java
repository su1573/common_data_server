package com.chinare.common_data.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.chinare.common_data.common.service.CacheKeyGenerator;
import com.chinare.common_data.common.service.impl.LockKeyGenerator;

/**
 * @author demo 1992lcg@163.com
 */
@Configuration
public class LockConfig {
	@Bean
	public CacheKeyGenerator cacheKeyGenerator() {
		return  new LockKeyGenerator();
	}

}
