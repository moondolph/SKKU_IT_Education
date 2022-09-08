package com.beaver.aug251.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.beaver.aug251.student.Student;

public class CMain2 {
	public static void main(String[] args) {
		//학생 객체 - 이름 / 국어 / 영어 / 수학 + 속성들 출력 기능 
		Scanner k =  new Scanner(System.in);
		System.out.print("번호 : ");
		int no = k.nextInt();
		//학생의 번호를 입력하면 -> 그 학생의 정보를 출력하게 할건데... 
		//이때 어떤걸 써야 할까요?
		//학생 4명
	
			   //투표
		//[]   - x 		(그냥 탈락)
		//list - 6	  O
		//Set  - 0	  x (순서 개념x)	
		//Map  - 13   x (순서 개념x)
		ArrayList<Student> student = new ArrayList<Student>();
		student.add(new Student("카카오", 80, 70, 90));
		student.add(new Student("네이버", 85, 65, 97));
		student.add(new Student("라인", 98, 77, 68));
		student.add(new Student("쿠팡", 66, 86, 95));
		
		//해당 번호 학생의 전체 정보가 출력되게
		student.get(no - 1).printInfo();
		System.out.println("==============");
		
		//해당 번호 학생의 영어점수만 출력되게
		System.out.println("영어점수 : " + student.get(no - 1).getEnglish() + "점");
		System.out.println("==============");
		
		
		//전체 학생의 정보 출력
		for(int i = 0; i<student.size();i++) {
			//번지값
			System.out.println(student.get(i));
	
			//전체학생정보출력
			student.get(i).printInfo();
			System.out.println("=====================");
		
		}
		
//		
//		<String,String> student1 = new HashMap<String,String>(); 
//		student1.put(s.getName(), "카카오");
//		student1.put(s.getKorean(), "80");		
//		student1.put(s.getEnglish(), "70");
//		student1.put(s.getMath(), "90");		 
//									
//		
//		
		
		
		
	}
}
