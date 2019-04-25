/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：MdcAddressService.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.service;

import com.paascloud.provider.model.dto.AddressDTO;

/**
 * The interface Omc order service.
 *
 * @author paascloud.net@gmail.com
 */
public interface MdcAddressService {
	/**
	 * Gets address by id.
	 *
	 * @param addressId the address id
	 *
	 * @return the address by id
	 */
	AddressDTO getAddressById(Long addressId);
}
