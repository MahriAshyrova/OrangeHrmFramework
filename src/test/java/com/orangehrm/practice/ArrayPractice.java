package com.orangehrm.practice;

import java.util.*;

public class ArrayPractice {

	public static void main(String[] args) {

//		5
//		5 41 77 74 22 44
//		1 12
//		4 37 34 36 52 
//		0
//		3 20 22 33 
		
		List<List<Integer>> listoflists = new ArrayList<List<Integer>>();
		
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0; i<n; i++) {
			int d= scan.nextInt();
			List<Integer> list = new ArrayList <Integer>();
			for(int j=0; j<d; j++) {
				list.add(scan.nextInt());
			}
			listoflists.add(list);
		}
		// System.out.println(listoflists);
		int q=scan.nextInt();
		
		for(int i=0; i<q; i++) {
			int x = scan.nextInt();	
			int y = scan.nextInt();
			List <Integer> list = listoflists.get(x-1);
			if(y>list.size()) {
				System.out.println("ERROR");
			}else {
			Integer number = list.get(y-1);
			System.out.println(number);
			}	
		}
		scan.close();
	}

}
