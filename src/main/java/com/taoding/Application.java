package com.taoding;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @ClassName: SpringbootApplication
 * @Author: lihewei
 * @Date: 2019-12-20 14:57
 */
@SpringBootApplication
@EnableAutoConfiguration
public class Application {
	private static Logger logger= LoggerFactory.getLogger(Application.class);
	public static void main(String[] args){
		long end=System.currentTimeMillis();
		long start=System.currentTimeMillis();
		logger.info("需要执行时间：{}",(end-start));
		SpringApplication.run(Application.class,args);
	}
}
