/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：SpringSocialConfigurerPostProcessor.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.security.app.social;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import com.paascloud.security.core.properties.SecurityConstants;
import com.paascloud.security.core.social.support.PcSpringSocialConfigurer;


/**
 * The class Spring social configurer post processor.
 *
 * @author paascloud.net@gmail.com
 */
@Component
public class SpringSocialConfigurerPostProcessor implements BeanPostProcessor {

	/**
	 * Post process before initialization object.
	 *
	 * @param bean     the bean
	 * @param beanName the bean name
	 *
	 * @return the object
	 *
	 * @throws BeansException the beans exception
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

	/**
	 * Post process after initialization object.
	 *
	 * @param bean     the bean
	 * @param beanName the bean name
	 *
	 * @return the object
	 *
	 * @throws BeansException the beans exception
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		String pcSocialSecurityConfig = "pcSocialSecurityConfig";
		if (StringUtils.equals(beanName, pcSocialSecurityConfig)) {
			PcSpringSocialConfigurer config = (PcSpringSocialConfigurer) bean;
			config.signupUrl(SecurityConstants.DEFAULT_SOCIAL_USER_INFO_URL);
			return config;
		}
		return bean;
	}

}
