package com.huotu.dataSource3.service;

import java.util.List;

import com.huotu.entity.data3.Value;

public interface Service3 {

	public void save(Value val);
	public List<Value>  findById(int id );
}
