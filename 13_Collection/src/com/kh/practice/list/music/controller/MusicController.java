package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	
	private List<Music> list = new ArrayList<Music>();
		
	public int addList(Music music) {
		list.add(music);
		return 1;
	}
	
	public int addAtZero(Music music) {
		try {
		list.add(0, music);
		return 1;
		}catch(Exception e) {
			return 0;
		}
	}
	
	public List<Music> printAll() {
		return list;
	}
	
	public Music searchMusic(String title) {
		for(Music m: list) {
			if(m.getTitle().equals(title))
				return m;
		}
		return null;
	}
	
	public Music removeMusic(String title) {
		for(int i =0; i<list.size(); i++) {
			Music m = (Music)list.get(i);
			
			if(m.getTitle().equals(title)) {
				Music temp = m;
				
				list.remove(i);
				
				return temp;
			}
		}
		return null;
	}
	
	public Music setMusic(String title, Music music) {
		for(int i = 0; i<list.size(); i++) {
			Music m = (Music)list.get(i);
			if(m.getTitle().equals(title)) {
				return (Music)list.set(i, music);
			}
		}
		return null;
	}
	
	public int ascTitle() {
		list.sort(new AscTitle());
		return 1;
	}
	
	public int descSinger() {
		list.sort(new Comparator<Music>() {
		@Override
		public int compare(Music o1, Music o2) {
			return o2.getSinger().compareTo(o1.getSinger());
		}
		});
		return 1;
	}
	
	
}
