package com.cn.hnust.dao;

import com.cn.hnust.pojo.Resit;

public interface ResitMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(Resit record);

    int insertSelective(Resit record);

    Resit selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(Resit record);

    int updateByPrimaryKey(Resit record);
}