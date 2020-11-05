package com.mk.jkb.base05;

import java.util.*;


public class MapTest {

	public static void main(String[] args) {
		//Map<K,V> key,value
		HashMap<String,Integer> map = new HashMap();
		map.put("xjg", 0);
 		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
// 		LinkedHashMap linkedHashMap = new LinkedHashMap<>();
// 		linkedHashMap.put("xjg", 0);
// 		linkedHashMap.put("xjg1", 1);
// 		linkedHashMap.put("xjg2", 2);
// 		Iterator it2 = linkedHashMap.entrySet().iterator();
//		while(it2.hasNext()) {
//			System.out.println(it2.next());
//		}
	}
}
