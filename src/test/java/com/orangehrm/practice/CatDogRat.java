package com.orangehrm.practice;

import java.util.*;

public class CatDogRat {

	public static void main(String[] args) {
		
		
	        String [] pet= { "cat", "cat", "dog", "dog", "rat"};
	        
	        Set <String> hset = new LinkedHashSet();
	        for (int i=0; i<pet.length-1; i++) {
	        	hset.add(pet[i]);
	        }
	        
	       // System.out.println(hset);
	        
	        
	        Set<String> set=new LinkedHashSet<>();
	        for(int i=0; i<pet.length-2; i++) {
	            set.add(pet[i]);   
	        }
	        //System.out.println(set);
	        
	        
	        String []pets= { "cat", "cat", "dog", "dog", "rat"};
	        
	        Set<String> hs=new LinkedHashSet<>();
	        Collections.addAll(hs,  pets);
	        for(String animal: hs) {
	        	if(!animal.equalsIgnoreCase("rat")) {
	        		System.out.print(animal+" ");
	        	}
	        }
	     
	}

}
