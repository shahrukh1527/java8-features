package com.demo.lambdaexp;

import java.util.TreeMap;
import java.util.TreeSet;

public class LamdaDemo6 {
  public static void main(String[] args) {
	  
	//treeset
	TreeSet<Integer> set = new TreeSet<Integer>((o1,o2)->  (o1>o2)?-1:(o1<o2)?+1:0);
	
	set.add(10);
	set.add(0);
	set.add(20);
	set.add(35);
	set.add(14);
	set.add(12);
	
	System.out.println("Sorted set based on desc order"+set);
	
	//treemap
	
	TreeMap<Integer, String> map = new TreeMap<Integer, String>((o1,o2)->  (o1>o2)?-1:(o1<o2)?+1:0);
	
	map.put(100, "sunny");
	map.put(20, "bunny");
	map.put(300, "vinny");
	map.put(10, "shyam");
	map.put(40, "ram");
	map.put(23, "sumu");
	
	System.out.println("map desc"+map);
}
}
