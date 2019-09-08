package com.orangehrm.practice;

public class PalindromeNumber {

	public static void isPalindromNumber(int num) {
		int r = 0;
		int sum = 0;
		int t;
		t = num;
		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (t == sum) {
			System.out.println("Palindrome Number");
		} else {
			System.out.println("NOT Palindrome number");

		}

		
//		int number=868;
//		int reversed=0;
//		
//		while(number>0) {
//			reversed=reversed*10+number%10;// 8
//			number=number/10;
//		}
//		System.out.println(reversed);
//		if(reversed==number) {
//			System.out.println("palidrome");
//		}else {
//			System.out.println("not palidrome");
//		}
		
	}

	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		isPalindromNumber(151);
		isPalindromNumber(765);
	}

}
