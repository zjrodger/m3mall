package com.zjrodger.e3mall.mapper;

import com.zjrodger.e3mall.pojo.TbOrderItem;

public interface TbOrderItemMapper {
    /**
     *
     * @mbggenerated 2018-01-09
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int insert(TbOrderItem record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int insertSelective(TbOrderItem record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    TbOrderItem selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int updateByPrimaryKeySelective(TbOrderItem record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int updateByPrimaryKey(TbOrderItem record);
}