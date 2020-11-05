package com.mk.jkb.base05;

public class Teacher {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher(String name) {
		super();
		this.name = name;
	}
	
	 public String toString() {
	      return "老师类";
	 }
	
}
