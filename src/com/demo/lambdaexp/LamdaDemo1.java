package com.demo.lambdaexp;



interface Interf{
	public void m1();
}

////normal impl
//class Demo implements Interf{
//	@Override
//	public void m1() {
//		System.out.println("m1 method implementation");
//		
//	}
//}
public class LamdaDemo1
{
  public static void main(String[] args) {
	//normal impl
//    Interf interf = new Demo();
//    interf.m1();
	  
//	  IMplementation with lambda
	  Interf i=() -> System.out.println("method implementation using lambda");
	  
	  i.m1();
	  
	  
}
}
