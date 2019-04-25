/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：ThreadLocalMap.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;


/**
 * The class Thread local map.
 *
 * @author paascloud.net@gmail.com
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ThreadLocalMap {
	/**
	 * The constant threadContext.
	 */
	private final static ThreadLocal<Map<String, Object>> THREAD_CONTEXT = new MapThreadLocal();

	/**
	 * Put.
	 *
	 * @param key   the key
	 * @param value the value
	 */
	public static void put(String key, Object value) {
		getContextMap().put(key, value);
	}

	/**
	 * Remove object.
	 *
	 * @param key the key
	 *
	 * @return the object
	 */
	public static Object remove(String key) {
		return getContextMap().remove(key);
	}

	/**
	 * Get object.
	 *
	 * @param key the key
	 *
	 * @return the object
	 */
	public static Object get(String key) {
		return getContextMap().get(key);
	}

	private static class MapThreadLocal extends ThreadLocal<Map<String, Object>> {
		/**
		 * Initial value map.
		 *
		 * @return the map
		 */
		@Override
		protected Map<String, Object> initialValue() {
			return new HashMap<String, Object>(8) {

				private static final long serialVersionUID = 3637958959138295593L;

				@Override
				public Object put(String key, Object value) {
					return super.put(key, value);
				}
			};
		}
	}

	/**
	 * 取得thread context Map的实例。
	 *
	 * @return thread context Map的实例
	 */
	private static Map<String, Object> getContextMap() {
		return THREAD_CONTEXT.get();
	}

	/**
	 * 清理线程所有被hold住的对象。以便重用！
	 */
	public static void remove() {
		getContextMap().clear();
	}
}