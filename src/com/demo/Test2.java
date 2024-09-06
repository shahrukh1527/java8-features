package com.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

//class MyComparator implements Comparator<Integer>
//{
//	public int compare(Integer i1,Integer i2)
//	{
//		if(i1<i2)
//		{
//			return -1;
//		} else if(i1>i2) {
//			return +1;
//		} else {
//			return 0;
//		}
//	}
//
//	
//}
public class Test2
{
  public static void main(String[] args) {
	
	  ArrayList<Integer> list = new ArrayList<Integer>();
	  
	  list.add(20);
	  list.add(30);
	  list.add(40);
	  list.add(50);
	  list.add(5);
	  list.add(78);
	  list.add(99);
	  
	  System.out.println(list);
	  
	  Comparator<Integer> c = (i1,i2)-> (i1<i2) ?-1:(i1>i2)?1:0;	  
//	  Collections.sort(list, new MyComparator()) ;
	  Collections.sort(list, c) ;
	  
	  System.out.println(list);
}
}
