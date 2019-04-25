/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：UacUserTokenFeignClient.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.web.rpc;

import com.paascloud.core.support.BaseController;
import com.paascloud.provider.model.service.UacUserTokenFeignApi;
import com.paascloud.provider.service.UacUserTokenService;
import com.paascloud.wrapper.Wrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * 用户token.
 *
 * @author paascloud.net @gmail.com
 */
@RestController
@Api(value = "API - UacUserTokenFeignClient", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UacUserTokenFeignClient extends BaseController implements UacUserTokenFeignApi {
	@Resource
	private UacUserTokenService uacUserTokenService;

	@Override
	@ApiOperation(httpMethod = "POST", value = "更新token离线状态")
	public Wrapper<Integer> updateTokenOffLine() {
		int result = uacUserTokenService.batchUpdateTokenOffLine();
		return handleResult(result);
	}
}
