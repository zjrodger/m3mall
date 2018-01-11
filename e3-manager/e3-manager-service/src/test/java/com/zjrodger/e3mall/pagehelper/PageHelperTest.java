package com.zjrodger.e3mall.pagehelper;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zjrodger.e3mall.mapper.TbItemMapper;
import com.zjrodger.e3mall.pojo.TbItem;
import com.zjrodger.e3mall.pojo.TbItemExample;

public class PageHelperTest {
	
	@Test
	public void testPageHelper() throws Exception {
		
		// 初始化Spring容器。
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
		
		// 从Spring容器中，获取Mapper代理对象。
		TbItemMapper tbItemMapper = context.getBean(TbItemMapper.class);
		
		// 执行SQL语句之前，设置分页信息，使用PageHelper的startPage方法。
		PageHelper.startPage(1, 10);
		
		// 执行查询
		TbItemExample example = new TbItemExample();
		List<TbItem> list = tbItemMapper.selectByExample(example);
		
		// 取分页信息，PageInfo，1.总记录数 2.总页数 3.当前页码
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		System.out.println("总记录条数："+pageInfo.getTotal());
		System.out.println("总页数"+pageInfo.getPages());
		System.out.println(pageInfo.getPageNum());
		System.out.println("每页大小：" + pageInfo.getPageSize());
		
	}
	
}
