package com.huotu.dataSource2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huotu.entity.data2.Demo;
public interface Dao2 extends  JpaRepository<Demo, Integer>{
	
}
