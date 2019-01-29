package com.vote.vip.dao;

import org.springframework.stereotype.Repository;

import com.vote.vip.bean.TopicWithBLOBs;
@Repository
public interface TopicMapper {
    int insert(TopicWithBLOBs record);

    int insertSelective(TopicWithBLOBs record);
}