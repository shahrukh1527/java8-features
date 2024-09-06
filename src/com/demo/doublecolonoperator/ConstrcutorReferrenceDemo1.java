package com.demo.doublecolonoperator;

class Sample{
	public Sample() {
		System.out.println("Sample class object creation");
	}
}
interface Interf1{
	public Sample get();
}
public class ConstrcutorReferrenceDemo1
{
  public static void main(String[] args) {
	Interf1 interf1 = Sample :: new;
	Sample s = interf1.get();
}
}
