package com.orangehrm.practice;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
      // find missing number in an array
		
		
		int [] array= {4, 5, 6, 8};
		
		int sum=0;
		
		for (int i=0; i<array.length; i++) {
			sum= sum+array[i];
		}
		
		int sum1=0;
		
		for(int j=4; j<=8; j++) {
			sum1=sum1+j;
		}
		
		System.out.println(sum1-sum);
		
//		int [] a= {1, 2, 3, 5}; 
//		
//		int sum=0; 
//		
//		for(int i=0; i<a.length; i++) {
//			sum=sum + a[i];
//		}
//		System.out.println(sum);
//		
//		int sum1=0; 
//		for(int j=1; j<=5; j++) {
//			sum1=sum1+j;
//		}
//		System.out.println(sum1);
//		System.out.println(sum1-sum);
//		
//		
//		int [] b= {1, 2, 3, 4, 6};
//		
//		int sm=0;
//		
//		for(int o=0; o<b.length; o++ ) {
//			sm=sm+b[o];
//		}
//		
//		int s=0; 
//		for (int k=1; k<=6; k++) {
//			s=s+k;
//		}
//		
//		System.out.println("The missing number is "+(s-sm));
	}

}
