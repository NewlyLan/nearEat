/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：ElementImgUrlDto.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.model.dto.oss;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * The class Element img url dto.
 *
 * @author paascloud.net @gmail.com
 */
@Data
@AllArgsConstructor
public class ElementImgUrlDto implements Serializable {
	public ElementImgUrlDto() {
	}

	private static final long serialVersionUID = -5800852605728871320L;
	/**
	 * 图片完整地址
	 */
	private String url;
	/**
	 * 图片名称
	 */
	private String name;
	/**
	 * 图片关联的附件ID
	 */
	private Long attachmentId;
}
