/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：OptUpdateAttachmentReqDto.java
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
 * The class Opt update attachment req dto.
 *
 * @author paascloud.net@gmail.com
 */
@Data
public class OptUpdateAttachmentReqDto implements Serializable {

	private static final long serialVersionUID = -1727131719075160349L;

	/**
	 * 附件流水号
	 */
	private String serialNo;

	/**
	 * 上传附件的相关业务流水号
	 */
	private String refNo;

	private Long userId;

	private String userName;

}
