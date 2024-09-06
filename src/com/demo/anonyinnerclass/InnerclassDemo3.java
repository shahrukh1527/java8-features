package com.demo.anonyinnerclass;

public class InnerclassDemo3 {
	public static void main(String[] args) {

		// replacing--anonymous inner class---with lambda expression
//		Runnable r = () -> {
//			for (int i = 0; i < 10; i++) {
//				System.out.println("Runnable thread" + i);
//			}
//		};

		Thread thread = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Runnable thread" + i);
			}
		});
		thread.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread" + i);
		}
	}
}
