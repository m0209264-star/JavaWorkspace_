package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		for(int i = 1; i<=num; i++) {
			System.out.print(i+ " ");
		}
		
		if(num <1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			practice1();
		}
		
		/*
		 * 	while(num <1) {
			System.out.println("1이상의 숫자를 입력해주세요. ");
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
		}
		for(int i = 1; i<=num; i++) {
			System.out.print(i + " ");
		}
		 */
			
	}
	public void practice2() {
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		for(int i = num; i > 0; i--) {
			System.out.print(i+ " ");
		}
		
		if(num <1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			practice2();
		}
		/*
		 * System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		while(num<1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
			System.out.println("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
		}
		for(int i = num; i>= 1; i--) {
			System.out.print(i + " ");
		}
		 */
	}
	public void practice3() {
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num= sc.nextInt();
		int sum = 0;
		
		for(int i =1; i <=num; i++) {
			sum += i; // 1부터 정수까지의 합.
			System.out.print(i + (i != num ? " + ": " = "));
		}
		System.out.print(sum);
		/*
		 * for(int i = 1; i <= num; i++) {
		 * sum += i; // 1부터 정수까지의 합.
			System.out.print(i);
			
			if(i<num) {
				System.out.print(" + ");
			}
		}
		System.out.println(" = " + sum);
		 */
		
	}
	public void practice4() {
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(!(num1 > 0 && num2 > 0)) {
			System.out.println("1이상의 수를 입력해주세요.");
			practice4();
			return;
		}
		
		int min = num1 > num2 ? num2 : num1;
		int max = num1 > num2 ? num1 : num2;
		
		for(int i = min; i<=max; i++) {
			System.out.print(i + " ");
		}
		
		/*
		 * 	System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
		
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
		
			while(num1 < 1 || num2 <2) {
			System.out.println("1이상의 숫자를 입력해주세요.");
			
			System.out.print("첫 번째 숫자 : ");
			num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			num2 = sc.nextInt();
			}
			if(num1 <= num2) {
			for(int i = num1; i<=num2; i++) {
				System.out.print(i + " ");
				}
		    }else {
			for(int i = num2; i<=num1; i++) {
				System.out.print(i + " ");
				}
		    }
		 */
		}
	public void practice5() {
		while(true) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();
		
			if(num >9) {
			System.out.println("9이하의 숫자만 입력해주세요.");
			continue;
		}
		
			for(int dan = num; dan <= 9; dan ++) {
				System.out.println("====="+dan+" 단 =====");
				for(int i = 1; i<=9; i++) {
					System.out.println(dan+ " X " +i+ " = " + (dan*i));
			}
		}
			break;
	}
		/*
		 *	System.out.print("숫자 : ");
			int num = sc.nextInt();
		
			while(num >9) {
			System.out.println("9이하의 숫자만 입력해주세요.");
			
			System.out.print("숫자 : ");
			num = sc.nextInt();
			}
			for(int i =num; i<=9; i++) {
			System.out.println("====" + i + "단" + "====");
			} 
		 */
		}
	public void practice6() {
		System.out.print("시작 숫자 : ");
		int num = sc.nextInt();
		
		System.out.print("공차 : ");
		int gong = sc.nextInt();
		
		//10회 반복하라
		for(int i =0; i< 10; i++) {
		System.out.print(num+ " ");	
		num += gong;
		}
	}
	public void practice7() {
		System.out.print("연산자(+, -, *, /, %, exit) : ");
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		}
	public void practice8() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j =1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			}
		}
	public void practice9() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i =num; i>= 1; i--) {
			for(int j =i; j>= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void practice10() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num <2) {
			System.out.print("잘못 입력하셨습니다.");
			return;
		}
		int count = 0;
		for(int i = 1; i <=num; i++) {
			if(num % i ==0) {
				count++;
			}
		}
		if(count ==2) {
			System.out.print("소수입니다.");
		}else {
			System.out.print("소수가 아닙니다.");
		}
	}
	public void practice11() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num <2) {
			System.out.print("잘못 입력하셨습니다.");
			return;
		}
	}
	public void practgce12() {
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
	}
}
