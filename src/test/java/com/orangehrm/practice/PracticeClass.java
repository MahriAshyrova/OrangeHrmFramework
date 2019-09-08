package com.orangehrm.practice;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class PracticeClass {

	public static void main(String[] args) {

		String pets = "cat cat dog dog rat";

		Set<String> set = new LinkedHashSet();
		for (String pet : pets.split(" ")) {
			if (set.add(pet) == false) {
				System.out.print(pet + " ");
			}
		}
		System.out.println();
		System.out.println("-----------------");

		Map<String, Integer> map = new LinkedHashMap();

		for (String pt : pets.split(" ")) {
			if (map.containsKey(pt)) {
				map.put(pt, map.get(pt) + 1);
			} else {
				map.put(pt, 1);
			}
		}
		for(String duplicate: map.keySet()) {
			if(map.get(duplicate)>1) {
				System.out.println("Duplicate: "+duplicate+" ");
			}
		}
		

		System.out.println();
		System.out.println("-----------------");

		String[] animals = { "cat", "cat", "dog", "dog", "rat" };

		Set<String> hset = new LinkedHashSet();

		for (String animal : animals) {
			if (hset.add(animal) == false) {
				System.out.print(animal + " ");
			}
		}

	}

}
