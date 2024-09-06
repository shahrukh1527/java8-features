package com.demo.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Employee {
	public String name;
	public Integer salary;

	public Employee(String name, Integer salary) {
		this.name = name;
		this.salary = salary;
	}
}

public class FunctionDemo3 {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();

		populate(list);
		
		Function<List<Employee>, Integer> f = l->{
			Integer sal=0;
			for(Employee e:l) {
				sal=sal+ e.salary;
			}
			return sal;	
		};
		
		System.out.println(f.apply(list));
	}
	
	public static void populate(ArrayList<Employee> list) {
		list.add(new Employee("sunny",20000));
		list.add(new Employee("bunny",24000));
		list.add(new Employee("chinny",45000));
		list.add(new Employee("vinny",22000));
		list.add(new Employee("durga",80000));
	}
}
