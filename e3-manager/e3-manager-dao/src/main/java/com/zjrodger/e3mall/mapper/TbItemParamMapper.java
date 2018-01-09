package com.zjrodger.e3mall.mapper;

import com.zjrodger.e3mall.pojo.TbItemParam;

public interface TbItemParamMapper {
    /**
     *
     * @mbggenerated 2018-01-09
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int insert(TbItemParam record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int insertSelective(TbItemParam record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    TbItemParam selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int updateByPrimaryKeySelective(TbItemParam record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int updateByPrimaryKeyWithBLOBs(TbItemParam record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int updateByPrimaryKey(TbItemParam record);
}