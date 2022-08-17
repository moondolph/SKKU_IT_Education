package com.beaver.aug176.main;

import com.beaver.aug176.maru.Maru;
import com.beaver.aug176.person.Person;

// 원하는 객체 하나 생성
// 이름, 나이, 별명
// 출력

//패턴프로그래밍
//		싱글톤패턴 ***


public class SMain1 {
	public static void main(String[] args) {
	
//		Maru m = new Maru("마루", 3, "돼지");
//		m.printInfo();
//		System.out.println(m);
//		
//		System.out.println("----------");
//		
//		Maru m2 = new Maru("마루", 3, "돼지");
//		m.printInfo();
//		System.out.println(m2);
//		Person p = new Person("김텀블러", 22, "스벅");
//		p.printInfo();

		Maru m = Maru.getMaru();
		m.printInfo();
		System.out.println(m);
		System.out.println("-------------");
		Maru m2 = Maru.getMaru();
		m2.printInfo();
		System.out.println(m2);
		System.out.println("-------------");                         //주소값이 같습니다! 제가 의도한 단 한마리의 유일한 maru가 되었습니다.
		
		
		
		
	}
	
	
	
}
