package com.beaver.aug174.main;

import com.beaver.aug174.coffee.Coffee;
import com.beaver.aug174.human.Human;

public class OMain1 {
	public static void main(String[] args) {
//		// 타이틀이 ㅋㅋㅋ인 JFrame
//		JFrame f = new JFrame("ㅋㅋㅋ");
//		
//		// 사이즈를 300, 500 수정
//		f.setSize(300, 500);
//		
//		//타이틀을 ㅎㅎㅎ로 수정
//		f.setTitle("ㅎㅎㅎ");
//		
//		//보이게 하고 싶음
////		f.show();
//		f.setVisible(true);
		
		// 커피...
		// 이름이 아메리카노, 3000원
		// 출력
		Coffee c = new Coffee();
		c.printInfo();
		System.out.println("----------");
		
		//사람
		Human p = new Human("이름",0);
		
		
		
		
		//이름, 나이, 몸무게
		Human h = new Human();
		h.setName("김빕어");
		h.setAge(-31);
		System.out.println(h.getAge());
	}
	
	
	
	
	
}
