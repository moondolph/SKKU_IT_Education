package com.beaver.aug174.human;

//ĸ��ȭ(Encapsulation)
//	��������� ������ �� �ִ� ���! �� ����� �� ��ο� ������ġ�� �ϴ� ����
//  ��!! �ܺο� ������ �ʿ䰡 ���� �������� ĸ��ó�� ���μ� '����'�ϴ� ���

public class Human {
	private String name;		// �������� �ܺ� ������ �����ϱ� ���� private
	private int age;
	private double weight;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	
	//setXXX : �ܺ��� ������ ���ѵ� XXX�� ������ �� ����
	//���̿��� ������ ������...
	public void setAge(int age) {
		if (age < 0) {
			age *= -1;
		}
		this.age = age;
	}
	
	
	
	
	
	
	
	
	
	
}
