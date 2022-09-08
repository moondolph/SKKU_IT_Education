package com.beaver.aug251.main;

import java.util.HashMap;
import java.util.Scanner;

import com.beaver.aug251.student.Student;

public class CMain3 {
	public static void main(String[] args) {
		//학생의 이름을 입력했을 때
		//그 학생의 전체 정보를 출력하고 싶음
		
		
		// Map -  (v) 
		// List - 
		
		
		Scanner k = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = k.next();
		
		HashMap<String, Student> student = new HashMap<String, Student>();
		student.put("카카오",new Student("카카오", 80, 70, 90));
		student.put("네이버",new Student("네이버", 85, 65, 97));
		student.put("라인",new Student("라인", 98, 77, 68));
		student.put("쿠팡",new Student("쿠팡", 66, 86, 95));
		//입력한 학생이름의 전체 정보를 출력
		student.get(name).printInfo();  
		// student -> student Map에서 
		// get(name) -> name이라는 키 값을 넣으면 Value값을 가져오는데 Value값이 Student("name", 국어, 영어, 수학)라는 객체 
		// printInfo() -> Student라는 객체의 printInfo 메소드 실행
		
		
//		ALT + SHIFT + R --> 전체내용 바꾸기 
		
		
	}
}
