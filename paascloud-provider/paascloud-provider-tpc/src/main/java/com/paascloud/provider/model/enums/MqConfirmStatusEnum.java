/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：MqConfirmStatusEnum.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.model.enums;

/**
 * The enum Mq confirm status enum.
 *
 * @author paascloud.net @gmail.com
 */
public enum MqConfirmStatusEnum {
	/**
	 * 未确认.
	 */
	UN_CONFIRMED(10, "未确认"),

	/**
	 * 已确认.
	 */
	CONFIRMED(20, "已确认"),

	/**
	 * 已消费
	 */
	CONSUMED(30, "已消费");

	private int confirmStatus;

	private String value;

	MqConfirmStatusEnum(int confirmStatus, String value) {
		this.confirmStatus = confirmStatus;
		this.value = value;
	}

	/**
	 * Confirm status int.
	 *
	 * @return the int
	 */
	public int confirmStatus() {
		return confirmStatus;
	}

	/**
	 * Value string.
	 *
	 * @return the string
	 */
	public String value() {
		return value;
	}

}
