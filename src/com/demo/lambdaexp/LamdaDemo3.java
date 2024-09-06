package com.demo.lambdaexp;

interface Inter3 {
	public int getLength(String s);
}

public class LamdaDemo3 {
	public static void main(String[] args) {
         Inter3 i = s-> s.length();
         System.out.println(i.getLength("durga"));
         System.out.println(i.getLength("shahrukh"));
	}
}

