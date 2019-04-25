/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：AdditionalParameters.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.model.vo.treeview;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.Map;

/**
 * The class Additional parameters.
 *
 * @author paascloud.net@gmail.com
 */
@Data
@ApiModel
public class AdditionalParameters {
	/**
	 * 子节点列表
	 */
	private Map<String, Item> children;

	/**
	 * 节点的Id
	 */
	private Long id;

	/**
	 * 是否有选中属性
	 */
	@JsonProperty("item-selected")
	private boolean itemSelected;

}
