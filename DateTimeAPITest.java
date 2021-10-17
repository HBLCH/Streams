package com.myapp;

import java.time.LocalDate;
import java.time.LocalDateTime;

/*
 *We have java.util.date and javx.sql.date
 * 
 * */
public class DateTimeAPITest {
	
	
public static void main(String[] args) {
	LocalDateTime curentTime=LocalDateTime.now();
	System.out.println(curentTime);
	LocalDate date=curentTime.toLocalDate();
	
}
}
