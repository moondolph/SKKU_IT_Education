package com.beaver.aug177.register;

//���� ������ �� Ŭ����
public class Academy {
	private int studentCount;
	
	//��ü ���鶧 ����� �޼ҵ�
	public Student consult(String name, int age) {
		studentCount ++; 
		Student s = new Student(studentCount, name, age);
		return s;
	}
	
	
	
}
