package com.taoding.aop;

import com.taoding.response.ApiResponse;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @ClassName: WebLog
 * @Author: lihewei
 * @Date: 2019-12-24 15:18
 */

@Aspect
@Component

public class WebLog {

	private Logger log= LoggerFactory.getLogger(this.getClass());
	private ProceedingJoinPoint proceedingJoinPoint;


	/**
	 * 定义切入点，切入点为com.example.aop下的所有函数
	 */

	@Pointcut("execution(* com.taoding.controller.*(..))")
	public void webLog(){}

	/**
	 * 环绕通知：
	 *   环绕通知非常强大，可以决定目标方法是否执行，什么时候执行，执行时是否需要替换方法参数，执行完毕是否需要替换返回值。
	 *   环绕通知第一个参数必须是org.aspectj.lang.ProceedingJoinPoint类型
	 */
	@Around(value = "execution(* com.taoding.contronller..*.*(..))")
	public Object doAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		this.proceedingJoinPoint = proceedingJoinPoint;

		log.info("环绕通知的目标方法名："+proceedingJoinPoint.getSignature().getName());
		try {
			long start=System.currentTimeMillis();
			Object obj = proceedingJoinPoint.proceed();
			long end=System.currentTimeMillis();
			log.info("接口耗费时间是:{}",(end-start));
			return obj;
		} catch (Throwable throwable) {
			log.info(throwable.getMessage());
			throw  new LogicException(throwable.getMessage());
		}
	}



}
