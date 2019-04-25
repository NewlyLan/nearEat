/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：BaseSocialController.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.security.core.social;

import org.springframework.social.connect.Connection;

import com.paascloud.security.core.social.support.SocialUserInfo;


/**
 * The class Social controller.
 *
 * @author paascloud.net@gmail.com
 */
public abstract class BaseSocialController {

	/**
	 * 根据Connection信息构建SocialUserInfo
	 *
	 * @param connection the connection
	 *
	 * @return social user info
	 */
	protected SocialUserInfo buildSocialUserInfo(Connection<?> connection) {
		SocialUserInfo userInfo = new SocialUserInfo();
		userInfo.setProviderId(connection.getKey().getProviderId());
		userInfo.setProviderUserId(connection.getKey().getProviderUserId());
		userInfo.setNickname(connection.getDisplayName());
		userInfo.setHeadimg(connection.getImageUrl());
		return userInfo;
	}

}
