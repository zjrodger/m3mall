package com.zjrodger.e3mall.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.zjrodger.e3mall.common.util.FastDFSClient;

/**
 * 图片上传处理Controller
 * @Author: jian.zhang
 * @Date 2018年1月16日
 */
@Controller
public class PictureController {
	
	private static Logger logger = LoggerFactory.getLogger(PictureController.class);
	
	@Value("${IMAGE_SERVER_URL}")
	private String IMAGE_SERVER_URL;
	
	@RequestMapping("/pic/upload")
	@ResponseBody
	public Map uploadFile( MultipartFile uploadFile ){
		
		Map<String, Object> resultMap = new HashMap<>();
		
		try {
			// 上传文件到文件服务器
			String conf = "classpath:conf/client.conf";
			FastDFSClient dfsClient = new FastDFSClient(conf);
			
			// 拼装上传文件后的绝对路径
			String originalFilename = uploadFile.getOriginalFilename();
			// 获取文件扩展名
			String extName = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
			String fileUrl = dfsClient.uploadFile(uploadFile.getBytes(), extName);
			logger.error("文件上传成功，具体返回值为：" + fileUrl);
			
			// 返回前端响应。
			resultMap.put("error", 0);
			resultMap.put("url", IMAGE_SERVER_URL + fileUrl);
			return resultMap;

		} catch (Exception e) {
			e.printStackTrace();
			logger.error("文件上传失败，具体异常信息：", e);
			resultMap.put("error", 1);
			resultMap.put("message", "图片上传异常");
			return resultMap;
		}
	}
	
}
