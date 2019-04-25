/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：UacRoleActionService.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.service;

import com.paascloud.provider.model.domain.UacRoleAction;
import com.paascloud.core.support.IService;

import java.util.List;
import java.util.Set;

/**
 * The interface Uac role action service.
 *
 * @author paascloud.net @gmail.com
 */
public interface UacRoleActionService extends IService<UacRoleAction> {
	/**
	 * List by role id list.
	 *
	 * @param roleId the role id
	 *
	 * @return the list
	 */
	List<UacRoleAction> listByRoleId(Long roleId);

	/**
	 * Delete by role id.
	 *
	 * @param roleId the role id
	 */
	void deleteByRoleId(Long roleId);

	/**
	 * Insert.
	 *
	 * @param roleId       the role id
	 * @param actionIdList the action id list
	 */
	void insert(Long roleId, Set<Long> actionIdList);

	/**
	 * Delete by role id list int.
	 *
	 * @param roleIdList the role id list
	 *
	 * @return the int
	 */
	int deleteByRoleIdList(List<Long> roleIdList);
}
