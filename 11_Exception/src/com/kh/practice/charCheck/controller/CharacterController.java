package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {
	
	public CharacterController() {
		
	}
	
	public int countAlpha(String s) throws CharCheckException {
		if(s.contains(" ")) {
			throw new CharCheckException("체크할 문제열 안에 공백이 포함되어 있습니다.");
		}
		
		char [] arr = s.toUpperCase().toCharArray();
		int count = 0;
		for(char ch : arr) {
			// 각 문자가 영문자인지 검사.
			// 'A' , 'Z' 
			if(ch >= 'A' && ch<= 'Z') {
				count++;
			}
		}
		return count;
//		int count = 0;
//		for(int i=0; i<s.length(); i++) {
//			char ch = s.charAt(i);
//			if((ch>='a'&& ch<='z')|| (ch>='A' && ch <='Z')) {
//				count++;
//			}
//		}
//		return count;
	}
}
