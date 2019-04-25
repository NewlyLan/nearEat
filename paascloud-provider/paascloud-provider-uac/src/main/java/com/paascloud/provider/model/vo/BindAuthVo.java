/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：BindAuthVo.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.model.vo;


import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;

/**
 * The class Bind auth vo.
 *
 * @author paascloud.net @gmail.com
 */
@Data
@ApiModel
public class BindAuthVo {
	/**
	 * 包含按钮权限和菜单权限
	 */
	private List<MenuVo> authTree;
	/**
	 * 该角色含有的权限ID
	 */
	private List<Long> checkedAuthList;
}
