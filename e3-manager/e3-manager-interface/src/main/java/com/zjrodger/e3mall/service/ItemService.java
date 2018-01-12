package com.zjrodger.e3mall.service;

import com.zjrodger.e3mall.common.pojo.EasyUIDataGridResult;
import com.zjrodger.e3mall.pojo.TbItem;

public interface ItemService {
	
	public TbItem getItemById(long id);
	
	public EasyUIDataGridResult getItemList(Integer page, Integer rows);
}
