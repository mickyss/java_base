package com.mk.jkb.base05;

public class Student{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name) {
		super();
		this.name = name;
	}
	
	 public String toString() {
	      return "学生类";
	 }
	 
	 public static void show() {
		System.out.println("学生类"); 
	 }
	 
	 public void show2() {
		System.out.println("匿名对象");
	 }
}
