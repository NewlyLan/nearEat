/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：PcSendSmsRequest.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * The class Pc send sms request.
 *
 * @author paascloud.net@gmail.com
 */
@Data
public class PcSendSmsRequest implements Serializable {

	private static final long serialVersionUID = 8391763073747981998L;

	private String phoneNumbers;
	private String templateCode;
	private String templateParam;
	private String outId;
}
