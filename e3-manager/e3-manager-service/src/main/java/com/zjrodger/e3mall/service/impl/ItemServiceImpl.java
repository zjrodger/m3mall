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

}
