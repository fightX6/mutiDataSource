package com.huotu.dataSource1.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.huotu.entity.data1.Data1;

@Repository
public interface DaoMapper {
	public List<Data1> findById();
}
