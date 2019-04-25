/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：附近有好吃的
 * 类名称：OpcOssFeignApiHystrix.java
 * 创建人：兰龙斌
 * 联系方式：llb7891@163.com
 * 开源地址: https://github.com/NewlyLan/nearbyEat.git
 *
 *
 */

package com.paascloud.provider.service.hystrix;

import com.paascloud.provider.model.dto.oss.*;
import com.paascloud.provider.service.OpcOssFeignApi;
import com.paascloud.wrapper.Wrapper;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * The class Opc oss feign api hystrix.
 *
 * @author paascloud.net@gmail.com
 */
@Component
public class OpcOssFeignApiHystrix implements OpcOssFeignApi {
	@Override
	public Wrapper<OptUploadFileRespDto> uploadFile(final OptUploadFileReqDto optUploadFileReqDto) {
		return null;
	}

	@Override
	public Wrapper<String> getFileUrl(final OptGetUrlRequest optGetUrlRequest) {
		return null;
	}

	@Override
	public Wrapper<List<ElementImgUrlDto>> listFileUrl(final OptBatchGetUrlRequest urlRequest) {
		return null;
	}

	@Override
	public Wrapper<OptUploadFileRespDto> handleFileUpload(final MultipartFile file) {
		return null;
	}

	@Override
	public void deleteExpireFile() {

	}
}
