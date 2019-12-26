package com.taoding.response;
/**
 * @ClassName: ApiResponse
 * @Author: lihewei
 * @Date: 2019-12-25 09:32
 */

import lombok.Data;

/**
 *@ClassName:ApiResponse
 *@author: lihewei
 *@Date: 2019-12-25 09:32
 *
 */
@Data
public class ApiResponse {

	private  int code;

	private  String msg;

	public ApiResponse(String msg) {
		this.msg = msg;
	}
}
