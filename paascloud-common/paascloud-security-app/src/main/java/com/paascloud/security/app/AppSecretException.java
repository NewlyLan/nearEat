/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：AppSecretException.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.security.app;

/**
 * The class App secret exception.
 *
 * @author paascloud.net @gmail.com
 */
public class AppSecretException extends RuntimeException {

	private static final long serialVersionUID = -1629364510827838114L;

	/**
	 * Instantiates a new App secret exception.
	 *
	 * @param msg the msg
	 */
	public AppSecretException(String msg) {
		super(msg);
	}

}
