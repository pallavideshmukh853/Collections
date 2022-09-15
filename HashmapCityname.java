package com.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashmapCityname {

		
	static	Map<String,Integer> hm =  new HashMap<>();
		public static void sortbykey()
		{
			TreeMap<String, Integer> sorted = new TreeMap<>();
			sorted.putAll(hm);
			for(Map.Entry<String,Integer> entry : sorted.entrySet()) {
				System.out.println("Key = " +entry.getKey()+
						"value = " +entry.getValue());
			}
		}
		
			public static void main(String[] args) {
	
		hm.put("solapur", 10000);
		hm.put("pune", 50000);
		hm.put("mumbai", 8000);
		hm.put("kolhapur", 25000);
		hm.put("nanded", 15000);
		hm.put("latur", 30000);
       sortbykey();
		
	}
}

