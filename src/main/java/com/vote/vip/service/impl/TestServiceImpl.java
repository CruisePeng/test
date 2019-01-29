package com.vote.vip.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vote.vip.bean.Catagory;
import com.vote.vip.dao.CatagoryMapper;
import com.vote.vip.service.TestService;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	private CatagoryMapper catagoryMapper;

	@Override
	public void insert() {
		Catagory catagory = new Catagory();
		catagory.setCatagoryId(UUID.randomUUID().toString().replaceAll("-", ""));
		catagory.setCatagoryName("政治");
		catagory.setCatagoryDesc("关心政治动向");
		catagory.setCatagoryOrder(1);
		catagoryMapper.insert(catagory);
		
	}
}
