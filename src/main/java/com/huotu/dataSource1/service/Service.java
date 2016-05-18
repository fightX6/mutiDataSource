package com.huotu.dataSource1.service;

import java.util.List;

import com.huotu.entity.data1.Data1;
import com.huotu.entity.data2.Demo;

public interface Service {
	public void save(Data1 data1);
	public void save(Data1 val,Demo demo);
	public List<Data1> findById(int id );
}
