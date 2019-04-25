/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：MdcProductQueryFeignApi.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.service;

import com.paascloud.annotation.NoNeedAccessAuthentication;
import com.paascloud.provider.model.dto.ProductDto;
import com.paascloud.provider.model.vo.ProductDetailVo;
import com.paascloud.provider.service.hystrix.MdcProductQueryFeignHystrix;
import com.paascloud.security.feign.OAuth2FeignAutoConfiguration;
import com.paascloud.wrapper.Wrapper;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * The interface Mdc product query feign api.
 *
 * @author paascloud.net @gmail.com
 */
@FeignClient(value = "paascloud-provider-mdc", configuration = OAuth2FeignAutoConfiguration.class, fallback = MdcProductQueryFeignHystrix.class)
public interface MdcProductQueryFeignApi {

	/**
	 * 查询商品详情信息.
	 *
	 * @param productId the product id
	 *
	 * @return the product detail
	 */
	@PostMapping(value = "/api/product/getProductDetail/{productId}")
	@NoNeedAccessAuthentication
	Wrapper<ProductDetailVo> getProductDetail(@PathVariable("productId") Long productId);

	/**
	 * Select by id wrapper.
	 *
	 * @param productId the product id
	 *
	 * @return the wrapper
	 */
	@PostMapping(value = "/api/product/selectById/{productId}")
	@NoNeedAccessAuthentication
	Wrapper<ProductDto> selectById(@PathVariable("productId") Long productId);
}
