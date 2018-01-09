package com.zjrodger.e3mall.mapper;

import com.zjrodger.e3mall.pojo.TbItemCat;

public interface TbItemCatMapper {
    /**
     *
     * @mbggenerated 2018-01-09
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int insert(TbItemCat record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int insertSelective(TbItemCat record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    TbItemCat selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int updateByPrimaryKeySelective(TbItemCat record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int updateByPrimaryKey(TbItemCat record);
}