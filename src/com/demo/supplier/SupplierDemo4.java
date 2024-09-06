package com.demo.supplier;

import java.util.function.Supplier;

public class SupplierDemo4 {

	public static void main(String[] args) {
		Supplier<Integer> numsupp = () -> {
			return (int) (Math.random() * 10);
		};

		Supplier<Character> charsupp = () -> {
			String abc = "$#@ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			return abc.charAt((int) (Math.random() * 29));
		};

		String password = "";
		for (int i = 0; i < 8; i++) {
			if (i % 2 == 0) {
				password = password + charsupp.get();
			} else {
				password = password + numsupp.get();
			}
		}
		System.out.println(password);
	}
}
