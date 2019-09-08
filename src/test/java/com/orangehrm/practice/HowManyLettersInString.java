package com.orangehrm.practice;

import java.util.*;

public class HowManyLettersInString {

	public static void main(String[] args) {
		// String a=“ashyrova” find how many letters “a” are there and print them.

		String a = "ashyrova";

		//String characters = a.replace(" ", "");

		
//		String replaced = a.replace("ashyrova", "ASHYROVA");
//		System.out.println(replaced);
		
		Map <Character, Integer> map= new LinkedHashMap();
		for(char ch : a.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		
		
		
//		Map<Character, Integer> map = new LinkedHashMap();
//		for (char ch : a.toCharArray()) {
//			if (map.containsKey(ch)) {
//				map.put(ch, map.get(ch) + 1);
//			} else {
//				map.put(ch, 1);
//			}
//		}
//		System.out.println(map);

	}

}
