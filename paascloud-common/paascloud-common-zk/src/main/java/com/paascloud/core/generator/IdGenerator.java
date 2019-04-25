/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：IdGenerator.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.core.generator;

/**
 * The interface Id generator.
 *
 * @author paascloud.net @gmail.com
 */
public interface IdGenerator {

	/**
	 * 生成下一个ID
	 *
	 * @return the string
	 */
	Long nextId();
}
