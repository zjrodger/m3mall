package com.zjrodger.e3mall.mapper;

import com.zjrodger.e3mall.pojo.TbContentCategory;

public interface TbContentCategoryMapper {
    /**
     *
     * @mbggenerated 2018-01-09
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int insert(TbContentCategory record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int insertSelective(TbContentCategory record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    TbContentCategory selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int updateByPrimaryKeySelective(TbContentCategory record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int updateByPrimaryKey(TbContentCategory record);
}