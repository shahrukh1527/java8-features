package com.demo.bitypefunction;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Student{
	Integer rollno;
	String name;
	
	public Student(int rollno, String name) {
        this.rollno= rollno;
		this.name =name;
	}
	
	@Override
	public String toString() {
		return rollno+": "+name;
	}
}
public class BiFunctionDemo2 {
  public static void main(String[] args) {
	BiFunction<Integer, String, Student> biFunction =(rollno, name)-> new Student(rollno,name);

	ArrayList<Student> list = new ArrayList<Student>();
	
	list.add(biFunction.apply(12, "durga"));
	list.add(biFunction.apply(13, "ravi"));
	list.add(biFunction.apply(14, "surya"));
	list.add(biFunction.apply(15, "aman"));
	
	for(Student l:list) {
		System.out.println(l);
	}
}
}
