package com.huotu.dataSource1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.huotu.entity.data1.Data1;
public interface Dao  extends  JpaRepository<Data1, Integer>{
	@Modifying
	@Query("update Data1 set name=:name where id=:id")
	public void update(@Param("name")String name,@Param("id")int id);
}
