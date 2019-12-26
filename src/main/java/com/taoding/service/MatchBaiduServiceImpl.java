package com.taoding.service;
/**
 * @ClassName: MatchBaiduServiceImpl
 * @Author: lihewei
 * @Date: 2019-12-26 10:15
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
import java.util.logging.Logger;

/**
 *@ClassName:MatchBaiduServiceImpl
 *@author: lihewei
 *@Date: 2019-12-26 10:15
 *
 */
@Service("matchBaiduService")
@Slf4j
public class MatchBaiduServiceImpl implements  IMatchService {



	public static final String CHANNELBAIDU="22017002";


	@Override
	public void match(Map<String, Object> amp) {
		try{
			doSomthing();
		}catch (Exception e){
			log.error("点击数据失败:"+e.getMessage());
		}
	}

	private void doSomthing() {
		System.out.println("water");
	}

	@Override
	public String getChannedlId() {
		return CHANNELBAIDU;
	}
}
