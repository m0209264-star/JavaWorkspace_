package com.kh.example.practice6.model.vo;

public class Book {
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	
	public Book() {
		
	}
	
	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	
	public Book(String title, String publisher, String author,
			int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public void setTitle() {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setPublisher() {
		this.publisher = publisher;
	}
	
	public String getPublisher() {
		return this.publisher;
	}
	
	public void setAuthor() {
		this.author = author;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public void setPrice() {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setDiscountRate() {
		this.discountRate = discountRate;
	}
	
	public double getDiscountRate() {
		return this.getDiscountRate();
	}
	
	public void inform() {
	       System.out.println("제목: " + title);
	       System.out.println("출판사: " + publisher);
	       System.out.println("작가: " + author);
	       System.out.println("가격: " + price);
	       System.out.println("할인율: " + discountRate);
	       System.out.println("------------------------");
	    }
	}











