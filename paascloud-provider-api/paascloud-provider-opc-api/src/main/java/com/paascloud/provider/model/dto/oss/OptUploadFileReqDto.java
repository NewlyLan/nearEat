/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：OptUploadFileReqDto.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.model.dto.oss;

import com.paascloud.provider.model.dto.attachment.OptUploadFileByteInfoReqDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * The class Opt upload file req dto.
 *
 * @author paascloud.net @gmail.com
 */
@Data
@ApiModel(value = "OptUploadFileReqDto")
public class OptUploadFileReqDto implements Serializable {

	private static final long serialVersionUID = -8008720269972450739L;
	/**
	 * 文件类型
	 */
	@ApiModelProperty(value = "文件类型")
	private String fileType;
	/**
	 * 文件路径
	 */
	@ApiModelProperty(value = "文件路径")
	private String filePath;
	/**
	 * 文件服务器根目录
	 */
	@ApiModelProperty(value = "文件服务器根目录")
	private String bucketName;
	@ApiModelProperty(value = "用户ID")
	private Long userId;
	@ApiModelProperty(value = "用户名")
	private String userName;
	private OptUploadFileByteInfoReqDto uploadFileByteInfoReqDto;
}
