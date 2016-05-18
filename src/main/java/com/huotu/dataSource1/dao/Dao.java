package com.huotu.dataSource1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huotu.entity.data1.Data1;
public interface Dao<Data1> extends  JpaRepository<Data1, Integer>{

}
