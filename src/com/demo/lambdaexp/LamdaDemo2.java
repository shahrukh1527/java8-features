package com.demo.lambdaexp;

interface Interf1 {
	public int add(int a,int b);
}

////normal impl
//class Demo1 implements Interf1{
//	@Override
//	public int add(int a ,int b) {
//		return a+b;
//		
//	}
//}
public class LamdaDemo2 {
	public static void main(String[] args) {
		// normal impl
//    Interf1 interf = new Demo1();
//    int result1= interf.add(10,20);
//    int result2= interf.add(100,200);
    

//	  IMplementation with lambda
		Interf1 i = (a,b) -> a+b;

		int result1 = i.add(30, 20);
		int result2 = i.add(60, 80);
		
	    System.out.println("result1: "+result1);
	    System.out.println("result2: "+result2);


	}
}
