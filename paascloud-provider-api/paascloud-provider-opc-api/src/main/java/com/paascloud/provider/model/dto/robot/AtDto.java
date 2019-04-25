/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：AtDto.java
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
 * The class At dto.
 *
 * @author paascloud.net @gmail.com
 */
@Data
@ApiModel(value = "AtDto")
public class AtDto implements Serializable {
	private static final long serialVersionUID = 2344037651462081640L;
	/**
	 * 被@人的手机号
	 */
	@ApiModelProperty(value = "被@人的手机号")
	private String[] atMobiles;
	/**
	 * \@所有人时:true,否则为:false
	 */
	@ApiModelProperty(value = "@所有人时:true,否则为:false")
	private boolean isAtAll;
}
