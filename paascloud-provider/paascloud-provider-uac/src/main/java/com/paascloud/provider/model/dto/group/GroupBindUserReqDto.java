/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：GroupBindUserReqDto.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.model.dto.group;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;


/**
 * The class Group bind user req dto.
 *
 * @author paascloud.net@gmail.com
 */
@Data
@ApiModel(value = "GroupBindUserReqDto")
public class GroupBindUserReqDto implements Serializable {
	private static final long serialVersionUID = 89217138744995863L;

	@ApiModelProperty(value = "组织ID")
	private Long groupId;

	@ApiModelProperty(value = "用户id")
	private List<Long> userIdList;
}
