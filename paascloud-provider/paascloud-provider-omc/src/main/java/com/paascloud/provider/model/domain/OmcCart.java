/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：OmcCart.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.model.domain;

import com.paascloud.core.mybatis.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * The class Omc cart.
 *
 * @author paascloud.net@gmail.com
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "pc_omc_cart")
public class OmcCart extends BaseEntity {

	private static final long serialVersionUID = 5333646386138778574L;
	@Column(name = "user_id")
	private Long userId;

	@Column(name = "product_id")
	private Long productId;

	/**
	 * 数量
	 */
	private Integer quantity;

	/**
	 * 是否选择,1=已勾选,0=未勾选
	 */
	private Integer checked;
}