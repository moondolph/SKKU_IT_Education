package com.beaver.aug222.main;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReadMain {
	public static void main(String[] args) {
		// Windows는 경로에 대소문자 구별안함
		// Linux는 대소문자를 구별함

		// fr위에 br을 덧씌운상태
		// 연관된것들 중에서 하나만 닫으면 다 처리
		
		BufferedReader br = null;
		try {
			// 파일 -> 프로그램(InputStreamReader 개조)
			FileReader fr = new FileReader("C:\\Users\\user\\Desktop\\beaver1.txt");
			br = new BufferedReader(fr);
			
			String line = null;
			while (( line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
