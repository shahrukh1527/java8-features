package com.demo.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo4 {
	public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<Integer>();
      
      list.add(12);
      list.add(3);
      list.add(555);
      list.add(7);
      list.add(1);
      list.add(123);
      list.add(0);
      
      List<Integer> list2 = list.stream().sorted().collect(Collectors.toList());
//      List<Integer> list3 = list.stream().sorted((i1,i2)-> -i1.compareTo(i2)).collect(Collectors.toList());
      List<Integer> list3 = list.stream().sorted((i1,i2)-> i2.compareTo(i1)).collect(Collectors.toList());
      System.out.println(list2);
      System.out.println(list3);
      
      Integer min = list.stream().min((i1,i2)-> i1.compareTo(i2)).get();
      System.out.println(min);
      
      Integer max = list.stream().max((i1,i2)-> i1.compareTo(i2)).get();
      System.out.println(max);
      
      ArrayList<String> list4= new ArrayList<String>();
      
      list4.add("A");
      list4.add("BB");
      list4.add("CCC");
     
      list4.stream().forEach(s->System.out.println(s));
      list4.stream().forEach(System.out::println);
      
      Integer[] array = list.stream().toArray(Integer[]::new);
      
      for(Integer x: array) {
    	  System.out.println(x);
      }
      
      Stream<Integer> s =Stream.of(9,99,999,9999);
      s.forEach(System.out::println);
      
      Double[] d = {10.0,10.1,10.2,10.3,10.4};
      Stream<Double> s1 = Stream.of(d);
      s1.forEach(System.out::println);
	}
}
