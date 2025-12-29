package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);
	public void practice1() {
	//길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
	//역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
	//ex.10 9 8 7 6 5 4 3 2 1 
		int [] arr = new int [10];
		// [0,0,0,0,0,0,0,0,0,0]
		
		// 배열의 길이만큼 반복 진행
		// i => 0
		// i => 1 ...
		// 1 => 9
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 10 - i;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	public void practice2() {
	//사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
	//1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		System.out.print("양의 정수 : ");
		int num = sc.nextInt(); //5 
		
		int [] arr = new int [num]; // [0,0,0,0,0]
		
		for(int i = 0; i< arr.length; i++) {
			arr[i] = i +1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void practice3() {
	//10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
	//1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
		int [] arr = new int[10];
		for(int i = 0; i<arr.length; i++) {
		  arr[i] = (int)(Math.random() * 10 + 1);
		  System.out.print(arr[i] + " ");
		}	

	}
	
	public void practice4() {
	//“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
	//입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
	//범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요
		String [] arr = {"월" ,"화","수","목","금","토","일"};
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(!(num >=0 && num <=6)) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		System.out.println(arr[num]+"요일");
		
		/*
		 * 	if(num >= 0 && num <=6) {
			System.out.print(arr[num] + "요일"); 
			} else {
			System.out.print("잘못 입력하셨습니다. ");
			}
		 */
	}
	
	public void practice5() {
	//사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
	//배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
	//그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		for(int i = 0; i< arr.length; i++) {
			System.out.print("배열"+i+"번째 인덱스에 넣을 값 :");
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i]+ " ");
			sum += arr[i];
		}
		System.out.println("\n총합 :"+sum);
		
		
	/*
	 *  int [] arr = new int[num];
		int sum =0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("배열"+i+"번째 인덱스에 넣을 값 :");
			arr[i] = sc.nextInt();
			sum += i;
		}
		for(int i = 0; i< arr.length; i++) {
			int val = arr[i];
			System.out.print(val+ " ");
		}
		System.out.print("\n총 합: "+sum);
	 */
	}
	
	public void practice6() {
	//문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
	//문자의 개수와 함께 출력하세요.
	//hint) 중첩반복문
		System.out.print("문자열 : ");
		String str = sc.next();
		char[] arr = str.toCharArray();
		
		System.out.print("문자열에 있는 문자 : ");
		int count =0;
		// 전체 문자 반복
		for(int i =0; i <arr.length; i++) {
			char ch = arr[i]; // 중복인지 검사하자고자 하는 문자.
			
			// 문자 중복 검사
			// 현재 위치에서 앞쪽의 단어들 중 현재단어와 일치하는 값이 있는지 확인.
			boolean isDup = false;
			for(int j = 0; j<i; j++) {
				if(ch == arr[j]) {
					//중복
					isDup = true;
					break;
				}
			}
			if(!isDup) {
				System.out.print(ch+ ", ");
				count++;
			}
		}
		System.out.println("\n문자 개수 : "+ count);
	}
	
	public void practice7() {
	//문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
	//개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		System.out.print("문자열 : ");
		String str = sc.next();
		
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		
		char [] arr = str.toCharArray(); // 문자열을 문자배열로 변환하는 매서드.
		int count = 0;
		
		System.out.print(str+ "에 "+ch+"가 존재하는 위치(인덱스) : ");
		
		for(int i=0; i< arr.length; i++) {
			if(arr[i] == ch) {
				count++;
				System.out.print(i+ " ");
			}
		}
		System.out.print(ch+"의 개수 : "+count);
		/*
		 * 	char [] arr = new char[str.length()];
		for(int i = 0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		
		System.out.print(str+"에 " +ch+"가 존재하는 위치(인덱스) : ");
		
		int count =0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == ch) {
			System.out.print(i + " ");
			count++;
		}
	}
		System.out.println();
		System.out.print(ch + " 개수 :" + count);
		 */
}
	
	public void practice8() {
	//주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
	//단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
	// ex.
	// 주민등록번호(-포함) : 123456-1234567
	// 123456- 1******
		System.out.print("주민등록번호(-포함) : "); // 문자열 받기
		String str = sc.next();
		char [] origin = str.toCharArray(); // 문자열 => 문자 배열 변환 , 원본배열
		char [] copy = Arrays.copyOf(origin, origin.length); // 복사본
		
		//123456-1234567
		//123456-1******
		//주민번호 뒷자리 마스킹처리
		for(int i = 8; i < copy.length; i++) {
			copy[i] = '*';
		}
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i]);
		}

	}
	
	public void practice9() {
	//10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
	//1~10 사이의 난수를 발생시켜 배열에 초기화 후
	//배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
		int [] arr = new int[10];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
		// 최대값, 최소값
		int max =arr[0];
		int min =arr[0];
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]> max) {
			max = arr[i] ;
			}
			if(arr[i]< min) {
			min = arr[i];
			}
		}
		System.out.print("\n최대값 : " + max);
		System.out.print("\n최소값 : " + min);
	}
	
	public void practice10() {
	//10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
	//1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
		int [] arr = new int[10];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			boolean isDup = false;
			
			for(int j = 0; j<i; j++) {
				if(arr[j] == arr[i]) {
					//중복
					isDup = true;
					break;
				}
			}
			if(isDup) {
				i--;
			}
		}
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	public void practice11() {
	//3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고
	//중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요
	//단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
	//다시 정수를 받도록 하세요.
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 1 && num >= 3) {
			System.out.println("다시 입력하세요.");
			practice11();
			return;
		}
		int [] arr = new int[num];
		int mid = num / 2;
		
		int value = 0;
		for(int i = 0; i<arr.length; i++) {
			// mid까지는 오름차순
			// mid이후는 내림차순
			if(mid <= mid) {
				arr[i] = ++value;
			} else {
				// mid 이후는 내림차순
				arr[i] = --value;
			}
		}
		System.out.print(mid + " ");
	}
	
	public void practice12() {
	//사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
	//배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
	//단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
	//늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
	//사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
		System.out.print("배열의 크기를 입력하세요 : ");
		int num = sc.nextInt();
		String[] arr = new String[num]; // [null, null, null]
		
		sc.nextLine(); // 개행문자 제거.
		
		for(int i = 0; i< arr.length; i++) {
			System.out.print(i+1+"번째 문자열 : ");
			arr[i] = sc.nextLine(); // 띄어쓰기 포함.
		}
		while(true) {
			System.out.print("더 값을 입력 하시겠습니까?(Y/N) : ");
		char ch = sc.nextLine().charAt(0);
		
		if(ch == 'Y' ||ch == 'y') {
			System.out.print("더 입력하고 싶은 개수 : ");
			int num2 = sc.nextInt();
			String[] copy = Arrays.copyOf(arr, arr.length+ num2);
			
			sc.nextLine();
			for(int i = arr.length; i<copy.length; i++) {
				System.out.print(i+1+"번째 문자열 : ");
				copy[i] = sc.nextLine(); // 띄어쓰기 포함.
			}
			arr = copy;
		}else {
			System.out.println(Arrays.toString(arr));
			break;
			}
	
		}
		
	}

}	
