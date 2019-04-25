/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：UpdateStatusDto.java
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
 * The class Modify status dto.
 *
 * @author paascloud.net@gmail.com
 */
@Data
@ApiModel(value = "更改状态")
public class UpdateStatusDto implements Serializable {

	private static final long serialVersionUID = 1494899235149813850L;
	/**
	 * 角色ID
	 */
	@ApiModelProperty(value = "角色ID")
	private Long id;

	/**
	 * 状态
	 */
	@ApiModelProperty(value = "状态")
	private Integer status;
}
