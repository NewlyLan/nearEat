/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：ProductCategoryDto.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;
import java.util.List;

/**
 * The class Product category dto.
 *
 * @author paascloud.net@gmail.com
 */
@Data
@ApiModel
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ProductCategoryDto implements Serializable {
	private static final long serialVersionUID = -5217129132596232253L;
	@ApiModelProperty(value = "类别ID")
	private Long categoryId;
	@ApiModelProperty(value = "类别名称")
	private String categoryName;
	@ApiModelProperty(value = "首图URL")
	private String imgUrl;

	private List<ProductCategoryDto> categoryList;

}
