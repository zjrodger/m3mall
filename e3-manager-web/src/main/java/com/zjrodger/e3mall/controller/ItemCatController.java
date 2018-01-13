package com.zjrodger.e3mall.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zjrodger.e3mall.common.pojo.EasyUITreeNode;
import com.zjrodger.e3mall.service.ItemCatService;

/**
 * 商品类别Controller
 * @Author: zjrodger
 * @Date 2018年1月13日
 */
@Controller
public class ItemCatController {
	
	private static Logger logger = LoggerFactory.getLogger(ItemCatController.class);
	
	@Autowired
	private ItemCatService itemCatService;
	
	@RequestMapping("/item/cat/list")
	@ResponseBody
	public List<EasyUITreeNode> getItemCatList(
			@RequestParam(name="id", defaultValue="0") Long parentId){
		List<EasyUITreeNode> result = itemCatService.getItemCatList(parentId);
		return result;
	}
	
}
