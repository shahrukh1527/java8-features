package com.demo.datetimeapi;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;

public class DateTimeDemo2 {
  public static void main(String[] args) {
	LocalDate date = LocalDate.of(1997, 02, 15);
	LocalDate today = LocalDate.now();
	
	Period birthday = Period.between(date, today);
	
	System.out.printf("Year: %d Month: %d Day: %d",birthday.getYears(),birthday.getMonths(),birthday.getDays());
	System.out.println();
	
	LocalDate deathdate = LocalDate.of(2063, 02, 15);
	
	Period daysonEarth = Period.between(deathdate, today);
	
	int days= daysonEarth.getYears()*365+daysonEarth.getMonths()*30+daysonEarth.getDays();
	System.out.println(days);
	
	int checkLeap= 1981;
	System.out.println(Year.isLeap(checkLeap));
}
}
