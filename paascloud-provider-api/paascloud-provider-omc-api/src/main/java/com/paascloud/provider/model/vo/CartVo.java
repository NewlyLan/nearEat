/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：CartVo.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.model.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * The class Cart vo.
 *
 * @author paascloud.net@gmail.com
 */
@Data
public class CartVo implements Serializable {

	private static final long serialVersionUID = -7852680577412931768L;
	private List<CartProductVo> cartProductVoList;
	private BigDecimal cartTotalPrice;
	/**
	 * 是否已经都勾选
	 */
	private Boolean allChecked;
	private String imageHost;
}
