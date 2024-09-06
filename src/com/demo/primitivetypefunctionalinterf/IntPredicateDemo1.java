package com.demo.primitivetypefunctionalinterf;

import java.util.function.IntPredicate;

public class IntPredicateDemo1 {
	public static void main(String[] args) {
		IntPredicate predicate = i-> i%2==0;
		
		int[] x = {0,5,10,15,20,25,30};
		
		for(int x1:x) {
			if(predicate.test(x1))
			{
				System.out.println("num"+x1);
			}
			
		}
	}
}
 