package com.mk.jkb.base05;

public class Person {
	
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Person() {
		System.out.println("无参构造方法");
	}
	
	public Person(int age) {
		this.age = age;
	}
}
