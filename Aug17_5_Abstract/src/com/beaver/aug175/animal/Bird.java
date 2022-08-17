package com.beaver.aug175.animal;

import com.beaver.aug175.bite.Bite;

//클래스끼리는 다중상속 x ( 1대1로만)
//클래스 + 인터페이스는 다중상속 o !

public class Bird extends Animal implements Bite /*, fly, eat, ...*/ {
	private int leg;
	
	public Bird() {
		// TODO Auto-generated constructor stub
	}

	public Bird(String kind, int age, int leg) {
		super(kind, age);
		this.leg = leg;
	}
	

	@Override
	public void PrintInfo() {
		// TODO Auto-generated method stub
		super.PrintInfo();
		System.out.println(leg);
	}
	
	@Override
	public void roar() {
		System.out.println("짹짹");		
	}
	
	
	
	@Override
	public void bite() {
		System.out.println("새는 부리로 찢어");		
		
	}
	
}
