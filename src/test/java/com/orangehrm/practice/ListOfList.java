package com.orangehrm.practice;

import java.util.*;

public class ListOfList {

	public static void main(String[] args) {
		// create three lists of integers
		// add all these list into another lists
		// iterate and print all the lists using nested loops

		ArrayList<Integer> list1 = new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);

		ArrayList<Integer> list2 = new ArrayList();
		list2.add(4);
		list2.add(5);
		list2.add(6);

		ArrayList<Integer> list3 = new ArrayList();
		list3.add(7);
		list3.add(8);
		list3.add(9);

		System.out.println(list3);

		List<ArrayList<Integer>> lists = new ArrayList();
		lists.add(list1);
		lists.add(list2);
		lists.add(list3);

//		Iterator<ArrayList<Integer>> it = lists.iterator();
//		while(it.hasNext()) {
//			List<Integer> list=it.next();
//			System.out.println(list);
//		}
//		

		for (ArrayList<Integer> list : lists) {
			Iterator<Integer> itt = list.iterator();
			while (itt.hasNext()) {
				Integer i = itt.next();
				System.out.print(i + " ");

			}
			System.out.println();
		}

		ArrayList<String> europe = new ArrayList();
		europe.add("France");
		europe.add("Spain");
		europe.add("Italy");

		ArrayList<String> asia = new ArrayList();
		asia.add("China");
		asia.add("India");
		asia.add("Korea");

		ArrayList<String> africa = new ArrayList();
		africa.add("UAR");
		africa.add("Egypt");
		africa.add("Ghana");

		List<ArrayList<String>> continents = new LinkedList();
		continents.add(europe);
		continents.add(asia);
		continents.add(africa);

		System.out.println(continents);

		for (ArrayList<String> continent : continents) {
			for (String country : continent) {
				System.out.print(country + " ");
				
				StringBuffer sb= new StringBuffer(country);
				System.out.println(sb.reverse());
			}
		}
		System.out.println();
		
	}

}
