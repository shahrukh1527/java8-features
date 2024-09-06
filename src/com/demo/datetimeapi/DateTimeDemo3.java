package com.demo.datetimeapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeDemo3 {
	public static void main(String[] args) {
		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println(zoneId);
		System.out.println();
		
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime dateTime = ZonedDateTime.now(la);
		System.out.println(dateTime);
	}
}
