package com.huotu.dataSource3.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.huotu.entity.data3.Value;

@Repository
public interface Dao3Mapper {
	public List<Value> findById();
}
