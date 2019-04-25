/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：MdcAddressRest.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.web.frontend;


import com.paascloud.TreeNode;
import com.paascloud.provider.service.MdcAddressService;
import com.paascloud.core.support.BaseController;
import com.paascloud.wrapper.WrapMapper;
import com.paascloud.wrapper.Wrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * The class Mdc address rest.
 *
 * @author paascloud.net@gmail.com
 */
@RestController
@RequestMapping(value = "/address", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Api(value = "WEB - MdcAddressRest", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MdcAddressRest extends BaseController {

	@Resource
	private MdcAddressService mdcAddressService;


	/**
	 * Gets 4 city.
	 *
	 * @return the 4 city
	 */
	@PostMapping(value = "/get4City")
	@ApiOperation(httpMethod = "POST", value = "查看四级地址")
	public Wrapper<List<TreeNode>> get4City() {
		logger.info("get4City - 获取四级地址");
		List<TreeNode> treeNodeList = mdcAddressService.get4City();
		return WrapMapper.ok(treeNodeList);
	}

}
