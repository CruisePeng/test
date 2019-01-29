package com.vote.vip.dao;

import org.springframework.stereotype.Repository;

import com.vote.vip.bean.Comment;
@Repository
public interface CommentMapper {
    int insert(Comment record);

    int insertSelective(Comment record);
}