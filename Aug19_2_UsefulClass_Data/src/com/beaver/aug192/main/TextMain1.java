package com.beaver.aug192.main;

import java.util.StringTokenizer;

public class TextMain1 {
	// 버전 
	// 	  1.8.12
	//	  앞자리 : major버전(1)
	//	  뒷자리 : minor버전(8.12)
	//	  	더 뒷자리로 갈수록 더 minor
	//	  버전업 (1.8.12 -> 1.8.13) : 살짝 수정
	//	  버전업 (1.8.12 -> 1.9.0) : 변화에 어느정도 느낌이 옴
	//	  버전업 (1.8.12 -> 2.0.0) : 새로운 프로그램
	
	// 네트워크를 통해서 데이터를 받아오면 : 글자형태
	// 네트워크를 통해서 데이터를 줄 때 : 글자형태
	// 한글처리가 까다로워질 수 있음 !
	public static void main(String[] args) {
		String s1 = "으아아아아아아아아"; // 정식? NO! / 약식 Yes!
		String s2 = new String("곧 있으면 추석! 너무 신나요 !");
		
		//외우지 말고 찾아보기 !!! (자동완성에 있는 기능 읽어보면서 !)
		
		//s2에서 2번째에 있는 글자 출력
		System.out.println(s2.charAt(2));
		
		//s2에서 총 몇글자인지 출력
		System.out.println(s2.length());
		
		//s2에서 '곧'이라는 단어로 시작하는지  
		System.out.println(s2.startsWith("곧"));
		
		//s2에 '너무'라는 단어가 있는지
		//contains() 
		System.out.println(s2.contentEquals("너무"));
		//s2에서 '추석'을 '설날'로 바꿔서 출력
		System.out.println(s2.replace("추석", "설날"));
		//s2에서 2 ~ 5번째 글자만 출력                   
		System.out.println(s2.substring(2, 6));   //(시작위치, 끝위치 -1)
		System.out.println("====================");
		
		//String 객체를 생성하는데 형식을 잡아서
		String s3 = String.format("무게 : %.2fkg", 123.456789);
		System.out.println(s3);
		System.out.println("======================");

		// s2에 글자를 추가
		s2 = s2 + "내년에는 모두 다 잘 됐으면 좋겠어요!";
		System.out.println(s2);
		s2 += "모두 부자되세요 ~ ^-^";
		System.out.println(s2);
		
		s2 = new String(s2 + " ㅎㅎㅎㅎㅎ");
		System.out.println(s2);
		
		// String 대량으로 추가
		StringBuffer sb = new StringBuffer(s2);
		sb.append("일은 적게 하되 돈은 많이 벌게 해주세요!");
		sb.append("ㅋㅋㅋㅋㅋㅋ");
		sb.append("근데 주말에도 바쁘네요?");
		System.out.println(sb);
		
		String s4 = sb.toString();
		System.out.println(s4);
		System.out.println("======================");
		
		//String 분리
		String s5 = "김비버,박비버,최비버,저스틴비버";
		
		//1. Split 
		String[] s5Ar = s5.split(","); //골라서 사용 할 수 있음
		System.out.println(s5Ar[0]);
		System.out.println(s5Ar[3]);
		System.out.println("======================");
		
		//2. StringTokenizer
		StringTokenizer st = new StringTokenizer(s5, ","); //순서대로 나옴
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		while (st.hasMoreTokens()) { // 반복문형식(while문) + 순서대로 나옴
			System.out.println(st.nextToken());
		}
		
		// 속도적인 면 : StringTokenizer
		// data속에서 변수가 많다면 : split
		
	}
}
