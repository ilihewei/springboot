package com.taoding.service;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 *@ClassName:Match360ServiceImpl
 *@author: lihewei
 *@Date: 2019-12-26 10:03
 *
 */

@Service("match360Service")
@Slf4j
public class Match360ServiceImpl implements IMatchService {







	public static final String CHANNEL360="22017001";

	@Override
	public void match(Map<String, Object> amp) {
		try{
			doSomthing();
		}catch (Exception e){
			log.error("点击数据失败:"+e.getMessage());
		}
	}

	private void doSomthing() {
		System.out.println("1");
	}

	@Override
	public String getChannedlId() {
		return CHANNEL360;
	}
}
