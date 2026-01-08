package com.kh.practice.leap.view;

import java.util.Calendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	
	
	public LeapView() {
		LeapController lc = new LeapController();
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		
		boolean isLeap = lc.isLeapYear(year);
		System.out.println(year +"년은 "+ (isLeap ? "윤년" : "평년") + "입니다.");
		
		long totalDays = lc.leapDate(now);
		System.out.println("총 날짜 수 : " + totalDays);
	}
}
