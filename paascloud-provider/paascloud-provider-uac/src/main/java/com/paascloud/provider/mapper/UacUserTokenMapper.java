/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：UacUserTokenMapper.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.mapper;

import com.paascloud.core.mybatis.MyMapper;
import com.paascloud.provider.model.domain.UacUserToken;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * The interface Uac user token mapper.
 *
 * @author paascloud.net @gmail.com
 */
@Mapper
@Component
public interface UacUserTokenMapper extends MyMapper<UacUserToken> {
	/**
	 * Select token list list.
	 *
	 * @param userToken the user token
	 *
	 * @return the list
	 */
	List<UacUserToken> selectTokenList(UacUserToken userToken);

	/**
	 * 超时token更新为离线.
	 *
	 * @param map the map
	 *
	 * @return the int
	 */
	int batchUpdateTokenOffLine(Map<String, Object> map);

	/**
	 * 查询超时token Id 集合.
	 *
	 * @return the list
	 */
	List<Long> listOffLineTokenId();
}