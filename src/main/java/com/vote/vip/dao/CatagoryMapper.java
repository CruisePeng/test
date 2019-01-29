package com.vote.vip.dao;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.vote.vip.bean.Catagory;

@Resource
public interface CatagoryMapper {
	
	
    int insert(Catagory record);

    int insertSelective(Catagory record);
}