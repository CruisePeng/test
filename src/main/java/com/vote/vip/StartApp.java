package com.vote.vip;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.vote.vip.dao") 
public class StartApp {

	public static void main(String[] args) {
		SpringApplication.run(StartApp.class);
	}

}
