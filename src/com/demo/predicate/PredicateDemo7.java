package com.demo.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
	String name;
	String designation;
	double salary;
	String city;

	public Employee(String name, String designation, double salary, String city) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}

	@Override
	public String toString() {
		String s = String.format("%s %s %.2f %s", name, designation, salary, city);
		return s;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee emp =(Employee)obj;
		if(name.equals(emp.name) && designation.equals(emp.designation) && salary==emp.salary && city.equals(emp.city)) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class PredicateDemo7 {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();

		populate(list);

//		System.out.println(list);
		
		Predicate<Employee> indoreEmployee = emp-> emp.city.equals("Indore");
		System.out.println("Indore People Information");
		display(indoreEmployee, list);
		
		Predicate<Employee> managerEmployee = emp-> emp.designation.equalsIgnoreCase("Manager");
		System.out.println("Manager Information");
		display(managerEmployee, list);
		
		Predicate<Employee> salaryLessThan20k = emp-> emp.salary<20000;
		System.out.println("Employee with salary less than 20000");
		display(salaryLessThan20k, list);
		
		System.out.println("Indore Manager to give pink slip...");
		display(indoreEmployee.and(managerEmployee), list);
		
		System.out.println("Either manager or salary less than 20000...");
		display(managerEmployee.or(salaryLessThan20k), list);
		
		System.out.println("Employee who are not managers...");
		display(managerEmployee.negate(), list);
		
		Predicate<Employee> isCEO = Predicate.isEqual(new Employee("suresh", "ceo", 50000, "delhi"));
		
		Employee ceo1 = new Employee("suresh", "ceo", 50000, "delhi");
		Employee ceo2 = new Employee("bhanu", "dev", 50000, "delhi");
		
		System.out.println(isCEO.test(ceo1));
		System.out.println(isCEO.test(ceo2));
	}

	public static void populate(ArrayList<Employee> list) {
		list.add(new Employee("mohan", "CEO", 20000, "Indore"));
		list.add(new Employee("raghav", "CEO", 20000, "Mumbai"));
		list.add(new Employee("shyam", "Manager", 22000, "Delhi"));
		list.add(new Employee("priya", "UI UX", 14000, "Indore"));
		list.add(new Employee("ratnesh", "Marketing", 16000, "Bhopal"));
		list.add(new Employee("rahul", "Developer", 12000, "Surat"));
		list.add(new Employee("ram", "MANAGER", 12000, "Indore"));
	}

	public static void display(Predicate<Employee> p, ArrayList<Employee> list) {
		for (Employee emp : list) {
			if (p.test(emp)) {
				System.out.println(emp);
			}
		}
		
		System.out.println("..............................................");
	}

}
