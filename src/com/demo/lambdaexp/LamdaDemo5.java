package com.demo.lambdaexp;

import java.util.ArrayList;
import java.util.Collections;

//class MyComparator implements Comparator<Integer>{
//
//	@Override
//	public int compare(Integer o1, Integer o2) {
////		if(o1>o2) {
////			return -1;
////		} else if(o1<o2) {
////			return +1;
////		} else {
////			return 0;
////		}
//		return (o1>o2)?-1:(o1<o2)?+1:0;
//	}
//	
//}

public class LamdaDemo5 
{
  public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	list.add(10);
	list.add(0);
	list.add(15);
	list.add(20);
	list.add(34);
	list.add(26);
	
	System.out.println("Before Sorting"+list);
	
//	Collections.sort(list, new MyComparator());
	Collections.sort(list, (o1,o2)->  (o1>o2)?-1:(o1<o2)?+1:0);
	
	System.out.println("After Sorting"+list);
}
}
