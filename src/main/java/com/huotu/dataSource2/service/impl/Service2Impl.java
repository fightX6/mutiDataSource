package com.huotu.dataSource2.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.huotu.dataSource2.dao.Dao2;
import com.huotu.dataSource2.mapper.Dao2Mapper;
import com.huotu.dataSource2.service.Service2;
import com.huotu.entity.data2.Demo;
@Service
public class Service2Impl implements Service2{
	@Resource
	private Dao2 dao2;
	@Resource
	private Dao2Mapper dao2Mapper;
	@Override
	public Demo findById(int id) {
		return dao2.findOne(id);
	}
	@Override
	public void save(Demo val) {
		dao2.save(val);
	}
}
