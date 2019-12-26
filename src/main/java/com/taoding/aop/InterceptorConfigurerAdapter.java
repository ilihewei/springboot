package com.taoding.aop;
/**
 * @ClassName: InterceptorConfigurerAdapter
 * @Author: lihewei
 * @Date: 2019-12-24 18:28
 */

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *@ClassName:InterceptorConfigurerAdapter
 *@author: lihewei
 *@Date: 2019-12-24 18:28
 *@Description:拦截器链
 */
@Configuration
public class InterceptorConfigurerAdapter/* extends WebMvcConfigurerAdapter {

	@Override
	public void addInterceptors(InterceptorRegistry registry){
		registry.addInterceptor(new BusinessInterceptor()).addPathPatterns("/**");
		super.addInterceptors(registry);
	}
}*/
{}
