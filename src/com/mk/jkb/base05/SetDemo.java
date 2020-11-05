package com.mk.jkb.base05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
//		Set set = new HashSet();
//		set.add(123);
//		set.add(123);
//		set.add(1234);
//		set.add(1234);
//		Iterator it = set.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		Set hashSet = new HashSet();
		hashSet.add("1");
		hashSet.add("2");
		
		Iterator it = hashSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
