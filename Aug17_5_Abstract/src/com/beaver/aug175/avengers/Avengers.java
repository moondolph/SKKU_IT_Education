package com.beaver.aug175.avengers;

public abstract class Avengers { //메소드 중에 abstract가 있어서 클래스도 추상화

	private String name;
	private int age;

	// Ctrl + space
	public Avengers() {
		// TODO Auto-generated constructor stub
	}

	// ctrl + shift + space
	public Avengers(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//ctrl + shift + z
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
	}
	

	public abstract void attack();    //공격기능이 있는데 구체적으로 뭔지 몰라서 일단 추상화 

	}
	
	

