/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：UacLogMapper.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.mapper;

import com.paascloud.core.mybatis.MyMapper;
import com.paascloud.provider.model.domain.UacLog;
import com.paascloud.provider.model.dto.log.UacLogMainDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The interface Uac log mapper.
 *
 * @author paascloud.net @gmail.com
 */
@Mapper
@Component
public interface UacLogMapper extends MyMapper<UacLog> {
	/**
	 * Select user log list with user id list.
	 *
	 * @param userId the user id
	 *
	 * @return the list
	 */
	List<UacLog> selectUserLogListByUserId(@Param("userId") Long userId);

	/**
	 * Query log list with page list.
	 *
	 * @param uacLogQueryDtoPage the uac log query dto page
	 *
	 * @return the list
	 */
	List<UacLog> queryLogListWithPage(UacLogMainDto uacLogQueryDtoPage);
}