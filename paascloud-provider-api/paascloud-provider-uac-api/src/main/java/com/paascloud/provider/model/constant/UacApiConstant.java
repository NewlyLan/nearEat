/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：UacApiConstant.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.model.constant;


import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * The class Uac api constant.
 *
 * @author paascloud.net@gmail.com
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UacApiConstant {
	/**
	 * token变量
	 */
	@NoArgsConstructor(access = AccessLevel.PRIVATE)
	public static final class Valid {
		/**
		 * The constant EMAIL.
		 */
		public static final String EMAIL = "email";
		/**
		 * The constant LOGIN_NAME.
		 */
		public static final String LOGIN_NAME = "loginName";
		/**
		 * The constant MOBILE_NO.
		 */
		public static final String MOBILE_NO = "mobileNo";
	}
}
