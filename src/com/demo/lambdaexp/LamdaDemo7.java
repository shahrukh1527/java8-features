package com.demo.lambdaexp;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
	Integer id;
	String name;
	
	Employee(Integer id, String name){
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return id+" : "+name;
	}
}
public class LamdaDemo7 {
   public static void main(String[] args) {
	
	ArrayList<Employee> emp = new ArrayList<>();  
	emp.add(new Employee(100, "ram"));
	emp.add(new Employee(34, "shyam"));
	emp.add(new Employee(22, "mohan"));
	emp.add(new Employee(322, "vijay"));
	emp.add(new Employee(3, "hiren"));
	emp.add(new Employee(14, "guru"));
	
	Collections.sort(emp, (emp1,emp2)->(emp1.id<emp2.id)?-1:(emp1.id>emp2.id)?1:0);
	
	System.out.println(emp);
}
}
