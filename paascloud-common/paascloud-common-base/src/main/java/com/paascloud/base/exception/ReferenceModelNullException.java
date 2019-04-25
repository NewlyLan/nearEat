/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：ReferenceModelNullException.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */
package com.paascloud.base.exception;

/**
 * The class Reference model null exception.
 *
 * @author paascloud.net@gmail.com
 */
public class ReferenceModelNullException extends RuntimeException {
	private static final long serialVersionUID = -318154770875589045L;

	/**
	 * Instantiates a new Reference model null exception.
	 *
	 * @param message the message
	 */
	public ReferenceModelNullException(String message) {
		super(message);
	}
}
