package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Example;

@Mapper
public interface HelloOracleMapper {
	
	Example helloOracle();
}
