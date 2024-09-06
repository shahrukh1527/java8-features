package com.demo.doublecolonoperator;

public class ObjectReferrenceDemo1 {
	public void m2() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
	
	public static void main(String[] args) {
		ObjectReferrenceDemo1 demo2 = new ObjectReferrenceDemo1();
		Runnable r = demo2::m2;
		Thread thread = new Thread(r);
		thread.start();
	
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
		
	}
}
