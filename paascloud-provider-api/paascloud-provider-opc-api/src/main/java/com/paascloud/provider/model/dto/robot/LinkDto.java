/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：LinkDto.java
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
 * The class Link dto.
 *
 * @author paascloud.net @gmail.com
 */
@Data
@ApiModel(value = "link类型")
public class LinkDto implements Serializable {
	private static final long serialVersionUID = 414254079011512757L;
	@ApiModelProperty(value = "消息标题", required = true)
	private String title;
	@ApiModelProperty(value = "消息内容。如果太长只会部分展示", required = true)
	private String text;
	@ApiModelProperty(value = "点击消息跳转的URL", required = true)
	private String messageUrl;
	@ApiModelProperty(value = "图片URL")
	private String picUrl;
}
