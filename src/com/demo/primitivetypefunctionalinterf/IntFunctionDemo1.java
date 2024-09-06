package com.demo.primitivetypefunctionalinterf;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class IntFunctionDemo1 {
  public static void main(String[] args) {
	ToIntFunction<String> function = s -> s.length();
	System.out.println(function.applyAsInt("durga"));
	
	Function<String,Integer> f2 = s -> s.length();
	System.out.println(f2.apply("durgasoft"));
	
	IntFunction<Integer> f3 = i-> i*i;
	System.out.println(f3.apply(5));
}
}
