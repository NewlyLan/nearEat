/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：QiniuProperties.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.config.properties;

import lombok.Data;

/**
 * The class Qiniu oss properties.
 *
 * @author paascloud.net@gmail.com
 */
@Data
public class QiniuProperties {
	private QiniuKeyProperties key = new QiniuKeyProperties();
	private QiniuOssProperties oss = new QiniuOssProperties();

	@Data
	public class QiniuKeyProperties {
		private String accessKey;
		private String secretKey;
	}

	@Data
	public class QiniuOssProperties {
		private String privateHost;
		private String publicHost;
		private Long fileMaxSize;
	}
}
