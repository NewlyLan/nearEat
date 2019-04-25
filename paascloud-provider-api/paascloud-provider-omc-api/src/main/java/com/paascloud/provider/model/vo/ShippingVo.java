/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：ShippingVo.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.model.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * The class Shipping vo.
 *
 * @author paascloud.net@gmail.com
 */
@Data
public class ShippingVo implements Serializable {
	private static final long serialVersionUID = 1650395734521093800L;
	private String receiverName;

	private String receiverPhone;

	private String receiverMobile;

	private String receiverProvince;

	private String receiverCity;

	private String receiverDistrict;

	private String receiverAddress;

	private String receiverZip;
}
