package com.demo.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
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
}

public class ConsumerDemo2 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		populate(list);
		
		Predicate<Student> predicate = student-> student.marks>60;

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

		Consumer<Student> consumer = student->{
	    	System.out.println(student.name+" : "+student.marks+" : "+marks.apply(student));
	    	System.out.println();
	    };
	    
	    for (Student st : list) {
	    	if(predicate.test(st)) {
	    		consumer.accept(st);
	    	}
	    }
	}

	public static void populate(ArrayList<Student> list) {
		list.add(new Student("mohan", 85));
		list.add(new Student("raghav", 78));
		list.add(new Student("shyam", 59));
		list.add(new Student("priya", 55));
		list.add(new Student("ratnesh", 32));
		list.add(new Student("soumya", 95));
	}

}
