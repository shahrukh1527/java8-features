package com.demo.functionalinter;

import java.util.function.Predicate;

public class PredicateDemo1 {

	public static void main(String[] args) {
		Predicate<Integer> lessThan = i-> (i<20);
		
		System.out.println("50=="+lessThan.test(50));
		System.out.println("68=="+lessThan.test(68));
		System.out.println("18=="+lessThan.test(18));
	}
}
