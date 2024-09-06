package com.demo.lambdaexp;

//class Demo4  implements Runnable{
//	public void run() {
//	  for (int i = 0; i < 10; i++) {
//		System.out.println("Another Thread");
//	}	
//	}
//}
public class LamdaDemo4 {
     
	public static void main(String[] args) {
//		Demo4 demo = new Demo4();
//		Thread t = new Thread(demo);
//		t.start();
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.println("main thread");
//		}
		
		Runnable r = ()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("Another Thread lambda");
			}
		};
		
		Thread thread = new Thread(r);
		
		thread.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread lambda");
		}
		
		
	}
}
