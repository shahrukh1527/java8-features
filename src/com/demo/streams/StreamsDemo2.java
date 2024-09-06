package com.demo.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		
		l1.add(0);
		l1.add(10);
		l1.add(15);
		l1.add(20);
		l1.add(25);
		l1.add(3);
		l1.add(34);
		
		List<Integer> l2 = l1.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		List<Integer> l3 = l1.stream().map(i->i*2).collect(Collectors.toList());
		
		System.out.println(l2);
		System.out.println(l3);
		

	}

}
