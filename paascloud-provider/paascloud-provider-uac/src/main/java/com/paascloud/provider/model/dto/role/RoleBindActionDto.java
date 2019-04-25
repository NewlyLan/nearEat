/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：RoleBindActionDto.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.model.dto.role;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

/**
 * The class Grant auth role.
 *
 * @author paascloud.net@gmail.com
 */
@Data
@ApiModel
public class RoleBindActionDto implements Serializable {

	private static final long serialVersionUID = -8589698204017834593L;
	/**
	 * 按钮权限
	 */
	@ApiModelProperty(value = "按钮权限")
	private Set<Long> actionIdList;
	/**
	 * 角色Id
	 */
	@ApiModelProperty(value = "角色Id")
	private Long roleId;
}
