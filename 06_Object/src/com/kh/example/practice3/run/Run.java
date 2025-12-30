package com.kh.example.practice3.run;

import com.kh.example.practice3.model.vo.Circle;

public class Run {
	public static void main(String[] args) {
		Circle cir = new Circle();
		cir.getAreaOfCircle(); // 원 둘레 출력
		cir.getSizeOfCircle(); // 원 넓이 출력
		
		cir.incrementRadius(); // 반지름 1 증가
	
		cir.getAreaOfCircle(); // 원 둘레 출력
		cir.getSizeOfCircle(); // 원 넓이 출력
	}
}
