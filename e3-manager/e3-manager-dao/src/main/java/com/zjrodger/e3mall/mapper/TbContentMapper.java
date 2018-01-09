package com.zjrodger.e3mall.mapper;

import com.zjrodger.e3mall.pojo.TbContent;

public interface TbContentMapper {
    /**
     *
     * @mbggenerated 2018-01-09
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int insert(TbContent record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int insertSelective(TbContent record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    TbContent selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int updateByPrimaryKeySelective(TbContent record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int updateByPrimaryKeyWithBLOBs(TbContent record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int updateByPrimaryKey(TbContent record);
}