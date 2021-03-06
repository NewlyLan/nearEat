/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：UrlUtil.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud;

import lombok.extern.slf4j.Slf4j;

import java.io.UnsupportedEncodingException;

/**
 * url转码、解码
 *
 * @author paascloud.net @gmail.com
 */
@Slf4j
public class UrlUtil {
	private final static String ENCODE = "GBK";

	/**
	 * URL 解码
	 */
	public static String getURLDecoderString(String str) {
		String result = "";
		if (null == str) {
			return "";
		}
		try {
			result = java.net.URLDecoder.decode(str, ENCODE);
		} catch (UnsupportedEncodingException e) {
			log.error("URL解码失败 ex={}", e.getMessage(), e);
		}
		return result;
	}

	/**
	 * URL 转码
	 */
	public static String getURLEncoderString(String str) {
		String result = "";
		if (null == str) {
			return "";
		}
		try {
			result = java.net.URLEncoder.encode(str, ENCODE);
		} catch (UnsupportedEncodingException e) {
			log.error("URL转码失败 ex={}", e.getMessage(), e);
		}
		return result;
	}
}