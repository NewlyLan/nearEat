/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：TpcMqTopicMapper.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.mapper;

import com.paascloud.core.mybatis.MyMapper;
import com.paascloud.provider.model.domain.TpcMqTopic;
import com.paascloud.provider.model.vo.TpcMqTopicVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The interface Tpc mq topic mapper.
 *
 * @author paascloud.net @gmail.com
 */
@Mapper
@Component
public interface TpcMqTopicMapper extends MyMapper<TpcMqTopic> {
	/**
	 * List tpc mq topic vo with page list.
	 *
	 * @param tpcMqTopic the tpc mq topic
	 *
	 * @return the list
	 */
	List<TpcMqTopicVo> listTpcMqTopicVoWithPage(TpcMqTopic tpcMqTopic);
}