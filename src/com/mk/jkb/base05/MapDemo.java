package com.mk.jkb.base05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapDemo {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("熊大", "黄色");
		map.put("熊二", "红色");
		map.put("熊三", "黄色");
//		for(String key:map.keySet()){
//			System.out.println(key);
//		}
//		
//		for(String values:map.values()){
//			System.out.println(values);
//		}
		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<String, String> entry = it.next();
			System.out.println(entry.getKey() + entry.getValue());
		}
		
		

//		
	}
}
