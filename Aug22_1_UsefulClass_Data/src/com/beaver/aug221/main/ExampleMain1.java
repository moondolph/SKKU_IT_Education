package com.beaver.aug221.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExampleMain1 {
	// 학생의 (이름 / 생년월일 (yyyy.MM.dd)/국어/수학/영어) 를 입력 받아서
	// 학생의 나이(한국나이), 총점, 평균 값을 출력 
	// split
	
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("이름/생년월일(yyyy.MM.dd)/국어/수학/영어 : ");
		String s = k.next();

		String[] sData = s.split("/");
		String name = sData[0];
		System.out.printf("이름 : %s\n", name);
		
		try {
			//생일(나이)
			String bd = sData[1];
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
			Date birthday = sdf.parse(bd);
			System.out.println(birthday);
		
			Date now = new Date();
			SimpleDateFormat yrFmt = new SimpleDateFormat("yyyy");
			String nowYr = yrFmt.format(now);
			String birthdayYr = yrFmt.format(birthday);
			
			int ny = Integer.parseInt(nowYr);
			int by = Integer.parseInt(birthdayYr);
			int age = ny - by + 1;
			System.out.printf("나이 : %d살\n", age);
//			System.out.printf("나이 : %d살\n", now.getYear() - birthday.getYear() + 1);
			
			int kor = Integer.parseInt(sData[2]);
			int math = Integer.parseInt(sData[3]);
			int eng = Integer.parseInt(sData[4]);
			
			System.out.printf("국어 : %d점\n",kor);
			System.out.printf("수학 : %d점\n",math);
			System.out.printf("영어 : %d점\n",eng);
			
			int sum = kor + math + eng ;
			System.out.printf("총점 : %d점\n", sum);
	
			double avg = (double) sum / 3 ;
			System.out.printf("평균 : %.2f점\n", avg);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
//		---------------이하 나의 코드---------------
//		//스캐너로 입력 받아서 배열에 저장
//		Scanner k = new Scanner(System.in);
//		
//		System.out.print("이름: ");
//		String name = k.next();
//		System.out.print("생년월일: ");
//		String birth = k.next();
//		System.out.print("국어: ");
//		int korean = k.nextInt();
//		System.out.print("수학: ");
//		int math = k.nextInt();
//		System.out.print("영어: ");
//		int english = k.nextInt();
//
//		//굳이 배열 안 써도 될거같음
//		//나이는 split써서 .부분 자르고 2022 - yyyy + 1로 출력
//		String birthArray[] = birth.split("\\.");
//		System.out.println(birthArray);
//		System.out.println(birthArray[0]);
//		System.out.println(birthArray[1]);
//		System.out.println(birthArray[2]);
//		
//		int yyyy =Integer.parseInt(birthArray[0]);
//		
//		System.out.printf("나이 : %d\n", 2022-yyyy+1);
//		
//		
//		//총점
//		int total = korean + math + english ;
//		System.out.printf("총점 : %d\n", total);
//		
//		
//		//평균값은 총점/3
//		double avg = (double) (korean + math + english) / 3 ;
//		System.out.printf("평균 : %.1f", avg);
		
		
		
		
		
		
	}
}
