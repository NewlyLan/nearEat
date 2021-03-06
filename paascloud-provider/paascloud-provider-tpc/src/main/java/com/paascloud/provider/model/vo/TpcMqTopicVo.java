/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：TpcMqTopicVo.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.model.vo;

import com.paascloud.base.dto.BaseVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * The class Tpc mq topic vo.
 *
 * @author paascloud.net @gmail.com
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class TpcMqTopicVo extends BaseVo {
	private static final long serialVersionUID = 3857060544292574468L;

	/**
	 * 生产者名称
	 */
	private String producerName;

	/**
	 * 城市编码
	 */
	private String topicCode;

	/**
	 * 区域编码
	 */
	private String topicName;

	/**
	 * MQ类型, 10 rocketmq 20 kafka
	 */
	private Integer mqType;

	/**
	 * 消息类型, 10 无序消息, 20 无序消息
	 */
	private Integer msgType;

	/**
	 * 状态, 0生效,10,失效
	 */
	private Integer status;

	/**
	 * 备注
	 */
	private String remarks;

	/**
	 * Tag 列表
	 */
	private List<TpcMqTagVo> tagVoList;
}
