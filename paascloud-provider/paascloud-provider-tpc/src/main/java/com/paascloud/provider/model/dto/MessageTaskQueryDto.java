/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：MessageTaskQueryDto.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.model.dto;


import lombok.Data;

/**
 * The class Message task query dto.
 *
 * @author paascloud.net @gmail.com
 */
@Data
public class MessageTaskQueryDto {
	private int yn;
	private Integer taskStatus;
	private int messageStatus;
	private int fetchNum;
	private int shardingItem;
	private int shardingTotalCount;
	private String producerGroup;
	private String createTimeBefore;

}
