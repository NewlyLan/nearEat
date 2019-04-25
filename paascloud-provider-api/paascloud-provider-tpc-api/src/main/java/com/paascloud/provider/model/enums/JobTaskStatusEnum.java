/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：JobTaskStatusEnum.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.model.enums;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * The enum Job task status enum.
 *
 * @author paascloud.net @gmail.com
 */
public enum JobTaskStatusEnum {

	/**
	 * 创建任务数据  状态码0
	 */
	TASK_CREATE(0, "创建任务数据"),

	/**
	 * 等待处理 状态码1
	 */
	TASK_WAITING(1, "等待处理"),

	/**
	 * 正在处理中  状态码2
	 */
	TASK_EXETING(2, "正在处理中"),

	/**
	 * 处理成功
	 */
	TASK_SUCCESS(3, "处理成功"),

	/**
	 * 任务异常
	 */
	TASK_FAIL(4, "处理失败"),;

	/**
	 * The Status.
	 */
	int status;
	/**
	 * The Value.
	 */
	String value;

	JobTaskStatusEnum(int status, String value) {
		this.status = status;
		this.value = value;
	}

	/**
	 * Gets status.
	 *
	 * @return the status
	 */
	public int status() {
		return status;
	}

	/**
	 * Gets value.
	 *
	 * @return the value
	 */
	public String value() {
		return value;
	}

	private static List<Integer> getStatusList() {
		List<Integer> list = Lists.newArrayList();
		for (JobTaskStatusEnum ele : JobTaskStatusEnum.values()) {
			list.add(ele.status());
		}
		return list;
	}

	/**
	 * Contains boolean.
	 *
	 * @param status the status
	 *
	 * @return the boolean
	 */
	public static boolean contains(Integer status) {
		List<Integer> statusList = getStatusList();
		return statusList.contains(status);
	}

}
