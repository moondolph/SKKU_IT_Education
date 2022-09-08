package com.beaver.aug175.animal;

import com.beaver.aug175.bite.Bite;

//Ŭ���������� ���߻�� x ( 1��1�θ�)
//Ŭ���� + �������̽��� ���߻�� o !

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
		System.out.println("±±");		
	}
	
	
	
	@Override
	public void bite() {
		System.out.println("���� �θ��� ����");		
		
	}
	
}
