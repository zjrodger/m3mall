package com.zjrodger.e3mall.mapper;

import com.zjrodger.e3mall.pojo.TbOrderShipping;

public interface TbOrderShippingMapper {
    /**
     *
     * @mbggenerated 2018-01-09
     */
    int deleteByPrimaryKey(String orderId);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int insert(TbOrderShipping record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int insertSelective(TbOrderShipping record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    TbOrderShipping selectByPrimaryKey(String orderId);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int updateByPrimaryKeySelective(TbOrderShipping record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int updateByPrimaryKey(TbOrderShipping record);
}