/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：MdcEditDictDto.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.model.dto;


import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * The class Mdc edit dict dto.
 *
 * @author paascloud.net @gmail.com
 */
@Data
@ApiModel
public class MdcEditDictDto implements Serializable {
	private static final long serialVersionUID = 3530155770606863044L;
	/**
	 * 字典类型 -0 常量 - 1 文件夹
	 */
	private Integer type;

	/**
	 * 枚举编码
	 */
	private String dictKey;

	/**
	 * 枚举扩展字段
	 */
	private String extendKey;

	/**
	 * 枚举值
	 */
	private String dictValue;

	/**
	 * 字典编码
	 */
	private String dictCode;

	/**
	 * 字典名称
	 */
	private String dictName;

	/**
	 * ID
	 */
	private Long id;

	/**
	 * 父ID
	 */
	private Long pid;

	/**
	 * 序号
	 */
	private Integer number;

	/**
	 * 状态
	 */
	private Integer status;

	/**
	 * 备注
	 */
	private String remark;
}
