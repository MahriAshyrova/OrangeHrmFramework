package com.orangehrm.practice;

import java.util.Arrays;
import java.util.Collections;

public class ReverseAnArray {

	public static void main(String[] args) {
		
		
		int [] array= {1, 2, 3, 4, 5};
		
		int target=9;
		
		for(int i=0; i<array.length-1; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i]+array[j]==target) {
					System.out.println("The target is "+target);
					break;
				} 	
			}
		}
		
		Collections.reverse(Arrays.asList(array)); 
        System.out.println(Arrays.asList(array));
		
		
		
	}

}
