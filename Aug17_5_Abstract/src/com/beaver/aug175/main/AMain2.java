package com.beaver.aug175.main;

import com.beaver.aug175.avengers.Avengers;
import com.beaver.aug175.avengers.Ironman;

public class AMain2 {
	// 어벤져스 클래스
	// 이름, 나이 속성
	// 공격하기 기능

	public static void main(String[] args) {

		// Avengers로부터 상속받은
		// 클래스명은 모름
		// 내부에 만들어놓은 클래스

		// 익명 내부 클래스 (anonymous inner class)

		Avengers a = new Avengers() { // 중괄호 안쪽부분이 클래스 부분

			@Override
			public void attack() {
				System.out.println("거미줄발사");
			}
		};

		a.printInfo();
		a.attack();
		System.out.println("----------");
		
		
		
		// 아이언맨은 어벤져스
		// 속성으로 재산
		// 공격은 빔
		// 흡연 o
		// 운전 o
		Ironman i = new Ironman("스타크",40,999999999);
		i.printInfo();
		i.attack();
		i.smoke();
		i.drive();
		
		
	}

}
