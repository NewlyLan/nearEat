/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：MdcAddressMapper.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.mapper;

import com.paascloud.core.mybatis.MyMapper;
import com.paascloud.provider.model.domain.MdcAddress;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The interface Mdc address mapper.
 *
 * @author paascloud.net@gmail.com
 */
@Mapper
@Component
public interface MdcAddressMapper extends MyMapper<MdcAddress> {
	/**
	 * Select mdc address list.
	 *
	 * @param address the address
	 *
	 * @return the list
	 */
	List<MdcAddress> selectMdcAddress(MdcAddress address);

	/**
	 * Select address by pid list.
	 *
	 * @param pid the pid
	 *
	 * @return the list
	 */
	List<MdcAddress> selectAddressByPid(Long pid);

}