package com.beaver.aug251.main;

import java.util.HashMap;
import java.util.Scanner;

import com.beaver.aug251.student.Student;

public class CMain3 {
	public static void main(String[] args) {
		//�л��� �̸��� �Է����� ��
		//�� �л��� ��ü ������ ����ϰ� ����
		
		
		// Map -  (v) 
		// List - 
		
		
		Scanner k = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = k.next();
		
		HashMap<String, Student> student = new HashMap<String, Student>();
		student.put("īī��",new Student("īī��", 80, 70, 90));
		student.put("���̹�",new Student("���̹�", 85, 65, 97));
		student.put("����",new Student("����", 98, 77, 68));
		student.put("����",new Student("����", 66, 86, 95));
		//�Է��� �л��̸��� ��ü ������ ���
		student.get(name).printInfo();  
		// student -> student Map���� 
		// get(name) -> name�̶�� Ű ���� ������ Value���� �������µ� Value���� Student("name", ����, ����, ����)��� ��ü 
		// printInfo() -> Student��� ��ü�� printInfo �޼ҵ� ����
		
		
//		ALT + SHIFT + R --> ��ü���� �ٲٱ� 
		
		
	}
}
