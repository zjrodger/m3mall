package com.zjrodger.e3mall.mapper;

import com.zjrodger.e3mall.pojo.TbItemDesc;

public interface TbItemDescMapper {
    /**
     *
     * @mbggenerated 2018-01-09
     */
    int deleteByPrimaryKey(Long itemId);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int insert(TbItemDesc record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int insertSelective(TbItemDesc record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    TbItemDesc selectByPrimaryKey(Long itemId);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int updateByPrimaryKeySelective(TbItemDesc record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int updateByPrimaryKeyWithBLOBs(TbItemDesc record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int updateByPrimaryKey(TbItemDesc record);
}