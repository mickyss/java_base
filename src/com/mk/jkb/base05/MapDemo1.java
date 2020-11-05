package com.mk.jkb.base05;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("stu", "123");
		System.out.println(map.get("stu"));
		map.put("stu", "1233");
		System.out.println(map.get("stu"));
		

	}
}
