package com.demo.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeDemo1 {
  public static void main(String[] args) {
	LocalDate date = LocalDate.now();
	System.out.println(date);
	
	int dd= date.getDayOfMonth();
	int mm= date.getMonthValue();
	int yy= date.getYear();
	System.out.println(dd+"-"+mm+"-"+yy);
	System.out.printf("%d- %d- %d", dd,mm,yy);
	

	LocalTime time = LocalTime.now();
	System.out.println(time);
	int h=  time.getHour();
	int m=  time.getMinute();
	int s=  time.getSecond();
	int n=  time.getNano();
	
	System.out.printf("%d : %d : %d: %d", h,m,s,n);
	System.out.println();
	
	LocalDateTime dt = LocalDateTime.of(2017, 05, 21, 11, 22);
	System.out.println(dt);
}
}
