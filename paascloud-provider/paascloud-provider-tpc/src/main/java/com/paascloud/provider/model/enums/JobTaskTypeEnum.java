/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：JobTaskTypeEnum.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.model.enums;


/**
 * The enum Job task type enum.
 *
 * @author paascloud.net @gmail.com
 */
public enum JobTaskTypeEnum {

	/**
	 * Mq send message job task type enum.
	 */
	MQ_SEND_MESSAGE("MQ_SEND_MESSAGE", "发送可靠消息"),;
	/**
	 * The Type.
	 */
	String type;

	/**
	 * The Value.
	 */
	String value;

	JobTaskTypeEnum(String type, String value) {
		this.type = type;
		this.value = value;
	}

	public String type() {
		return type;
	}

	public String value() {
		return value;
	}

}
