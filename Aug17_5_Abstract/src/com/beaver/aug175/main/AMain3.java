package com.beaver.aug175.main;

import com.beaver.aug175.avengers.Avengers;
import com.beaver.aug175.avengers.Ironman;

//다형성 (polymorphism)
//Poly (많은) + Morph(모양)
//상위타입 변수에 하위타입 객체를 담는 것이 가능
//같은 형태이지만 다른 기능을 할 수 있음! (overriding과 밀접한 관련)

public class AMain3 {
	public static void main(String[] args) {
		//아이언맨 담는 그릇 i에 아이언맨 만들어 넣음
		Ironman i = new Ironman("a",123, 1231231);
		
		//아이언맨 담는 그릇 a에 아이언맨 만들어 넣음
		Avengers a = new Ironman("b",123,1222222);
		
	}
}
