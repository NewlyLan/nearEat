/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：PtcAlipayService.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.service;

import com.paascloud.base.dto.LoginAuthDto;
import com.paascloud.wrapper.Wrapper;

import java.util.Map;

/**
 * The interface Ptc alipay service.
 *
 * @author paascloud.net@gmail.com
 */
public interface PtcAlipayService {

	/**
	 * 生成付款二维码.
	 *
	 * @param orderNo      the order no
	 * @param loginAuthDto the login auth dto
	 *
	 * @return the wrapper
	 */
	Wrapper pay(String orderNo, LoginAuthDto loginAuthDto);

	/**
	 * Ali pay callback wrapper.
	 *
	 * @param params the params
	 *
	 * @return the wrapper
	 */
	Wrapper aliPayCallback(Map<String, String> params);
}
