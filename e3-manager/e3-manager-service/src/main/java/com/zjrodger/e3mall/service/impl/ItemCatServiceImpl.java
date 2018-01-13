package com.zjrodger.e3mall.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zjrodger.e3mall.common.pojo.EasyUITreeNode;
import com.zjrodger.e3mall.mapper.TbItemCatMapper;
import com.zjrodger.e3mall.pojo.TbItemCat;
import com.zjrodger.e3mall.pojo.TbItemCatExample;
import com.zjrodger.e3mall.pojo.TbItemCatExample.Criteria;
import com.zjrodger.e3mall.service.ItemCatService;

/**
 * 商品类别Service
 * @Author: zjrodger
 * @Date 2018年1月13日
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {
	
	private static Logger logger = LoggerFactory.getLogger(ItemCatServiceImpl.class);
	
	@Autowired
	private TbItemCatMapper tbItemCatMapper;

	@Override
	public List<EasyUITreeNode> getItemCatList(Long parentId) {
		logger.info("getItemCatList()方法接收到请求");
		
		//根据parentId查询子节点列表
		TbItemCatExample example = new TbItemCatExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		
		// 执行SQL
		List<TbItemCat> itemCatList = tbItemCatMapper.selectByExample(example);
		
		List<EasyUITreeNode> result = new ArrayList<>();
		
		for(TbItemCat cat : itemCatList){
			EasyUITreeNode treeNode = new EasyUITreeNode();
			treeNode.setId(cat.getId());
			treeNode.setText(cat.getName());
			treeNode.setState( cat.getIsParent()?"closed":"open" );
			result.add(treeNode);
		}
		
		// 返回结果
		return result;
	}

}
