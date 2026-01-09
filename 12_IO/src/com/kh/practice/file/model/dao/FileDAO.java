package com.kh.practice.file.model.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {

    // 1. 파일 이름이 존재하는지 확인
    public boolean checkName(String file) {
        File f = new File(file);
        return f.exists();
    }

    // 2. 파일 저장 (덮어쓰기)
    public void fileSave(String file, String s) {
        // Try-with-resources를 사용하여 fw.close() 자동 호출
        try (FileWriter fw = new FileWriter(file)) {
            fw.write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 3. 파일 열기 (내용 읽기)
    public StringBuilder fileOpen(String file) {
        StringBuilder sb = new StringBuilder();
        
        // FileReader도 Try-with-resources로 관리하여 누수 방지
        try (FileReader fr = new FileReader(file)) {
            int value = 0;
            while ((value = fr.read()) != -1) {
                sb.append((char) value);
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return sb;
    }

    // 4. 파일 수정 (기존 내용 뒤에 이어 쓰기)
    public void fileEdit(String file, String s) {
        // FileWriter의 두 번째 인자를 true로 주면 '이어쓰기(append)' 모드가 됩니다.
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}