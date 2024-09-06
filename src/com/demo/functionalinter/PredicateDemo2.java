//filter string with lenth greater than 2 and even
package com.demo.functionalinter;

import java.util.function.Predicate;

public class PredicateDemo2 {

	public static void main(String[] args) {
		String[] s= {"sfds","sdcsdcsdd","dsddsdd","dssd"};
		
		Predicate<String> checkLength = s1-> s1.length()>5;
		
		for(String name:s)
		{
			if(checkLength.test(name))
			{
				System.out.println("Name "+name);
			}	
		}	
		
		//
        Predicate<String> evenLength = s1-> s1.length()%2==0;
		
		for(String name:s)
		{
			if(evenLength.test(name))
			{
				System.out.println("Even length Name "+name);
			}	
		}	
	}
}

