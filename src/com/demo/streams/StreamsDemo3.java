package com.demo.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo3 {
   public static void main(String[] args) {
	   ArrayList<String> list = new ArrayList<String>();
	   
	   list.add("durga");
	   list.add("durgaprasad");
	   list.add("chiranjivi");
	   list.add("shyamaprasad");
	   list.add("abhinandan");
	   list.add("mohana");
	   
	   List<String> list2 = list.stream().filter(s-> s.length()>5).collect(Collectors.toList());
	   List<String> list3 = list.stream().map(s-> s.toUpperCase()).collect(Collectors.toList());
	   long count = list.stream().filter(s-> s.length()>5).count(); 
	  
	   
	   System.out.println(list2);
	   System.out.println(list3);
	   System.out.println(count);
}
}
