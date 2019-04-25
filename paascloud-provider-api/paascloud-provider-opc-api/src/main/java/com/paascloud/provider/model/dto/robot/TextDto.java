/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：TextDto.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.model.dto.robot;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


/**
 * The class Text dto.
 *
 * @author paascloud.net @gmail.com
 */
@Data
@ApiModel(value = "text类型")
public class TextDto implements Serializable {
	private static final long serialVersionUID = 8825625125019746717L;
	@ApiModelProperty(value = "消息内容", required = true)
	private String content;
}
