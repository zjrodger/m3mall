package com.zjrodger.e3mall.service;

import java.util.List;

import com.zjrodger.e3mall.pojo.TbItem;
import com.zjrodger.e3mall.pojo.TbItemExample;

public interface ItemService {
	
	public TbItem getItemById(long id);
	
	public List<TbItem> getItemList(TbItemExample example);
	
}
