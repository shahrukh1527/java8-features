package com.demo.bitypefunction;

import java.util.function.BiPredicate;

public class BiPredicateDemo1 {
	
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> biPredicate =(a,b)-> (a+b)%2==0;
		
		System.out.println(biPredicate.test(22, 23));
		System.out.println(biPredicate.test(5, 5));
		System.out.println(biPredicate.test(22, 22));
	}

}
