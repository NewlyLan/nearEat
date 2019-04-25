/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：LoginAuthDto.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */
package com.paascloud.base.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * The class Login auth dto.
 *
 * @author paascloud.net@gmail.com
 */
@Data
@ApiModel(value = "登录人信息")
public class LoginAuthDto implements Serializable {
	private static final long serialVersionUID = -1137852221455042256L;
	@ApiModelProperty(value = "用户ID")
	private Long userId;
	@ApiModelProperty(value = "登录名")
	private String loginName;
	@ApiModelProperty(value = "用户名")
	private String userName;
	@ApiModelProperty(value = "组织ID")
	private Long groupId;
	@ApiModelProperty(value = "组织名称")
	private String groupName;

	public LoginAuthDto() {
	}

	public LoginAuthDto(Long userId, String loginName, String userName) {
		this.userId = userId;
		this.loginName = loginName;
		this.userName = userName;
	}

	public LoginAuthDto(Long userId, String loginName, String userName, Long groupId, String groupName) {
		this.userId = userId;
		this.loginName = loginName;
		this.userName = userName;
		this.groupId = groupId;
		this.groupName = groupName;
	}
}
