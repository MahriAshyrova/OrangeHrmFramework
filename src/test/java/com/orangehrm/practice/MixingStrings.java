package com.orangehrm.practice;

public class MixingStrings {

	public static void main(String[] args) {
		
//		MixingStrings mix= new MixingStrings();
//		System.out.println(mix.reverse("10000", "hello"));
		
		
		String c="hello";
		String d="mello";
	
		String mixed="";
		
		if(c.length()==d.length()) {
			for(int i=0; i<c.length(); i++) {
				mixed=mixed+c.charAt(i)+d.charAt(i);
			}		
		} else {
			System.out.println("Strings are not the same length");
		}
		
		System.out.println(mixed);
			
	}

//	public String reverse(String a, String b) {
//		String mix="";
//		if(a.length()==(b.length())) {
//		 for (int i = 0; i < a.length(); i++) {
//                 mix=mix+a.charAt(i)+b.charAt(i);   
//		}
//		}else {
//			System.out.println("Strings are not the same length");
//			}
//
//		return (mix);	
//	}
}
