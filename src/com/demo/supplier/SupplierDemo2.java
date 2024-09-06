package com.demo.supplier;

import java.util.function.Supplier;

public class SupplierDemo2 {
	public static void main(String[] args) {
        Supplier<String> s=()->{
        	String[] st = {"sunny","bunny","chinny","vinny"};
        	int i= (int) (Math.random()*4);
        	return st[i];
        };
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
	}
}
