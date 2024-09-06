package com.demo.bitypefunction;

import java.util.function.BiFunction;

public class BiFunctionDemo1 {
   public static void main(String[] args) {
	 BiFunction<Integer, Integer, Integer> biFunction = (a,b) -> a+b;
	 
	 System.out.println(biFunction.apply(23, 45));
}
}
