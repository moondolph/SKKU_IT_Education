package com.beaver.aug221.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ExampleMain2 {
	// 학생의 (이름/생년월일(yyyy.MM.dd)/국어/수학/영어)를 입력 받아서
	// 학생의 나이(한국나이), 총점, 평균 값을 출력
	// StringTokenizer
	
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("이름/생년월일(yyyy.MM.dd)/국어/수학/영어 : ");
		String s = k.next();
		
		StringTokenizer st = new StringTokenizer(s, "/");
		System.out.printf("이름 : %s\n", st.nextToken());
		
		try {
			String bd = st.nextToken();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
			Date birthday = sdf.parse(bd);
			System.out.println(birthday);
			
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
			String birthdayStr = sdf2.format(birthday);
			System.out.printf("생일 : %s\n", birthdayStr);
			
			SimpleDateFormat yearFmt = new SimpleDateFormat("yyyy");
			String nowYr = yearFmt.format(new Date());
			int ny = Integer.parseInt(nowYr);
			
			String birthdayYr = yearFmt.format(birthday);
			int by = Integer.parseInt(birthdayYr);
			
			int age = ny - by + 1;
			System.out.printf("나이 : %d살\n", age);

			int kor = Integer.parseInt(st.nextToken());
			int math = Integer.parseInt(st.nextToken());
			int eng = Integer.parseInt(st.nextToken());

			System.out.printf("국어 : %d점\n", kor);
			System.out.printf("수학 : %d점\n", math);
			System.out.printf("영어 : %d점\n", eng);
			
			int sum = kor + math + eng;
			System.out.printf("총점 : %d점\n", sum);
			double avg = (double) sum / 3;
			System.out.printf("평균 : %.2f점\n",avg);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
//		Scanner k = new Scanner(System.in);
//		System.out.print("이름/생년월일(yyyy.MM.dd)/국어/수학/영어 입력: ");
//		String str = k.next();
//		
//		//토크나이저 사용
//		StringTokenizer tokenizer = new StringTokenizer(str,"/");
//		String[] tokenArray = null;
//		
//		for(int i=0; i<5; i++) {
//		tokenArray[i] = tokenizer.nextToken();
//		}
//		System.out.println(tokenArray[0]);
//		System.out.println(tokenArray[1]);
//		System.out.println(tokenArray[2]);
//		System.out.println(tokenArray[3]);
//		System.out.println(tokenArray[4]);
		
		
		
		
		
		

//        System.out.println("=== String Tokenizer Strart ===");
//        while (tokenizer.hasMoreTokens()){
//            System.out.println(tokenizer.nextToken());
//        }
//		}
		
	}

}
