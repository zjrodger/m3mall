package com.zjrodger.e3mall.mapper;

import com.zjrodger.e3mall.pojo.TbItemParamItem;

public interface TbItemParamItemMapper {
    /**
     *
     * @mbggenerated 2018-01-09
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int insert(TbItemParamItem record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int insertSelective(TbItemParamItem record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    TbItemParamItem selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int updateByPrimaryKeySelective(TbItemParamItem record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int updateByPrimaryKeyWithBLOBs(TbItemParamItem record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int updateByPrimaryKey(TbItemParamItem record);
}