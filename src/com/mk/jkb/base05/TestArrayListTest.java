package com.mk.jkb.base05;

import java.util.ArrayList;

public class TestArrayListTest {
	
	public static void main(String[] args) {
		ArrayListTest arrayListTest = new ArrayListTest();
		arrayListTest.list = new ArrayList<>();
		
		Student xjq = new Student("xjq");
		arrayListTest.add(xjq);
		arrayListTest.add(new Student("xjq2"));
		arrayListTest.add(new Teacher("yyc"));
		arrayListTest.show();
//		
//		
		ArrayList<Double> arrayList = new ArrayList();
//		arrayList.add(new Student("yyc"));
		arrayList.add(123.0);
//		add();
		
		
//		Student s = new Student("123");
		
//		Student.show();
	}
//	public static void add() {
//		System.out.println("123");
//	}
}
