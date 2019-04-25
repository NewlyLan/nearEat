/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：KvDto.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */
package com.paascloud.base.dto;


import lombok.Data;

import java.io.Serializable;

/**
 * The class Kv dto.
 *
 * @author paascloud.net@gmail.com
 */
@Data
public class KvDto<K, V> implements Serializable {

	private static final long serialVersionUID = -7712636075929650779L;

	/**
	 * Instantiates a new Kv dto.
	 */
	public KvDto() {
	}

	/**
	 * Instantiates a new Kv dto.
	 *
	 * @param key   the key
	 * @param value the value
	 */
	public KvDto(K key, V value) {
		this.key = key;
		this.value = value;
	}

	/**
	 * key
	 */
	private K key;
	/**
	 * value
	 */
	private V value;

}
