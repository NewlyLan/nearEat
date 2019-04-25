/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：OptAttachmentMapper.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.mapper;

import com.paascloud.core.mybatis.MyMapper;
import com.paascloud.provider.model.domain.OptAttachment;
import com.paascloud.provider.model.dto.attachment.OptAttachmentReqDto;
import com.paascloud.provider.model.dto.attachment.OptAttachmentRespDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The interface Opt attachment mapper.
 *
 * @author paascloud.net @gmail.com
 */
@Mapper
@Component
public interface OptAttachmentMapper extends MyMapper<OptAttachment> {
	/**
	 * Query attachment list.
	 *
	 * @param optAttachmentReqDto the opt attachment req dto
	 *
	 * @return the list
	 */
	List<OptAttachmentRespDto> queryAttachment(OptAttachmentReqDto optAttachmentReqDto);

	/**
	 * Query attachment by ref no list.
	 *
	 * @param refNo the ref no
	 *
	 * @return the list
	 */
	List<Long> queryAttachmentByRefNo(@Param("refNo") String refNo);

	/**
	 * Delete by id list int.
	 *
	 * @param attachmentIdList the attachment id list
	 *
	 * @return the int
	 */
	int deleteByIdList(@Param("idList") List<Long> attachmentIdList);

	/**
	 * List expire file list.
	 *
	 * @return the list
	 */
	List<OptAttachment> listExpireFile();
}