/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：IdStatusDto.java
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
 * The class Id status dto.
 *
 * @author paascloud.net@gmail.com
 */
@Data
@ApiModel
public class IdStatusDto implements Serializable {
	private static final long serialVersionUID = -1976690893998068416L;

	@ApiModelProperty(value = "用户ID", required = true)
	private Long id;
	@ApiModelProperty(value = "推送状态", required = true)
	private Integer status;
}
