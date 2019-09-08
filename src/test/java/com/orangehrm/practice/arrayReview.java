package com.orangehrm.practice;

public class arrayReview {

	public static void main(String[] args) {

//		int arr1 [] = new int[4];
//		int arr2 [] = new int[4];
//		int arr3 [] = new int [] {1, 2, 3, 4,};
//
//		int el1 = 3;
//		int el2 = 5;
//		int el3 = 6;
//		int el4 = 8;
//
//		int sum1 = el1 + el2 + el3 + el4;
//		System.out.println("1st way: " + sum1);
//
//		int arr1[] = new int[] { 3, 5, 6, 8 };
//		int sum2 = arr1[0] + arr1[1] + arr1[2] + arr1[3];
//		System.out.println("Second way: " + sum2);
//
//		int sum3 = 0;
//		for (int i = 0; i < arr1.length; i++) {
//			sum3 += arr1[i];
//		}
//		System.out.println("3 rd way: " + sum3);
//
////		Employee emp = new Employee();
////		Employee empArray[] = new Employee[3];
////
////		//1 way
////		empArray[0] = new Employee();
////		
////		// 2 way
////		Employee Tempemp = new Employee();
////		empArray[1] = tempEmp;
////
////		empArray[] = new Employee();
//		
//		
//		
//		// the sum of and average of inegers of an array
//		// arrays are faster than Collections
//		int array[] = new int[] { 3, 5, 6, 8, 12, 5, 9};
//		int sum=0;
//		double avg=0;
//		
//		for(int i=0; i<array.length; i++) {
//			sum+=array[i];
//			avg=(double) sum/7;
//		}
//		
//		//System.out.println(sum);
//		//System.out.println(avg);
//		
//		
//		Integer integers[] = new Integer[5];
		
		int [] [] twoDimArray= new int [6] [3];
		int seq=0;
		// to initialize values
		for(int i=0; i<twoDimArray.length; i++) {
			for( int j=0; j<twoDimArray[i].length; j++) {
				twoDimArray[i][j]=++seq;
			}	
		}
		// to print the array 
		for(int i=0; i<twoDimArray.length; i++) {
			for( int j=0; j<twoDimArray[i].length; j++) {
				System.out.print(twoDimArray[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
