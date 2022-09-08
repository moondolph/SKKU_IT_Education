package com.beaver.aug175.animal;

public abstract class Animal {
	// 종, 나이
	private String sort;
	private int age;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String kind, int age) {
		super();
		this.sort = kind;
		this.age = age;
	}

	public String getKind() {
		return sort;
	}

	public void setKind(String sort) {
		this.sort = sort;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void PrintInfo() {
		System.out.println(sort);
		System.out.println(age);
	}
	
	//abstract 메소드 : 미완성된 메소드 (내용이 없는)
	//하위클래스에서 반드시!!!! 오버라이딩 해야 ~!!
	
	//abstract 메소드가 하나라도 있으면
	//abstract 클래스 or interface여야 함 ! 
	public abstract void roar();
	
	
	
	
}
