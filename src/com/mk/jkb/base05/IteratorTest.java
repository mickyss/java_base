package com.mk.jkb.base05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IteratorTest {

	public static void main(String[] args) {

		Map<String,String> map = new HashMap();
		map.put("123", "123");
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry entry = (Entry) it.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		Iterator iter = map.keySet().iterator();
		while(iter.hasNext()){
			String key = iter.next().toString();
			System.out.println( key + map.get(key));
		}
		
		for(String key:map.keySet()){
			System.out.println(map.get(key));
		}
		for(Entry<String,String> entry:map.entrySet()){
			System.out.println(entry.getKey() + entry.getValue());
		}
	}

}
