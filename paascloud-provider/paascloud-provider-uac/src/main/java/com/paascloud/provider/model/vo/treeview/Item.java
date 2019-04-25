/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：Item.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.model.vo.treeview;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * The class Item.
 *
 * @author paascloud.net@gmail.com
 */
@Data
@ApiModel
public class Item {

	private Long id;
	/**
	 * 节点的名字
	 */
	private String text;

	/**
	 * 节点的类型："item":文件 "folder":目录
	 */
	private String type;

	/**
	 * 子节点的信息
	 */
	private AdditionalParameters additionalParameters;

}
