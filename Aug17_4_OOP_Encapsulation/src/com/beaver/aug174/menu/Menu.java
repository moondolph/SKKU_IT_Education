package com.beaver.aug174.menu;

// ���� !

// ����Ű �ɱ�
// 	  �޴� �� - Window - Preferences - ���� ��ܿ� 'keys' �˻�
//		- ȭ�� �ٲ�� - �߾� �˻����� 'generate'�� �˻�
//			-generate ~ using field : ctrl + shift + space (������ �����ε�)
// 			-generate ~ getters and setters : ctrl + shift + z (getter/setter)
//			(binding ĭ�� Ŭ���ϰ��� ���� Ű�� �������ָ�) 
// 
public class Menu {
	// 1. �������
	private String name;
	private int price;

	// 2. �⺻ ������
	public Menu() {
		// TODO Auto-generated constructor stub
	}

	// 3. ������ �����ε� - ctrl + shift + space
	public Menu(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	// 4. getter / setter ��ġ - ctrl + shift + z
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	//  5.������ �޼ҵ�...
	











}
