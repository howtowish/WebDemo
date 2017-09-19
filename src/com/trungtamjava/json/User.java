package com.trungtamjava.json;

import java.io.Serializable;

public class User implements Serializable{

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	public String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
