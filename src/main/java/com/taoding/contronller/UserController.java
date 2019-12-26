package com.taoding.contronller;

import com.taoding.aop.LogicException;
import com.taoding.aop.MyAnnotation;
import com.taoding.response.ApiResponse;
import com.taoding.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
* @Description: 
* @Param: 
* @create:  
* @return:
*/
@RestController
@RequestMapping(value = "/user")
public class UserController {

	private Logger logger= LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserService userService;

	@GetMapping(value = "/get")
	public Object get() {
		ApiResponse apiResponse = new ApiResponse("fuck");
		return apiResponse;
	}
}
