/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：ResetPasswordDto.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.model.dto.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 重置密码.
 *
 * @author paascloud.net@gmail.com
 */
@Data
@ApiModel
public class ResetPasswordDto implements Serializable {
	private static final long serialVersionUID = 4762153981220090958L;
	@ApiModelProperty("登录名")
	private String loginName;
	@ApiModelProperty(value = "旧密码")
	private String passwordOld;
	@ApiModelProperty(value = "新密码")
	private String passwordNew;
}
