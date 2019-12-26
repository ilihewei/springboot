package com.taoding.aop;
/**
 * @ClassName: BusinessIterator
 * @Author: lihewei
 * @Date: 2019-12-24 18:17
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class BusinessInterceptor {/*implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler){

		log.info("这是测试");
		return  false;
	}

	@Override
	public  void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj, ModelAndView modelAndView){

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object obj, Exception err)
			throws Exception {


	}*/
}
