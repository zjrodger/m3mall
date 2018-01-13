package com.zjrodger.e3mall.service;

import java.util.List;

import com.zjrodger.e3mall.common.pojo.EasyUITreeNode;

/**
 * 商品类别Service
 * @Author: jian.zhang
 * @Date 2018年1月13日
 */
public interface ItemCatService {
	
	public List<EasyUITreeNode> getItemCatList(Long parentId);
}
