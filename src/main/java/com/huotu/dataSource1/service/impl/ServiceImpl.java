package com.huotu.dataSource1.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.huotu.dataSource1.dao.Dao;
import com.huotu.dataSource1.mapper.DaoMapper;
import com.huotu.dataSource1.service.Service;
import com.huotu.dataSource2.dao.Dao2;
import com.huotu.entity.data1.Data1;
import com.huotu.entity.data2.Demo;
@org.springframework.stereotype.Service
public class ServiceImpl implements Service{
	@Resource
	private Dao<Data1> dao;
	@Resource
	private Dao2<Demo> dao2;
	@Resource
	private DaoMapper daoMapper;
	public List<Data1> findById(int id) {
		return daoMapper.findById();
	}
	public void save(Data1 val) {
		dao.save(val);
	}
	public void save(Data1 val,Demo demo) {
		dao.save(val);
		dao2.save(demo);
	}
}
