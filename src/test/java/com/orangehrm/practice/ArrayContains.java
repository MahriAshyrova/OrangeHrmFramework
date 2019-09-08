package com.orangehrm.practice;

import java.util.Arrays;

public class ArrayContains {

	public static void main(String[] args) {
		// if array contains 14 
		int array[] = new int[] { 3, 5, 6, 8, 12, 5, 9, 14, 83, 0, 11};
		int k=14; 
		boolean found = false;
		
		int i=0;
		for(; i<array.length; i++) {
			if(array[i]==k) {
				found=true;
				break;
			}
		}
		
		if(found) {
			System.out.println("The array contains the number " +k+" at index "+i);
		} else {
			System.out.println("The array doesn't contain the number " +k);
		}
		
		
		// write a program to insert an element at a specific position
		// int 56 be inserted at index 3 ( in this case between 6 and 8)
		
		
		int arr[] = new int[] { 3, 5, 6, 8, 12, 5, 9, 14, 83, 0, 23}; // 11 numbers = index is 10
		int h=56; 
		int index=3;
		
		
		for(int x =arr.length-1; x> index; x--) {
			arr[x]= arr[x-1];   // copying 9 to 10, 8 to 9 
		}
		
		arr[index]=h;
		
		for(int y: arr) {
			System.out.println(y);
		}
		
		// write a program to find all pairs of elements in an array whose sum is equal to specified number
		// 
		
//		int ar[] = new int[] { 3, 5, 6, 8, 12, 5, 9, 14, 83, 0, 23};
//		int m=17; 
//		
//		// 1 st way, it is slow
//	       for(int b=0; b<ar.length; b++) {
//	           for(int j=b+1; j<ar.length; j++) {
//	               if(arr[b]+ar[j]==m) {
//	                   System.out.print(ar[b]+" "+ar[j]);
//	               }   
//	           }
//	           System.out.println(); 
//	       }
	       
	       
	       
//	       for(int l: ar) {
//	    	   System.out.print(l+", ");
//	       }
		int ar[] = new int[] { 3, 5, 6, 8, 12, 9, 14, 83, 0, 23};
	       int m=18; 
	       Arrays.sort(ar);
	       System.out.println("Sorted array "+Arrays.toString(ar));
	       int left =0; 
	       int right = ar.length-1; 
	       
	       while(left<right) {
	    	  int sum = ar[left]+ar[right];
	    	  if(sum==m) {
	    		  System.out.printf("(%d, %d) %n", ar[left], ar[right]);
	    		  left++;
	    		  right--;
	    	  }else if (sum<m){
	    		  left ++;
	    	  }else {
	    		  right--;
	    	  }
	       }
	       
	       
//	       
//	       for(int o=0; o<ar.length-1; o++) {
//	    	   for(int p=ar.length-1; p>0; p--) {
//	    		   if(ar[o]+ar[p]==m) {
//	    		   System.out.println(ar[o]+" "+ar[p]);
//	    		   }
//	    	   }
//	       }
//	       
//	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	   }	
	}


