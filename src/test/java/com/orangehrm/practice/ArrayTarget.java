package com.orangehrm.practice;

public class ArrayTarget {

	public static void main(String[] args) {
		
		
		// 
		int [] array= { 2, 4, 6, 8};
		
		int target = 10;
		
		for (int i=0; i<array.length; i++) {
		for(int j=i+1; j<array.length; j++) {
			if(array[i]+array[j]==target) {
				System.out.println(true);
			}
	}
		}	
		
		
		

	}

}
