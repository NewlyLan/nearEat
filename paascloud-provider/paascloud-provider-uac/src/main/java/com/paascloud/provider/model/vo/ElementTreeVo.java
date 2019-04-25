/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：ElementTreeVo.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.model.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * The class Element tree vo.
 *
 * @author paascloud.net@gmail.com
 */
@Data
public class ElementTreeVo implements Serializable {
	private static final long serialVersionUID = -7266614376023024646L;

	private String label;

	private List<ElementTreeVo> children;
}
