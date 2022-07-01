package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Example;
import com.example.demo.repository.HelloOracleMapper;

@Service
public class HelloOracleService {
	
	@Autowired
	private HelloOracleMapper helloOracleMapper;
	
	public Example helloOracle() {
		return helloOracleMapper.helloOracle();
	}

}
