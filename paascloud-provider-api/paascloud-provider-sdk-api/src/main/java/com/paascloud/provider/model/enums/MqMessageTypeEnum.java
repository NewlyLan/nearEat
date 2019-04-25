/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：MqMessageTypeEnum.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.model.enums;

/**
 * The enum Mq message type enum.
 *
 * @author paascloud.net @gmail.com
 */
public enum MqMessageTypeEnum {
	/**
	 * 生产者.
	 */
	PRODUCER_MESSAGE(10, "生产者"),
	/**
	 * 消费者.
	 */
	CONSUMER_MESSAGE(20, "消费者");

	private int messageType;

	private String value;

	MqMessageTypeEnum(int messageType, String value) {
		this.messageType = messageType;
		this.value = value;
	}

	/**
	 * Message type int.
	 *
	 * @return the int
	 */
	public int messageType() {
		return messageType;
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
