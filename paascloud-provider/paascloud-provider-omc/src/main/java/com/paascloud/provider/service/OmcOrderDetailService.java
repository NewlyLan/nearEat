/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：OmcOrderDetailService.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.service;

import com.paascloud.core.support.IService;
import com.paascloud.provider.model.domain.OmcOrderDetail;

import java.util.List;

/**
 * The interface Omc order detail service.
 *
 * @author paascloud.net@gmail.com
 */
public interface OmcOrderDetailService extends IService<OmcOrderDetail> {
	/**
	 * 获取用户订单详情.
	 *
	 * @param orderNo the order no
	 * @param userId  the user id
	 *
	 * @return the list by order no user id
	 */
	List<OmcOrderDetail> getListByOrderNoUserId(String orderNo, Long userId);

	/**
	 * Gets list by order no.
	 *
	 * @param orderNo the order no
	 *
	 * @return the list by order no
	 */
	List<OmcOrderDetail> getListByOrderNo(String orderNo);

	/**
	 * Batch insert order detail.
	 *
	 * @param omcOrderDetailList the omc order detail list
	 */
	void batchInsertOrderDetail(List<OmcOrderDetail> omcOrderDetailList);
}