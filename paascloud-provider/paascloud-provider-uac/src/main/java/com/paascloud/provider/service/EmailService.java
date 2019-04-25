/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：EmailService.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.service;

import com.paascloud.provider.model.dto.email.SendEmailMessage;

/**
 * The interface Email service.
 *
 * @author paascloud.net @gmail.com
 */
public interface EmailService {
	/**
	 * 重置密码发送邮件.
	 *
	 * @param email the email
	 */
	void submitResetPwdEmail(String email);

	/**
	 * 发送验证码
	 *
	 * @param sendEmailMessage the send email message
	 * @param loginName        the login name
	 */
	void sendEmailCode(SendEmailMessage sendEmailMessage, String loginName);

	/**
	 * 校验验证码 返回 token 用户最后修改密码使用
	 *
	 * @param sendEmailMessage the send email message
	 * @param loginName        the login name
	 */
	void checkEmailCode(SendEmailMessage sendEmailMessage, String loginName);
}
