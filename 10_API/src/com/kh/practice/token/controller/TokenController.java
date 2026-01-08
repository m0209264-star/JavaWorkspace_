package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {
		
	}
	
	public String afterToken(String str) {
		// 방법1.
		// System.out.println(str.replace(" ", ""));
		// 방법2. split(" ")을 활용하여 " "기준 문자를 분리하고, 분리된 문자를 다시 하나로 합친다.
		// String[] arr = str.split(" ");
		// String result = ""
		// for(String s : arr) {
		//	   result += s;
		// }
		//System.out.println("split :" + result);
		// 방법3.
		StringTokenizer st = new StringTokenizer(str, " ");
		String result2 = "";
		
		while(st.hasMoreTokens()) {
			result2 += st.nextToken();
		}
		
		return result2;
	}
	
	public String firstCap(String input) {
		String first = input.substring(0,1).toUpperCase().concat(input.substring(1));
		
		String other = input.substring(1);
		
		return first;
	}
	
	public int findChar(String input, char one) {
		char [] arr = input.toCharArray();
		int count =0;
		for(char ch : arr) {
			if(ch == one) {
				count++;
			}
		}
		return count;
	}
	
}
