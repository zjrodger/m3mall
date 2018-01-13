package com.zjrodger.e3mall.service.impl;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zjrodger.e3mall.common.pojo.EasyUIDataGridResult;
import com.zjrodger.e3mall.mapper.TbItemMapper;
import com.zjrodger.e3mall.pojo.TbItem;
import com.zjrodger.e3mall.pojo.TbItemExample;
import com.zjrodger.e3mall.service.ItemService;

/**
 * 商品管理
 * @Description: 
 * @Author: jian.zhang
 * @Date 2018年1月10日
 */
@Service
public class ItemServiceImpl implements ItemService {
	
	private static Logger logger = LoggerFactory.getLogger(ItemServiceImpl.class);
	
	@Autowired
	private TbItemMapper tbItemMapper;

	@Override
	public TbItem getItemById(long id) {
		return tbItemMapper.selectByPrimaryKey(id);
	}

	@Override
	public EasyUIDataGridResult getItemList(Integer page, Integer rows) {
		
		logger.info("getItemList()方法接收到请求");
		
		//设置分页信息
		PageHelper.startPage(page, rows);
		
		// 组装条件
		TbItemExample example = new TbItemExample();
		
		// 执行查询
		List<TbItem> itemList = tbItemMapper.selectByExample(example);
		
		// 返回结果
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setRows(itemList);
		
		//取分页结果
		PageInfo<TbItem> pageInfo = new PageInfo<>(itemList);
		long total = pageInfo.getTotal();
		result.setTotal(total);
		
		logger.info("page="+page+",rows="+rows+"对应的PageInf信息为：当前页pageInfo.getPageNum()=" + pageInfo.getPageNum()+", 每页的数量pageInfo.getPageSize()="+pageInfo.getPageSize()+", 当前页的数量pageInfo.getSize()="+pageInfo.getSize()+"， 总记录数pageInfo.getTotal()="+pageInfo.getTotal()+", 总页数pageInfo.getPages()="+pageInfo.getPages());
		
		return result;
	}
	
}
