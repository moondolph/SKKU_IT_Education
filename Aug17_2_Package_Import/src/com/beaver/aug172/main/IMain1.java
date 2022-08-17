package com.beaver.aug172.main;

//Imain1.java에서 쓰는 Scanner는 무조건 이것만 사용하겠다!
import com.beaver.aug172.machine.Scanner;

public class IMain1 {
	public static void main(String[] args) {
		//객체 만들때 패키지명을 생략 가능한 경우
		//		-자바 기본 패키지(java.lang) 소속
		/*java.lang. */String s1 = "ㅋ";
		/*java.lang.*/System.out.println("a");
	
		//같은 패키지 소속
		com.beaver.aug172.main.Beaver b = new com.beaver.aug172.main.Beaver();
		Beaver b2 = new Beaver();
		
		//다른 패키지 소속
		com.beaver.aug172.machine.Scanner s = new com.beaver.aug172.machine.Scanner();
		Scanner s2 = new Scanner(); // <--이걸로 하고 싶으면 위에 import 해야된다. 
		
	
	
	
	}
}
