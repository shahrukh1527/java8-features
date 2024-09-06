package com.demo.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Person {
	public String name;
	public Integer salary;

	public Person(String name, Integer salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + " " + salary;
	}
}

public class FunctionDemo4 {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();

		populate(list);

		Function<Person, Integer> f = l -> {
			return l.salary = l.salary + 333;
		};

		Predicate<Person> pred = person -> person.salary < 20000;

		ArrayList<Person> l2 = new ArrayList<Person>();
		for (Person p : list) {
			if (pred.test(p)) {
				System.out.println(f.apply(p));
				l2.add(p);
			}
		}

//		System.out.println(list); //all
		System.out.println(l2);   //employee whose salary got increased

	}

	public static void populate(ArrayList<Person> list) {
		list.add(new Person("sunny", 20000));
		list.add(new Person("bunny", 18000));
		list.add(new Person("chinny", 45000));
		list.add(new Person("vinny", 16000));
		list.add(new Person("durga", 80000));
	}
}
