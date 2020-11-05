package com.mk.jkb.base05;

import java.util.*;

public class ArrayList02 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		list.add(123);
		if(list.contains(123)) {
			list.add(124);
		}else {
			list.add(123);
		}
		System.out.println(list.get(0));
		System.out.println(list.get(1));
			
		
//		LinkedList<String> list2 = new LinkedList();
//		list2.add("123");
//		list2.add("1234");
//		list2.addFirst("first");
//		list2.addLast("last");
//		for(int i=0;i<list2.size();i++) {
//			System.out.println(list2.get(i));
//		}
	
	}

}
