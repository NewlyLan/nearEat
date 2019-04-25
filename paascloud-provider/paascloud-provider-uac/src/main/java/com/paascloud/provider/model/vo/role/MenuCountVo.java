/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：MenuCountVo.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.model.vo.role;

import lombok.Data;

/**
 * 一级菜单下绑定子菜单个数
 *
 * @author paascloud.net @gmail.com
 */
@Data
public class MenuCountVo {

	/**
	 * 一级菜单id
	 */
	private Long id;

	/**
	 * 一级菜单名称
	 */
	private String menuName;

	/**
	 * 一级菜单下绑定子菜单个数
	 */
	private int childNum;

	/**
	 * Equals boolean.
	 *
	 * @param obj the obj
	 *
	 * @return the boolean
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		} else {
			if (obj instanceof MenuCountVo) {
				MenuCountVo m = (MenuCountVo) obj;
				if (m.id.equals(this.id)) {
					return true;
				}
			}

			return false;
		}
	}

	/**
	 * Hash code int.
	 *
	 * @return the int
	 */
	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
