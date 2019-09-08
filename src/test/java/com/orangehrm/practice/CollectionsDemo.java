package com.orangehrm.practice;

import java.util.*;
import java.util.Arrays;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> listt= new ArrayList<String>();
		listt.add("France");
		listt.add("England");
		listt.add("Italy");

		System.out.println("Initial list: "+listt);
		Collections.addAll(listt, "Spain", "Germany", "Albania", "Pakistan");
		System.out.println("After adding elements to the list: "+listt);
		
		
		String[] strArr ={"US", "Albania", "Pakistan"};
		Collections.addAll(listt, strArr);
		
		
		List<Integer> list1= new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		System.out.println("max : "+Collections.max(list1));
		System.out.println("max : "+Collections.min(list1));

		Collections.sort(list1);
		System.out.println("After sorting "+list1);
		
		
		List<String> list2= new ArrayList<String>(Arrays.asList("John", "Alex", "Tim", "Ray"));	
		Collections.sort(list2, Collections.reverseOrder());
		System.out.println(list2);
		
		
	ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 10, 1, 2, 2, 6, 3, 3, 10, 4, 5, 5));	
	
	Collections.sort(list);
	System.out.println(list);
	
	
	
	Set<Integer> set = new LinkedHashSet(list);
	System.out.println(set);
		
		ArrayList<Integer> noDupList = removeDuplicates(list);
		System.out.println(noDupList);
		
	}

	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> oldList){
		ArrayList<Integer> newlist = new ArrayList();
		for(int n:  oldList){
			if(!newlist.contains(n))
				newlist.add(n);
		}
		return newlist;
		
		
		
	}
	
	
	
	
	
}
