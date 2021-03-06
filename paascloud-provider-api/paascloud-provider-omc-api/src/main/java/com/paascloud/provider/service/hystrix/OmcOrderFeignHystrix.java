/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：OmcOrderFeignHystrix.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.service.hystrix;

import com.paascloud.provider.model.dto.OrderDto;
import com.paascloud.provider.service.OmcOrderFeignApi;
import com.paascloud.wrapper.Wrapper;
import org.springframework.stereotype.Component;

/**
 * The class Omc order feign hystrix.
 *
 * @author paascloud.net@gmail.com
 */
@Component
public class OmcOrderFeignHystrix implements OmcOrderFeignApi {

	@Override
	public Wrapper updateOrderById(final OrderDto order) {
		return null;
	}
}
