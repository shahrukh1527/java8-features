package com.demo.streams;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsDemo1 {
	
	public static void main(String[] args) {
		String input="Hello world";
		
		Map<Character, Long> charactercount = input.chars()
				.mapToObj(c-> (char) c)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		 charactercount.forEach((character, count) -> System.out.println(character + ": " + count));
		

	}
}
