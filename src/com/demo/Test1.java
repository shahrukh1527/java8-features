package com.demo;

//class MyRunnable implements Runnable{
//	@Override
//	public void run() {
//		for(int i=0;i<=10;i++) {
//			System.out.println("Child Object");
//		}
//	}
//}

public class Test1 {
 
	public static void main(String[] args) {
//		MyRunnable r = new MyRunnable();
//		Thread t = new Thread(r);
//		t.start();
		
		Runnable r = ()->{
			for(int i=0;i<=10;i++) {
				System.out.println("Child Object1");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Parent Thread1");
		}
	}
	
}
