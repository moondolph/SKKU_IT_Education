package com.beaver.aug175.avengers;

public abstract class Avengers { //�޼ҵ� �߿� abstract�� �־ Ŭ������ �߻�ȭ

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
	

	public abstract void attack();    //���ݱ���� �ִµ� ��ü������ ���� ���� �ϴ� �߻�ȭ 

	}
	
	

