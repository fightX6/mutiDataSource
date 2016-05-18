package com.huotu.dataSource3.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.huotu.dataSource3.dao.Dao3;
import com.huotu.dataSource3.mapper.Dao3Mapper;
import com.huotu.dataSource3.service.Service3;
import com.huotu.entity.data3.Value;
@Service
public class Service3Impl implements Service3{
	@Resource
	private Dao3 dao3;
	@Resource
	private Dao3Mapper dao3Mapper;
	@Override
	public List<Value> findById(int id) {
		return dao3Mapper.findById();
	}
	@Override
	public void save(Value val) {
		dao3.save(val);
	}
}
