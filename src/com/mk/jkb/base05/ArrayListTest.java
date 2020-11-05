package com.mk.jkb.base05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest<T> {
	
	ArrayList list = new ArrayList();
	
	//添加老师
	void addTeacher(Teacher t) {
		//
		list.add(t);
		System.out.println("添加成功");
	}
	
	//添加学生
	void addStudent(Student t) {
		list.add(t);
		System.out.println("添加成功");
	}
	
	public void add(T t) {
		if(list.contains(t)) {
			System.out.println("已经存在");	
		}else {
			list.add(t);
			System.out.println("添加成功");
		}
	}
	
	
	public T getT(T t) {
		return t;
	}
	
	
	public void show() {
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).toString());
		}
	}
	
	public static void main(String[] args) {
//		
//		ArrayList<String> arrayList = new ArrayList();
//		arrayList.add("11");
//		arrayList.add("123");
//		arrayList.add("1234");
//		for(int i =0 ;i<arrayList.size();i++) {
//			System.out.println(arrayList.get(i));	
//		}
//		
//		System.out.println("------");
//		Iterator it = arrayList.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		
		//
		//接口 ji = new 实现类();
//		ArrayList list = new ArrayList();
//		list.add("xjq");
//		list.add("xjq");
		
//		if(list.get(0).equals(list.get(1))) {
//			System.out.println("true");
//		}else {
//			System.out.println("false");
//		}
		
//		System.out.println(list.get(0));
//		for(int i =0 ;i<list.size();i++) {
//			System.out.println(list.get(i));	
//		}
//		LinkedList list = new LinkedList<>();
//		list.addf
//		
//		new Student("123").show2();
		List<Integer> arrayList = new ArrayList();
		arrayList.add(12);
		arrayList.add(12);
		arrayList.iterator();
//		
		for(int i =0 ;i<arrayList.size();i++) {
			System.out.println("当前"+ i + ":" + arrayList.get(i));	
		}
		System.out.println("-------------");
		for(Integer i:arrayList) {
			System.out.println(i);
		}
//		System.out.println("-------------");
//		for(Student student:arrayList) {
//			System.out.println(student);
//		}
	}
	
}
