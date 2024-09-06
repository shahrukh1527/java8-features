package com.demo.bitypefunction;

import java.util.function.BiConsumer;

public class BiConsumerDemo1 {
	public static void main(String[] args) {
          BiConsumer<String, String> consumer = (s1,s2) -> System.out.println(s1+s2);
          
          consumer.accept("durga", "soft");
	}
}
