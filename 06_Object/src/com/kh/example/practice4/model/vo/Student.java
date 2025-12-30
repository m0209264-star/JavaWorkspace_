package com.kh.example.practice4.model.vo;

public class Student {
	private static int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	static {
		grade = 1;
	}
	
	{
		classroom = 3;
		name ="문승주";
		height = 170.0;
		gender = 'M';
	}
	
	public Student() {
		
	}
	
	public void information() {
		System.out.println(grade+", "+classroom+", "+name+", "+
				height+", "+gender+" ");
		
	}
}
