package com.zjrodger.e3mall.mapper;

import com.zjrodger.e3mall.pojo.TbOrder;

public interface TbOrderMapper {
    /**
     *
     * @mbggenerated 2018-01-09
     */
    int deleteByPrimaryKey(String orderId);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int insert(TbOrder record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int insertSelective(TbOrder record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    TbOrder selectByPrimaryKey(String orderId);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int updateByPrimaryKeySelective(TbOrder record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int updateByPrimaryKey(TbOrder record);
}