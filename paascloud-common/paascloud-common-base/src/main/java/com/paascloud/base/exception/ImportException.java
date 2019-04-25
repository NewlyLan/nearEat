/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：ImportException.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */
package com.paascloud.base.exception;


/**
 * The class Import exception.
 *
 * @author paascloud.net@gmail.com
 */
public class ImportException extends RuntimeException {

	private static final long serialVersionUID = -4740091660440744697L;

	/**
	 * Instantiates a new Import exception.
	 *
	 * @param message the message
	 */
	public ImportException(String message) {
		super(message);
	}
}
