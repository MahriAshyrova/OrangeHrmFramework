package com.orangehrm.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {

		// remove duplicates from an array
		int[] array = { 1, 1, 2, 2, 3, 3 };

		HashSet<Integer> hset = new HashSet();
		for (int num : array) {
			hset.add(num);
		}

		//System.out.println(hset);

		for (int i = 0; i < array.length; i++) {
			hset.add(array[i]);
		}

		//print duplicate characters 
		String s = "aaaabbccdef";
		Set<Character> set = new HashSet<>();
		for (char c : s.toCharArray()) {
			if(!(c=='d' || c=='e' || c=='f')) {
			set.add((c));
			}
		}
		System.out.println(set);
		
		
		String string = "aaabbccdefatafaz";
		char[] chars = string.toCharArray();
		StringBuilder sb = new StringBuilder();
		Set<Character> charSet = new HashSet<Character>();
		for (char c : chars) {
		    if(charSet.add(c) ){
		        sb.append(c);
		    }
		}
		//System.out.println(sb.toString()); // abcdeftz
		
		
		
		
		
		
	}
}
