package com.taoding.service;
/**
 * @ClassName: UserServiceImpl
 * @Author: lihewei
 * @Date: 2019-12-25 09:16
 */

import org.springframework.stereotype.Service;

/**
 *@ClassName:UserServiceImpl
 *@author: lihewei
 *@Date: 2019-12-25 09:16
 *
 */
@Service
public class UserServiceImpl implements UserService {
	@Override
	public String getName() {
		return "1";
	}
}
