package com.taoding.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: LogicException
 * @Author: lihewei
 * @Date: 2019-12-24 17:55
 * @Description: 异常处理公共类
 */
public class LogicException extends RuntimeException {
	private Logger logger= LoggerFactory.getLogger(LogicException.class);


	private  int code;

	public LogicException(String message, int code) {
		super(message);
		this.code = code;
	}

	public LogicException(String message) {
		super(message);
	}


}
