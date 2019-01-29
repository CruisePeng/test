package com.vote.vip.dao;

import org.springframework.stereotype.Repository;

import com.vote.vip.bean.Link;
@Repository
public interface LinkMapper {
    int insert(Link record);

    int insertSelective(Link record);
}