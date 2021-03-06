/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：OpcGaodeFeignApi.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.service;

import com.paascloud.provider.model.dto.gaode.GaodeLocation;
import com.paascloud.provider.service.hystrix.OpcGaodeFeignApiHystrix;
import com.paascloud.security.feign.OAuth2FeignAutoConfiguration;
import com.paascloud.wrapper.Wrapper;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * The interface Opc gao feign api.
 *
 * @author paascloud.net @gmail.com
 */
@FeignClient(value = "paascloud-provider-opc", configuration = OAuth2FeignAutoConfiguration.class, fallback = OpcGaodeFeignApiHystrix.class)
public interface OpcGaodeFeignApi {

	/**
	 * IP定位.
	 *
	 * @param ipAddr the ip addr
	 *
	 * @return the location by ip addr
	 */
	@PostMapping(value = "/api/auth/getLocationByIpAddr")
	Wrapper<GaodeLocation> getLocationByIpAddr(@RequestParam("ipAddr") String ipAddr);
}
