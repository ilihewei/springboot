package com.taoding.contronller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.taoding.service.MatchStrategyPattern;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @ClassName: TestController
 * @Author: lihewei
 * @Date: 2019-12-26 10:19
 */

@RestController
@RequestMapping(value = "/test")
@Slf4j
public class TestController {

	@Autowired
	private MatchStrategyPattern matchStrategyPattern;

	@GetMapping(value = "maatchData")
	public String  matchData(String channelid){
		try{
			matchStrategyPattern.match(channelid,new HashMap<>());
			return "ok";
		}catch (Exception e){
			return "fail";
		}
	}
}
