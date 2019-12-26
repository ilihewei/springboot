package com.taoding.service;
/**
 * @ClassName: MatchStrategyPattern
 * @Author: lihewei
 * @Date: 2019-12-26 10:08
 */

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import  java.util.*;

@Service
public class MatchStrategyPattern {
	@Resource
	private List<IMatchService> matchServiceList;

	public  void  match(String channelId,Map<String,Object> map){
		Optional<IMatchService> optional=matchServiceList.stream()
				.filter(service->service.getChannedlId().equals(channelId)).findFirst();
		optional.ifPresent(op->{optional.get().match(map);});
	}
}
