/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：OptAttachmentDeleteReqDto.java
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
 * The class Opt attachment delete req dto.
 *
 * @author paascloud.net@gmail.com
 */
@Data
public class OptAttachmentDeleteReqDto implements Serializable {


	private static final long serialVersionUID = 731160897713227519L;
	private String[] serialNos;
}
