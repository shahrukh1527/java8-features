package com.demo.defaultmethods;

interface Interf {
	default void m1() {
		System.out.println("Default implementation....");
	}
	
	
}

public class DefaultDemo1 implements Interf {

	@Override
	public void m1() {
		System.out.println("Custom implementation....");
	}

	public static void main(String[] args) {
		DefaultDemo1 demo = new DefaultDemo1();
		demo.m1();
	}

}
