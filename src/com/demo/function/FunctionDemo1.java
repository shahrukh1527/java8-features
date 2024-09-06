package com.demo.function;

import java.util.function.Function;

public class FunctionDemo1 {

	public static void main(String[] args) {
		// get the length of a string
		Function<String, Integer> checkLength = s -> s.length();
		System.out.println(checkLength.apply("shahrukh"));
		System.out.println(checkLength.apply("durga"));

		Function<Integer, Integer> doSquare = num -> num * num;
		System.out.println(doSquare.apply(6));

		// find the string without any spaces
		String s = "durga software solutions ltd";
		Function<String, String> removeSpcae = s1 -> s1.replaceAll(" ", "");

		System.out.println(removeSpcae.apply(s));

		// count spaces
		// find the string without any spaces
		String s2 = "durga  software  solutions  ltd";
		Function<String, Integer> countSpace = s3 -> s3.length() - s3.replaceAll(" ", "").length();

		System.out.println(countSpace.apply(s2));

	}

}
