package com.huotu.entity.data3;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the value database table.
 * 
 */
@Entity
@Table(name="value")
@NamedQuery(name="Value.findAll", query="SELECT v FROM Value v")
public class Value implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String value;

	public Value() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}