package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	private HashMap<String, Member> map = new HashMap();
	
	public boolean joinMembership(String id, Member m) {
		
		// 1. put메서드를 활용한 방법
		//Member prev = map.put(id, m);
		
		// 2. caontainKey메서드를 활용한 방법
		boolean result = map.containsKey(id);
		if(result) {
			return false;
		}else {
			map.put(id, m);
			return true;
		}
		
		// 3. 반복문을 활용하여 key값을 체크
	}
	
	public String login(String id, String password) {
		Member m = (Member) map.get(id);
		if(m != null && m.getPassword().equals(password)) {
			return m.getName();
		}
		return null;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		Member m = (Member) map.get(id);
		if(m != null && m.getPassword().equals(oldPw)) {
			m.setPassword(newPw);
			return true;
		}
		return false;
	}
	
	public void changeName(String id, String newName) {
		Member m = (Member) map.get(id);
		if(m != null) {
			m.setName(newName);
		}
	}
	
	public TreeMap<String,String> sameName(String name) {
		Set<String> keys = map.keySet();
		TreeMap<String,String> tree = new TreeMap<>();
		
		for(String key : keys) {
			String str = map.get(key).getName();
			if(str.equals(name)) {
				tree.put(key, str); // id와 name
			}
		}
		return tree;
	}
}
