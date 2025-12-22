package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수 : ");
		int first = sc.nextInt();
		
		System.out.println("두 번째 정수 : ");
		int second = sc.nextInt();
		
		int iNum = first + second;
		int iNum2 = first - second;
		int iNum3 = first * second;
		int iNum4 = first % second;
		
		System.out.println("더하기 결과 : " + iNum);
		System.out.println("빼기 결과 : " + iNum2);
		System.out.println("곱하기 결과: " + iNum3);
		System.out.println("나누기 몫 결과: " + iNum4);
	}
}
