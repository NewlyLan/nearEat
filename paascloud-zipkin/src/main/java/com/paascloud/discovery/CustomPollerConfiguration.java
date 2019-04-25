/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：CustomPollerConfiguration.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.discovery;

import org.springframework.cloud.sleuth.Sampler;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.cloud.sleuth.stream.StreamSpanReporter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.scheduling.PollerMetadata;
import org.springframework.scheduling.support.PeriodicTrigger;

/**
 * The class Custom poller configuration.
 *
 * @author paascloud.net@gmail.com
 */
@Configuration
public class CustomPollerConfiguration {
	/**
	 * Custom poller poller metadata.
	 *
	 * @return the poller metadata
	 */
	@Bean(name = StreamSpanReporter.POLLER)
	PollerMetadata customPoller() {
		PollerMetadata poller = new PollerMetadata();
		poller.setMaxMessagesPerPoll(500);
		poller.setTrigger(new PeriodicTrigger(5000L));
		return poller;
	}

	@Bean
	public Sampler defaultSampler() {
		return  new AlwaysSampler();
	}
}
