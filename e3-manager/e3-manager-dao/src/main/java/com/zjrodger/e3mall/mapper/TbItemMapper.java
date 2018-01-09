package com.zjrodger.e3mall.mapper;

import com.zjrodger.e3mall.pojo.TbItem;

public interface TbItemMapper {
    /**
     *
     * @mbggenerated 2018-01-09
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int insert(TbItem record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int insertSelective(TbItem record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    TbItem selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int updateByPrimaryKeySelective(TbItem record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int updateByPrimaryKey(TbItem record);
}