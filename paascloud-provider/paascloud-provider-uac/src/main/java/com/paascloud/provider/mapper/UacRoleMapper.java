/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：UacRoleMapper.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.mapper;

import com.paascloud.core.mybatis.MyMapper;
import com.paascloud.provider.model.domain.UacRole;
import com.paascloud.provider.model.dto.role.BindUserDto;
import com.paascloud.provider.model.vo.RoleVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The interface Uac role mapper.
 *
 * @author paascloud.net@gmail.com
 */
@Mapper
@Component
public interface UacRoleMapper extends MyMapper<UacRole> {
	/**
	 * Find by role code uac role.
	 *
	 * @param roleCode the role code
	 *
	 * @return the uac role
	 */
	UacRole findByRoleCode(String roleCode);

	/**
	 * Query role list with page list.
	 *
	 * @param role the role
	 *
	 * @return the list
	 */
	List<RoleVo> queryRoleListWithPage(UacRole role);

	/**
	 * Select all role info by user id list.
	 *
	 * @param userId the user id
	 *
	 * @return the list
	 */
	List<UacRole> selectAllRoleInfoByUserId(Long userId);

	/**
	 * Select role list list.
	 *
	 * @param uacRole the uac role
	 *
	 * @return the list
	 */
	List<UacRole> selectRoleList(UacRole uacRole);

	/**
	 * Batch delete by id list int.
	 *
	 * @param idList the id list
	 *
	 * @return the int
	 */
	int batchDeleteByIdList(@Param("idList") List<Long> idList);

	/**
	 * Select all need bind user list.
	 *
	 * @param superManagerRoleId the super manager role id
	 * @param currentUserId      the current user id
	 *
	 * @return the list
	 */
	List<BindUserDto> selectAllNeedBindUser(@Param("superManagerRoleId") Long superManagerRoleId, @Param("currentUserId") Long currentUserId);
}