package com.orangehrm.practice;

public class PatternPrintTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write down the code to get stars in the following order  
//		  *
//        **
//        ***
//        ****	
		
		
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=4; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}

}
