package com.vote.vip.dao;

import org.springframework.stereotype.Repository;

import com.vote.vip.bean.Message;
@Repository
public interface MessageMapper {
    int insert(Message record);

    int insertSelective(Message record);
}