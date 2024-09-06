package com.demo.bitypefunction;

import java.util.function.BiFunction;

class Employee{
	String name;
	int dailywage;
	
	public Employee(String name,int dailywage) {
		this.name = name;
		this.dailywage= dailywage;
	}
}

class Timesheet{
	String name;
	int workhdays;
	
	public Timesheet(String name, int workhdays) {
		this.name= name;
		this.workhdays= workhdays;
	}
}
public class BiFunctionDemo3 {
  public static void main(String[] args) {
	
	  Employee e = new Employee("durga",1500);
	  Timesheet timesheet = new Timesheet("durga",25);
	  
	  BiFunction<Employee, Timesheet, Integer> function = (emp,time)->emp.dailywage*time.workhdays;
	  
	  System.out.println(function.apply(e, timesheet));
	
}
}
