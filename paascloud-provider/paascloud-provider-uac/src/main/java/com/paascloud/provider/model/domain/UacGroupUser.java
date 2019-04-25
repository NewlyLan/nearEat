/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：UacGroupUser.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.model.domain;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * The class Uac group user.
 *
 * @author paascloud.net@gmail.com
 */
@Data
@Table(name = "pc_uac_group_user")
@Alias(value = "uacGroupUser")
public class UacGroupUser implements Serializable {
	private static final long serialVersionUID = 5167709959453148144L;

	/**
	 * 角色ID
	 */
	@Column(name = "group_id")
	private Long groupId;

	/**
	 * 菜单ID
	 */
	@Column(name = "user_id")
	private Long userId;
}