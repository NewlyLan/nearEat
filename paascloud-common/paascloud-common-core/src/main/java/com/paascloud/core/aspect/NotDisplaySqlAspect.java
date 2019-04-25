/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：NotDisplaySqlAspect.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.core.aspect;

import com.paascloud.ThreadLocalMap;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * The class Not display sql aspect.
 *
 * @author paascloud.net @gmail.com
 */
@Aspect
@Component
public class NotDisplaySqlAspect {
	/**
	 * The constant DISPLAY_SQL.
	 */
	public static final String DISPLAY_SQL = "DISPLAY_SQL";

	@Pointcut("@annotation(com.paascloud.core.annotation.NotDisplaySql)")
	private void myPointCut() {
	}

	/**
	 * Before.
	 */
	@Before(value = "myPointCut()")
	public void before() {
		ThreadLocalMap.put(DISPLAY_SQL, Boolean.FALSE);
	}

	/**
	 * After.
	 */
	@After(value = "myPointCut()")
	public void after() {
		ThreadLocalMap.remove(DISPLAY_SQL);
	}
}
