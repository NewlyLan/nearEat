/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：TpcMqProducerMapper.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.mapper;

import com.paascloud.core.mybatis.MyMapper;
import com.paascloud.provider.model.domain.TpcMqProducer;
import com.paascloud.provider.model.vo.TpcMqProducerVo;
import com.paascloud.provider.model.vo.TpcMqPublishVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The interface Tpc mq producer mapper.
 *
 * @author paascloud.net @gmail.com
 */
@Mapper
@Component
public interface TpcMqProducerMapper extends MyMapper<TpcMqProducer> {

	/**
	 * 查询生产者集合.
	 *
	 * @param tpcMqProducer the tpc mq producer
	 *
	 * @return the list
	 */
	List<TpcMqProducerVo> listTpcMqProducerVoWithPage(TpcMqProducer tpcMqProducer);

	/**
	 * 查询发布消息集合.
	 *
	 * @param tpcMqProducer the tpc mq producer
	 *
	 * @return the list
	 */
	List<TpcMqPublishVo> listTpcMqPublishVoWithPage(TpcMqProducer tpcMqProducer);

	/**
	 * Delete publish by producer id int.
	 *
	 * @param producerId the producer id
	 *
	 * @return the int
	 */
	int deletePublishByProducerId(@Param("producerId") Long producerId);

	/**
	 * Gets by pid.
	 *
	 * @param producerGroup the producer group
	 *
	 * @return the by pid
	 */
	TpcMqProducer getByPid(@Param("pid") String producerGroup);

}