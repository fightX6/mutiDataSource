package com.huotu.entity.data1;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the data1 database table.
 * 
 */
@Entity
@Table(name="data1")
@NamedQuery(name="Data1.findAll", query="SELECT d FROM Data1 d")
public class Data1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String name;

	public Data1() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}