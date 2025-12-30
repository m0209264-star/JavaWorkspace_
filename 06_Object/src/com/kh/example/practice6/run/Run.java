package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.inform();
		
		Book b2 = new Book("자바기초", "abc", "abc");
		b2.inform();
		
		Book b3 = new Book("자바기초", "abc", "abc", 20000, 0.5);
		b3.inform();
	}
}





