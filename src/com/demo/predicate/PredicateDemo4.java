package com.demo.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateDemo4 {
  public static void main(String[] args) {
	String[] s = {"ravi",null,"shiva","","aman",""};
	
	Predicate<String> checkNull= s1-> s1!=null && s1.length()!= 0 ;
	
	ArrayList<String> list = new ArrayList<String>();
	
	for(String check:s) {
		if(checkNull.test(check))
			list.add(check);
	}
	
	System.out.println(list);
}
}
