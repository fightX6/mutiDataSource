package com.huotu.dataSource3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huotu.entity.data3.Value;
public interface Dao3<Value> extends  JpaRepository<Value, Integer>{

}
