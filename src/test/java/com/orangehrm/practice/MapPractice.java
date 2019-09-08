package com.orangehrm.practice;

import java.util.*;

public class MapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map <String, String> countries = new HashMap(); 
		countries.put("Albania", "Tirana");
		countries.put("Kenya", "Nairobi");
		countries.put("France", "Paris");
		countries.put("Somalia", "Mogadishu");
		countries.put("England", "London");
		countries.put("Japan", "Tokio");
		countries.put("Italy", "Rome");
		
		System.out.println(countries);
		System.out.println();
		
		String capital = countries.get("Italy");
		System.out.println(capital);

		// 1 way loop thru the keys
		System.out.println("Printing keys: ");
		Set<String> keys =countries.keySet();
		for(String key: keys) {
			System.out.println("key: "+key+ "--->: "+countries.get(key));
		}
		
		System.out.println();
		
		System.out.println("Printing values: ");
		Collection<String> values = countries.values();
		for(String value: values) {
			System.out.println(value);
		}
		
		System.out.println();
		System.out.println("Printing entries: ");
		
		Set<Map.Entry<String, String>> entries= countries.entrySet();
		
		for(Map.Entry<String, String>entry: entries) {
			System.out.println(entry);
			System.out.println(entry.getKey()+"=>"+entry.getValue());
//			System.out.println(entry.getValue());
		}

	}

}
