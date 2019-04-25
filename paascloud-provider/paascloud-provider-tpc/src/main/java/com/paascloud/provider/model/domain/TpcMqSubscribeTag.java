/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：TpcMqSubscribeTag.java
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
import org.apache.ibatis.type.Alias;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The class Tpc mq consumer tag.
 *
 * @author paascloud.net @gmail.com
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "pc_tpc_mq_subscribe_tag")
@Alias(value = "tpcMqConsumerTag")
public class TpcMqSubscribeTag extends BaseEntity {
	private static final long serialVersionUID = 6227704457895628954L;
	/**
	 * 消费者ID
	 */
	@Id
	@Column(name = "subscribe_id")
	private Long subscribeId;

	/**
	 * TAG_ID
	 */
	@Id
	@Column(name = "tag_id")
	private Long tagId;
}