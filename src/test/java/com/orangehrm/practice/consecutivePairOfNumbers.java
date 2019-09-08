package com.orangehrm.practice;

import java.util.*;

public class consecutivePairOfNumbers {

	public static void main(String[] args) {
		// Int [] array = {8, 1, 3, 6, 1, 2, 3, 4, 9, 1, 3,4};
		// Find the most consecutive pair of numbers and print them

		int[] array = { 8, 1, 3, 6, 1, 2, 3, 4, 9, 1, 3, 4 };

		Set<Integer> hset = new TreeSet();
		for (Integer a : array) {
			if (a < 6) {
				hset.add(a);
			}
		}
		System.out.println(hset);

		
	      
//    	 You are given an array of integers, for example:
//   	  int[] a = { 8, 1, 3, 6, 1, 2, 3, 4, 9, 1, 3, 4, 5, 6, 7 };
//   	 There are two consecutive numbers pairs in this case: 1, 2, 3, 4   AND   3, 4, 5, 6, 7
//     		You need to find the longest consecutive numbers pair which in this case is 3, 4, 5, 6, 7
//   	  If this array is given:
//   	  int[] a = { 1, 2, 3, 4, 5, 8, 10, 2, 4, 5, 6, 7, 8, 9, 10, 3, 9, 10, 11, 12 };
//   	  There are three consecutive numbers pairs:  1, 2, 3, 4, 5    AND     4, 5, 6, 7, 8, 9, 10      AND     9, 10, 11, 12
//   	  The longest pair is: 4, 5, 6, 7, 8, 9, 10
		//int[] a = { 8, 1, 3, 6, 1, 2, 3, 4, 9, 1, 3, 4, 5, 6, 7 };
		        int[] a = { 1, 2, 3, 4, 5, 8, 10, 2, 4, 5, 6, 7, 8, 9, 10, 3, 9, 10, 11, 12 };
		        List<Integer> currentList = new ArrayList<>();
		        currentList.add(a[0]);
		        List<Integer> longestList = new ArrayList<>(currentList);
		        for (int i = 1; i < a.length; i++) {
		            if ((a[i] - currentList.get(currentList.size() - 1)) == 1) {
		                currentList.add(a[i]);
		                if (currentList.size() > longestList.size()) {
		                    longestList = new ArrayList<>(currentList);
		                }
		            } else {
		                currentList = new ArrayList<>();
		                currentList.add(a[i]);
		            }
		        }
		       
		      System.out.println(longestList);

		    }
		
	}

