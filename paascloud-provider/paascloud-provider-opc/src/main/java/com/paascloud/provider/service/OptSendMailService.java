/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：OptSendMailService.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.service;

import java.util.Map;
import java.util.Set;

/**
 * The interface Opt send mail service.
 *
 * @author paascloud.net@gmail.com
 */
public interface OptSendMailService {
	/**
	 * Send simple mail int.
	 *
	 * @param subject the subject
	 * @param text    the text
	 * @param to      the to
	 *
	 * @return the int
	 */
	int sendSimpleMail(String subject, String text, Set<String> to);

	/**
	 * Send template mail int.
	 *
	 * @param subject the subject
	 * @param text    the text
	 * @param to      the to
	 *
	 * @return the int
	 */
	int sendTemplateMail(String subject, String text, Set<String> to);

	/**
	 * Send template mail int.
	 *
	 * @param model            the model
	 * @param templateLocation the template location
	 * @param subject          the subject
	 * @param to               the to
	 *
	 * @return the int
	 */
	int sendTemplateMail(Map<String, Object> model, String templateLocation, String subject, Set<String> to);
}
