package com.demo.predicate;

import java.util.function.Predicate;

public class PredicateDemo3 {
  public static void main(String[] args) {
	//print names starting with k  
	Predicate<String> startsWithK = s-> s.charAt(0)=='K';
	
	String[] s = {"Katrina","Sunny","Bunny","Kareena","Kapoor"};
	
	for(String s1:s) {
		if(startsWithK.test(s1))
			System.out.println(s1);
	}
}
}
