package com.demo.predicate;

import java.util.function.Predicate;

//program to check if software enginner is allowed in pub or not--
//Condition-age?18 and should have gf

class SoftwareEngineer{
	public String name;
	public int age;
	public boolean isHavingGf;
	
	public SoftwareEngineer(String name, int age, boolean isHavingGf) {
		this.name=name;
		this.age= age;
		this.isHavingGf= isHavingGf;
		
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
public class PredicateDemo6 {
   public static void main(String[] args) {
       
	  SoftwareEngineer[] engineers = {
			  new SoftwareEngineer("shyam", 12, false),
			  new SoftwareEngineer("mohan", 12, true),
			  new SoftwareEngineer("vikas", 22, true),
			  new SoftwareEngineer("priya", 25, false),
			  new SoftwareEngineer("ramesh", 20, true)
	  } ;
	  
	  Predicate<SoftwareEngineer> isallowed = enginner -> enginner.age>18 && enginner.isHavingGf;
	  
	  for(SoftwareEngineer engineer: engineers)
	  {
		  if(isallowed.test(engineer)) {
			  System.out.println(engineer+ "is Allowed...");
		  }
		  
	  }
}
}
