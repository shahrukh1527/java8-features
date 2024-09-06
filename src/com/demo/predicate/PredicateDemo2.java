package com.demo.predicate;

import java.util.function.Predicate;

public class PredicateDemo2 {

	public static void m1(int []x,Predicate<Integer> p) {
		for(int x1:x) {
			if(p.test(x1)) {
				System.out.print(x1+" ");
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Predicate<Integer> p1 = m-> m>20;
		Predicate<Integer> p2 = n-> n%2==0;
		
		int[] x = {22,3,44,6,45,77,78,90};
		
		System.out.println("The numbers greater than 20");
		m1(x,p1);
		
		System.out.println("Even numbers");
		m1(x,p2);

		System.out.println("Even numbers greater than 20");
		m1(x,p1.and(p2));
		
		System.out.println("Numbers less than 20");
		m1(x,p1.negate());
		
		System.out.println("Even or greater than 20");
		m1(x,p1.or(p2));
		
		
	}
}
