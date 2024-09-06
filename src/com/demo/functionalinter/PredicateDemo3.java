package com.demo.functionalinter;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
	String name;
	Integer salary;

	public Employee(String name, Integer salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
}

public class PredicateDemo3 {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();

		list.add(new Employee("A", 1000));
		list.add(new Employee("B", 2000));
		list.add(new Employee("C", 3000));
		list.add(new Employee("D", 4000));
		list.add(new Employee("E", 5000));
		list.add(new Employee("F", 6000));

		Predicate<Employee> p = e1 -> e1.salary > 3000;

		for (Employee emp : list) {
			if (p.test(emp)) {
				System.out.println("Employee Name: " + emp.name + "Employee salary" + emp.salary);
			}
		}
	}
}
