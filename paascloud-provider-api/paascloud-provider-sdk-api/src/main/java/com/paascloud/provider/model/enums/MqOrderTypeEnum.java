/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：MqOrderTypeEnum.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.model.enums;

/**
 * The enum Mq send type enum.
 *
 * @author paascloud.net @gmail.com
 */
public enum MqOrderTypeEnum {
	/**
	 * 有序.
	 */
	ORDER(1),
	/**
	 * 无序.
	 */
	DIS_ORDER(0);

	/**
	 * The Order type.
	 */
	int orderType;

	MqOrderTypeEnum(final int orderType) {
		this.orderType = orderType;
	}

	/**
	 * Order type int.
	 *
	 * @return the int
	 */
	public int orderType() {
		return orderType;
	}
}
