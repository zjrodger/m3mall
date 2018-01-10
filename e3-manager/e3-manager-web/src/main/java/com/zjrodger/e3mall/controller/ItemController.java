package com.zjrodger.e3mall.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zjrodger.e3mall.pojo.TbItem;
import com.zjrodger.e3mall.service.ItemService;

@Controller
public class ItemController {
	
	private static final Logger logger = LoggerFactory.getLogger(ItemController.class);
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	private TbItem getItemById(@PathVariable Long itemId){
		TbItem item = itemService.getItemById(itemId);
		logger.info("前端输入的参数：itemId = " + itemId + "，查询到的结果：" + itemId.toString());
		System.out.println("前端输入的参数：itemId = " + itemId + "，查询到的结果：" + itemId.toString());
		return item;
	} 
	
}
