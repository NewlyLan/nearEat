/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：BooleanParseException.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */
package com.paascloud.base.exception;

/**
 * The class Boolean parse exception.
 *
 * @author paascloud.net@gmail.com
 */
public class BooleanParseException extends RuntimeException {

	/**
	 * Instantiates a new Boolean parse exception.
	 */
	public BooleanParseException() {
		super();
	}

	/**
	 * Instantiates a new Boolean parse exception.
	 *
	 * @param message the message
	 */
	public BooleanParseException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new Boolean parse exception.
	 *
	 * @param message the message
	 * @param cause   the cause
	 */
	public BooleanParseException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new Boolean parse exception.
	 *
	 * @param cause the cause
	 */
	public BooleanParseException(Throwable cause) {
		super(cause);
	}

}
