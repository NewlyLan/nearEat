/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：ITree.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.core.support;

import com.paascloud.base.dto.BaseTree;

import java.io.Serializable;
import java.util.List;

/**
 * The interface Tree interface.
 *
 * @param <T>  the type parameter
 * @param <ID> the type parameter
 *
 * @author paascloud.net @gmail.com
 */
public interface ITree<T extends BaseTree<T, ID>, ID extends Serializable> {
	/**
	 * 获得指定节点下所有归档
	 *
	 * @param list     the list
	 * @param parentId the parent id
	 *
	 * @return the child tree objects
	 */
	List<T> getChildTreeObjects(List<T> list, ID parentId);

	/**
	 * 递归列表
	 *
	 * @param list the list
	 * @param t    the t
	 */
	void recursionFn(List<T> list, T t);

	/**
	 * 获得指定节点下的所有子节点
	 *
	 * @param list the list
	 * @param t    the t
	 *
	 * @return the child list
	 */
	List<T> getChildList(List<T> list, T t);

	/**
	 * 判断是否还有下一个子节点
	 *
	 * @param list the list
	 * @param t    the t
	 *
	 * @return the boolean
	 */
	boolean hasChild(List<T> list, T t);
}