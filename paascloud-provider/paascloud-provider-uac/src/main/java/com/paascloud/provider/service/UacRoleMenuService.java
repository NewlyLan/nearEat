/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：UacRoleMenuService.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.service;

import com.paascloud.provider.model.domain.UacRoleMenu;
import com.paascloud.core.support.IService;

import java.util.List;
import java.util.Set;


/**
 * The interface Uac role menu service.
 *
 * @author paascloud.net @gmail.com
 */
public interface UacRoleMenuService extends IService<UacRoleMenu> {
	/**
	 * Del role menu list int.
	 *
	 * @param uacRoleMenus the uac role menus
	 *
	 * @return the int
	 */
	int delRoleMenuList(Set<UacRoleMenu> uacRoleMenus);

	/**
	 * Delete by role id.
	 *
	 * @param roleId the role id
	 */
	void deleteByRoleId(Long roleId);

	/**
	 * List by role id list.
	 *
	 * @param roleId the role id
	 *
	 * @return the list
	 */
	List<UacRoleMenu> listByRoleId(Long roleId);

	/**
	 * Insert.
	 *
	 * @param roleId     the role id
	 * @param menuIdList the menu id list
	 */
	void insert(Long roleId, Set<Long> menuIdList);

	/**
	 * Delete by role id list.
	 *
	 * @param roleIdList the role id list
	 */
	void deleteByRoleIdList(List<Long> roleIdList);
}
