/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：OptGetUrlRequest.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.model.dto.oss;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * The class Opt get url request.
 *
 * @author paascloud.net@gmail.com
 */
@Data
@ApiModel
public class OptGetUrlRequest {
	@ApiModelProperty(value = "附件ID")
	private Long attachmentId;

	@ApiModelProperty(value = "超时时间")
	private Long expires;

	@ApiModelProperty(value = "是否需要解密")
	private boolean encrypt;

	@ApiModelProperty(value = "附件ID集合")
	private List<Long> attachmentIdList;

}
