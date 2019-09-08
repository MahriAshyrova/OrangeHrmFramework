package com.orangehrm.practice;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class PrintDuplicateOccurencesInString {

	public static void main(String[] args) {
		
		// print duplicate words - 1 way 
		String str = "cat cat dog dog rat";

		LinkedHashMap<String, Integer> map = new LinkedHashMap();

		for (String word : str.split(" ")) {
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		}

		System.out.println(map); // Output: {cat=2, dog=2, rat=1}

		for (String duplicate : map.keySet()) {
			if (map.get(duplicate) > 1) {
				System.out.print(duplicate+" ");  // Output: cat dog
			}
		}
		
		System.out.println("-------------------------------");
		
		//  2 way 
		Set<String> set = new LinkedHashSet();
		for (String duplicate : str.split(" ")) {
			if (set.add(duplicate)==false) {
			System.out.println("Duplicate element is "+duplicate);	
			}
		}
		//System.out.println(set);  // Output: [cat, dog]
		
		System.out.println("-------------------------------");
		
		// count and print duplicate characters 
		String a = "ashyrova";
		
	   Map<Character, Integer> mp = new LinkedHashMap();

		for (char ch : a.toCharArray()) {
			if (mp.containsKey(ch)) {
				mp.put(ch, mp.get(ch) + 1);
			} else {
				mp.put(ch, 1);
			}
		}

		System.out.println(mp);   // Output: {a=2, s=1, h=1, y=1, r=1, o=1, v=1}

		for (char dupChar : mp.keySet()) {
			if (mp.get(dupChar) > 1) {
				System.out.println(dupChar); // Output: a
			}
		}
	}
}
