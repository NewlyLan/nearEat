/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：MdcExceptionLogService.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.service;


import com.github.pagehelper.PageInfo;
import com.paascloud.core.support.IService;
import com.paascloud.provider.model.domain.MdcExceptionLog;
import com.paascloud.provider.model.dto.GlobalExceptionLogDto;
import com.paascloud.provider.model.dto.MdcExceptionQueryDto;

/**
 * The interface Mdc exception log service.
 *
 * @author paascloud.net @gmail.com
 */
public interface MdcExceptionLogService extends IService<MdcExceptionLog> {
	/**
	 * 保存日志并发送钉钉消息.
	 *
	 * @param exceptionLogDto the exception log dto
	 */
	void saveAndSendExceptionLog(GlobalExceptionLogDto exceptionLogDto);

	/**
	 * Query exception list with page page info.
	 *
	 * @param mdcExceptionQueryDto the mdc exception query dto
	 *
	 * @return the page info
	 */
	PageInfo queryExceptionListWithPage(MdcExceptionQueryDto mdcExceptionQueryDto);
}
