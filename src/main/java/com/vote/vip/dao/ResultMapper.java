package com.vote.vip.dao;

import org.springframework.stereotype.Repository;

import com.vote.vip.bean.Result;
@Repository
public interface ResultMapper {
    int insert(Result record);

    int insertSelective(Result record);
}