package com.demo.bitypefunction;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

class Employeee{
	public String name;
	public double salary;
	
	public Employeee(String name,double salary) {
		this.name=name;
		this.salary=salary;
	}
}
public class BiConsumerDemo2 {
  public static void main(String[] args) {
     BiFunction<String, Double, Employeee> biFunction =(name,salary)-> new Employeee(name, salary);
     
     ArrayList<Employeee> list = new ArrayList<Employeee>();
     list.add(biFunction.apply("sunny", 20000.0));
     list.add(biFunction.apply("bunny", 23000.0));
     list.add(biFunction.apply("chinny", 21000.0));
     list.add(biFunction.apply("vinny", 25000.0));
     
     
     
     BiConsumer<Employeee, Double> consumer = (emp,sal)-> emp.salary=emp.salary+sal;
     
     for(Employeee emp: list) {
    	 consumer.accept(emp, 500.0);
     }
     
     for(Employeee emp: list) {
    	 System.out.println(emp.name+""+emp.salary);
     }
}
}
