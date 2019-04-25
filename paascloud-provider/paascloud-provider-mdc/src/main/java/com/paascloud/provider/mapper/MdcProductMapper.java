/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：MdcProductMapper.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.mapper;

import com.paascloud.core.mybatis.MyMapper;
import com.paascloud.provider.model.domain.MdcProduct;
import com.paascloud.provider.model.dto.ProductDto;
import com.paascloud.provider.model.vo.ProductVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The interface Mdc product mapper.
 *
 * @author paascloud.net @gmail.com
 */
@Mapper
@Component
public interface MdcProductMapper extends MyMapper<MdcProduct> {
	/**
	 * Select by name and category ids list.
	 *
	 * @param productName    the product name
	 * @param categoryIdList the category id list
	 * @param orderBy        the order by
	 *
	 * @return the list
	 */
	List<MdcProduct> selectByNameAndCategoryIds(@Param("productName") String productName,
	                                            @Param("categoryIdList") List<Long> categoryIdList,
	                                            @Param("orderBy") String orderBy);

	/**
	 * Update product stock by id int.
	 *
	 * @param productDto the product dto
	 *
	 * @return the int
	 */
	int updateProductStockById(ProductDto productDto);

	/**
	 * Query product list with page list.
	 *
	 * @param mdcProduct the mdc product
	 *
	 * @return the list
	 */
	List<ProductVo> queryProductListWithPage(MdcProduct mdcProduct);
}