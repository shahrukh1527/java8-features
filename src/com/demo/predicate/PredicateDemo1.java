package com.demo.predicate;

import java.util.function.Predicate;

public class PredicateDemo1 {

	public static void main(String[] args) {
		Predicate<Integer> p = i-> i>100;
		System.out.println(p.test(103));
		System.out.println(p.test(10));
		
		Predicate<Integer> p1 = i-> i%2==0;
		
		System.out.println(p1.test(222));
		System.out.println(p1.test(23));
	}
}
