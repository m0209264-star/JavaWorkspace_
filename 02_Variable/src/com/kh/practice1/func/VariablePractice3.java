package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로 :");
		double width = sc.nextDouble();
		
		System.out.println("세로 :");
		double height = sc.nextDouble();
		
		double dNum = width * height;
		double dNum2 = (width + height)*2;
		
		System.out.println("면적 : "+ dNum);
		System.out.println("둘레 : "+ dNum2);
		
	}
	
}
