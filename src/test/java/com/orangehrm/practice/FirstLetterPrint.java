package com.orangehrm.practice;

public class FirstLetterPrint {

	public static void main(String[] args) {
		
		String n = "TomTeagTif";
        
		FirstLetterPrint obj = new FirstLetterPrint ();  
		obj.fl(n);
		System.out.println(obj.fl(n));

	}
	public String fl(String name) {
        String result = "";
        char f;
         String[]list=name.split(" ");
         for(int i=0; i<list.length; i++) {
             String first=list[i];
             f=first.charAt(0);
             
             result+=(f + ".");     
             
         }
         return result;	        
     }
}
