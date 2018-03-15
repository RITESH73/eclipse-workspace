package com.collectonsdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(73, "Ritesh Mehta");
		map.put(63, "Chandan Singh");
		map.put(74, "Sachin Thakur");
		
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
	}

}
