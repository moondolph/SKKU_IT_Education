package com.beaver.aug251.student;


//JavaBean, DTO, VO, 
public class Student {

	private String name;
	private int Korean;
	private int English;
	private int Math;

	
	public Student() {
	// TODO Auto-generated constructor stub
}


	public Student(String name, int korean, int english, int math) {
		super();
		this.name = name;
		Korean = korean;
		English = english;
		Math = math;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getKorean() {
		return Korean;
	}


	public void setKorean(int korean) {
		Korean = korean;
	}


	public int getEnglish() {
		return English;
	}


	public void setEnglish(int english) {
		English = english;
	}


	public int getMath() {
		return Math;
	}


	public void setMath(int math) {
		Math = math;
	}


	public void printInfo() {
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("���� : %s\n", Korean);
		System.out.printf("���� : %s\n", English);
		System.out.printf("���� : %s\n", Math);
	}

	
	
	
	
}
