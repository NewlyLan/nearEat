/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：MqSendTypeEnum.java
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
public enum MqSendTypeEnum {
	/**
	 * 等待确认.
	 */
	WAIT_CONFIRM,

	/**
	 * 直接发送.
	 */
	SAVE_AND_SEND,

	/**
	 * 直接发送
	 */
	//TODO 消费切口 有问题, 日后修复 暂时不可用
	@Deprecated
	DIRECT_SEND
}
