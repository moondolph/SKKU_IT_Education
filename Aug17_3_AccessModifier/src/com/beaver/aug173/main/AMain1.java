package com.beaver.aug173.main;

import com.beaver.aug173.dog.Dog;

public class AMain1 extends Dog {
	public static void main(String[] args) {
			Dog dog = new Dog();
			
			dog.a = 1;		//public  다 됨
//			dog.b = 2;    //protected int b;			//같은 패키지 or 다른 패키지라면 그 하위 클래스-->하위클래스 되는거 보여주려고 상속했는데 안됨. 
//			dog.c = 3;		//default 같은 패키지끼리만
//			dog.d = 4;		//private 같은 클래스
			dog.e = 5;		//안 씀=default 같은 패키지 
		
		
	}
}
