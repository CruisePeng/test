package com.vote.vip.dao;

import org.springframework.stereotype.Repository;

import com.vote.vip.bean.User;
@Repository
public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}