package com.zjrodger.e3mall.mapper;

import com.zjrodger.e3mall.pojo.TbUser;

public interface TbUserMapper {
    /**
     *
     * @mbggenerated 2018-01-09
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int insert(TbUser record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int insertSelective(TbUser record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    TbUser selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int updateByPrimaryKeySelective(TbUser record);

    /**
     *
     * @mbggenerated 2018-01-09
     */
    int updateByPrimaryKey(TbUser record);
}