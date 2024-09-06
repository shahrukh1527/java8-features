package com.demo.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	String name;
	Integer marks;

	public Student(String name, Integer marks) {
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		String s = String.format("%s %s %.2f %s", name, marks);
		return s;
	}

	@Override
	public boolean equals(Object obj) {
		Student emp = (Student) obj;
		if (name.equals(emp.name) && marks.equals(emp.marks)) {
			return true;
		} else {
			return false;
		}
	}
}

public class FunctionDemo2 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();

		populate(list);

//		System.out.println(list);

		Function<Student, String> marks = student -> {
			int mark = student.marks;
			if (mark >= 90) {
				return "A Grade";
			} else if (mark >= 75) {
				return "B Grade";
			} else if (mark >= 60) {
				return "C Grade";
			} else if (mark >= 35) {
				return "D Grade";
			} else {
				return "E Grade";
			}
		};
		
		display(marks, list);

	}

	public static void populate(ArrayList<Student> list) {
		list.add(new Student("mohan", 85));
		list.add(new Student("raghav", 78));
		list.add(new Student("shyam", 59));
		list.add(new Student("priya", 55));
		list.add(new Student("ratnesh", 32));
		list.add(new Student("soumya", 95));
	}

	public static void display(Function<Student, String> f, ArrayList<Student> list) {
		 
		for (Student student : list) {
			Predicate<Student> p = stud-> stud.marks>=60;
			if(p.test(student)) {
				System.out.println(student.name);
				System.out.println(student.marks);
				System.out.println(f.apply(student));
				System.out.println("..............................................");
			}	
		}

		
	}

}
