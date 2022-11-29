package com.basics.dateandtime;
import java.text.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTime {

	public static void main(String[] args) {
		
		// we dont need new bcz we dnt wnt to craete a new object
		LocalDate today=LocalDate.now();
		System.out.println(today);
		
		LocalDateTime rightNow = LocalDateTime.now();
		System.out.println(rightNow);
		
		LocalDate thenD = LocalDate.of(2022,8,15);
		//LocalDate thenD = LocalDate.of(2022,Month.AUGUST,15);
		System.out.println(thenD);
		
		
		LocalTime t=LocalTime.now();
		System.out.println(t);
		
		//Date today=new Date();
		
		LocalTime t1=LocalTime.now(ZoneId.of("CET"));
		System.out.println(t1);
	}

}
