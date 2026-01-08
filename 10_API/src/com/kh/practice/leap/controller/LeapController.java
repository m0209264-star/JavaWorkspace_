package com.kh.practice.leap.controller;

import java.util.Calendar;

public class LeapController {
	
	public boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 !=0) ||(year % 400 ==0);		
	}
	
	public long leapDate(Calendar c) {
		long totalDays =0;
		int currentYear = c.get(Calendar.YEAR);
		int currentMonth = c.get(Calendar.MONTH);
		int currentDay = c.get(Calendar.DATE);
		
		for(int i = 1; i < currentYear; i++) {
			if(isLeapYear(i)) {
				totalDays += 366;
			}else {
				totalDays +=365;
			}
		}
		int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(isLeapYear(currentYear)) {
			monthDays[1]=29;
		}
		for(int i= 0; i< currentMonth; i++) {
			totalDays += monthDays[i];
		}
		
		totalDays += currentDay;
		
		return totalDays;
	}
	
}
