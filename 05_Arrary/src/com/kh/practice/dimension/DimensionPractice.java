package com.kh.practice.dimension;

import java.util.Arrays;
import java.util.Scanner;

public class DimensionPractice {
	public void practice1() {
		String [][] arr = new String [3][3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = "(" + i + ", "+ j + ")";
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}
	public void practice2() {
		int [][] arr = new int[4][4];

		int value =1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
		System.out.println();
		}
	}
	public void practice3() {
		int [][] arr = new int[4][4];
	
		int value =16;
		for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {
			arr[i][j] = value--;
		}
	}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
	public void practice4() {
		int [][] arr = new int[4][4];
		for(int i =0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = (int)(Math.random() *10 +1);
				arr[i][3] += arr[i][j];
				arr[3][j] += arr[i][j];
				arr[3][3] += arr[i][j];
				}
			
			}
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 크기 : ");
		int num1 = sc.nextInt();
		
		System.out.print("열 크기 : ");
		int num2 = sc.nextInt();
	}
}
