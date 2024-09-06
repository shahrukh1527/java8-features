package com.demo.defaultmethods;

interface Left {
	default void m1() {
		System.out.println("Default left implementation....");
	}
}

interface Right {
	default void m1() {
		System.out.println("Default right implementation....");
	}
}

public class DefaultDemo2 implements Left,Right {

	@Override
	public void m1() {
//		System.out.println("Custom implementation....");
		Left.super.m1();
		Right.super.m1();
	}

	public static void main(String[] args) {
		DefaultDemo2 demo = new DefaultDemo2();
		demo.m1();
	}

}
