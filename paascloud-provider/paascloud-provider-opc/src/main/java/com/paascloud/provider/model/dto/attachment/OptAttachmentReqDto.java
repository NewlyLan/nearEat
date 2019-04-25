/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：OptAttachmentReqDto.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.model.dto.attachment;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * The class Opt attachment req dto.
 *
 * @author paascloud.net@gmail.com
 */
@Data
@ApiModel(value = "OptAttachmentReqDto")
public class OptAttachmentReqDto implements Serializable {

	private static final long serialVersionUID = -1727131719075160349L;
	/**
	 * 主键
	 */
	@ApiModelProperty(value = "主键")
	private Long id;

	/**
	 * 附件流水号
	 */
	@ApiModelProperty(value = "附件流水号")
	private String serialNo;

	/**
	 * 上传附件的相关业务流水号
	 */
	@ApiModelProperty(value = "上传附件的相关业务流水号")
	private String refNo;

}
