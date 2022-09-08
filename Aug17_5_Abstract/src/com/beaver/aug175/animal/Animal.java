package com.beaver.aug175.animal;

public abstract class Animal {
	// ��, ����
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
	
	//abstract �޼ҵ� : �̿ϼ��� �޼ҵ� (������ ����)
	//����Ŭ�������� �ݵ��!!!! �������̵� �ؾ� ~!!
	
	//abstract �޼ҵ尡 �ϳ��� ������
	//abstract Ŭ���� or interface���� �� ! 
	public abstract void roar();
	
	
	
	
}
