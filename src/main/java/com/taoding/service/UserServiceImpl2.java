package com.taoding.service;
/**
 * @ClassName: UserServiceImpl2
 * @Author: lihewei
 * @Date: 2019-12-25 09:17
 */

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 *@ClassName:UserServiceImpl2
 *@author: lihewei
 *@Date: 2019-12-25 09:17
 *
 */
@Service
@Primary
public class UserServiceImpl2 implements  UserService {
	@Override
	public String getName() {
		return "2";
	}
}
