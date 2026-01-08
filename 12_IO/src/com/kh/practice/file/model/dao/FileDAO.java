package com.kh.practice.file.model.dao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	
	public boolean checkName(String file) {
		
		File f = new File(file);
		
		return f.exists();
	}
	
	public void fileSave(String file, String s) {
		
		try(FileWriter fw = new FileWriter(file)){
			
			fw.write(s);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public StringBuilder fileOpen(String file) {
		StringBuilder sb = new StringBuilder();
		
		
	}
	
	public void fileEdit(String file, String s) {
		
	}
}
