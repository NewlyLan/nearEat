/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：BindUserRolesDto.java
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
import java.util.List;

/**
 * The class Bind user roles dto.
 *
 * @author paascloud.net@gmail.com
 */
@ApiModel
@Data
public class BindUserRolesDto implements Serializable {

	private static final long serialVersionUID = -9149237379943908522L;
	@ApiModelProperty(value = "角色ID")
	private Long userId;

	@ApiModelProperty(value = "需要绑定的角色ID集合")
	private List<Long> roleIdList;
}
