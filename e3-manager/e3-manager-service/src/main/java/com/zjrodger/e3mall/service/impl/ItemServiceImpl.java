package com.zjrodger.e3mall.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zjrodger.e3mall.mapper.TbItemMapper;
import com.zjrodger.e3mall.pojo.TbItem;
import com.zjrodger.e3mall.service.ItemService;

/**
 * 商品管理
 * @Description: 
 * @Author: jian.zhang
 * @Date 2018年1月10日
 */
@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private TbItemMapper tbItemMapper;

	@Override
	public TbItem getItemById(long id) {
		return tbItemMapper.selectByPrimaryKey(id);
	}

//	public EasyUIDataGridResult getItemList(int page, int rows) {
//		//设置分页信息
//		PageHelper.startPage(page, rows);
//		//执行查询
//		TbItemExample example = new TbItemExample();
//		List<TbItem> list = itemMapper.selectByExample(example);
//		//创建一个返回值对象
//		EasyUIDataGridResult result = new EasyUIDataGridResult();
//		result.setRows(list);
//		//取分页结果
//		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
//		//取总记录数
//		long total = pageInfo.getTotal();
//		result.setTotal(total);
//		return result;
//	}	
	
}
