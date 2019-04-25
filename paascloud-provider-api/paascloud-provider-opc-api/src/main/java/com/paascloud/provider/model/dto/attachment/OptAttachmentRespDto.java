/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：OptAttachmentRespDto.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.model.dto.attachment;

import lombok.Data;

import java.io.Serializable;

/**
 * The class Opt attachment resp dto.
 *
 * @author paascloud.net@gmail.com
 */
@Data
public class OptAttachmentRespDto implements Serializable {
	private static final long serialVersionUID = 7156713126848745258L;
	private Long id;
	private String serialNo;
	private String refNo;
	private String name;
	private String path;
	private String type;
	private String format;
	private String description;
	/**
	 * 文件服务器根目录
	 */
	private String bucketName;

}
