package com.zjrodger.e3mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转的Controller
 * @Author: zjrodger
 * @Date 2018年1月13日
 */
@Controller
public class PageController {
	
	@RequestMapping("/")
	public String showIndex(){
		return "index";
	}
	
	@RequestMapping("/{pageName}")
	public String showPage(@PathVariable String pageName){
		return pageName;
	}
}
