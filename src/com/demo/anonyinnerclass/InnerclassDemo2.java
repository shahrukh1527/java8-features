package com.demo.anonyinnerclass;

public class InnerclassDemo2 {
	public static void main(String[] args) {
		
	//anonymous inner class starts	
//	Runnable r = new Runnable() {
//		public void run() {
//			for (int i = 0; i < 10; i++) {
//				System.out.println("Runnable thread"+i);
//			}
//		}
//	};
		//anonymous inner class ends	

		// replacing--anonymous inner class---with lambda expression
		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Runnable thread" + i);
			}
		};

		Thread thread = new Thread(r);
		thread.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread" + i);
		}
	}
}
