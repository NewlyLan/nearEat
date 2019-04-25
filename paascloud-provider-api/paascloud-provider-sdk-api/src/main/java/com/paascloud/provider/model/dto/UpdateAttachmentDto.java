/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：UpdateAttachmentDto.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.model.dto;


import com.paascloud.base.dto.LoginAuthDto;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 更新福建表.
 *
 * @author paascloud.net @gmail.com
 */
@Data
@AllArgsConstructor
public class UpdateAttachmentDto implements Serializable {
	private static final long serialVersionUID = -768471033009336091L;

	public UpdateAttachmentDto() {

	}

	private String refNo;
	/**
	 * 商品图片流水号集合
	 */
	private List<Long> attachmentIdList;

	/**
	 * 操作人信息
	 */
	private LoginAuthDto loginAuthDto;
}
