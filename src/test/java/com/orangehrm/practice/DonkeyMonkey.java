package com.orangehrm.practice;

public class DonkeyMonkey {

	public static void main(String[] args) {
		// Print numbers 1-30 but if the number is divisible by 3 I want it to print donkey 
		// and  if the number is divisible by 5 print monkey. How would you do it?


		for(int i=1; i<=30; i++) {
            if(i%3==0) {
                System.out.println(i+" donkey");
            }
            if(i%5==0) {
                System.out.println(i+" monkey");
            }
        }
		
		
	}

}
