package com.zjrodger.e3mall.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zjrodger.e3mall.common.pojo.EasyUIDataGridResult;
import com.zjrodger.e3mall.pojo.TbItem;
import com.zjrodger.e3mall.service.ItemService;

/**
 * 商品Controller
 * @Description: 
 * @Author: zjrodger
 * @Date 2018年1月13日
 */
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
	
	@RequestMapping("/item/list")
	@ResponseBody
	public EasyUIDataGridResult getItemList(int page, int rows){
		logger.info("Controller接到参数：page = " + page + "，查询到的结果：" + rows);
		System.out.println("控制台输出：Controller接到参数：page = " + page + "，查询到的结果：" + rows);
		EasyUIDataGridResult result = itemService.getItemList(page, rows); 
		return result;
	}	
	
	
}
