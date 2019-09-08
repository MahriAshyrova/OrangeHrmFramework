package com.orangehrm.practice;

public class ReverseINteger {

	public static void main(String[] args) {
		
		
		// reverse an integer 
		
		int b = 57;
		
	String a=Integer.toString(b);	
	String reversed="";
	
	
	for (int i=a.length()-1; i>=0; i--) {
		reversed=reversed+a.charAt(i);
	}
		
	System.out.println(reversed);	
		
		
	int num=45;
	int rev=0;
	
	
	while(num>0) {
		
		rev=rev*10+num%10;
		num=num/10;
	}
		
	System.out.println(rev);	
		
		
		
//		String A = Integer.toString(B);   // or String.ValueOf(a); 
//		String reverse = "";
//		
//		for (int i = A.length()-1; i>=0; i--) {
//			reverse =reverse+ A.charAt(i);
//		}
//		
//		System.out.println(reverse);	
//	
//		
//	int num=35;	
//	int rev=0;
//        
//        while(num>0) {
//            rev=rev*10+num%10;
//            num=num/10;
//        }
//        System.out.println(rev);
        
 
    }
	}
