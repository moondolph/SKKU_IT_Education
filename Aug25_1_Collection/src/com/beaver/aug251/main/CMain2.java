package com.beaver.aug251.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.beaver.aug251.student.Student;

public class CMain2 {
	public static void main(String[] args) {
		//�л� ��ü - �̸� / ���� / ���� / ���� + �Ӽ��� ��� ��� 
		Scanner k =  new Scanner(System.in);
		System.out.print("��ȣ : ");
		int no = k.nextInt();
		//�л��� ��ȣ�� �Է��ϸ� -> �� �л��� ������ ����ϰ� �Ұǵ�... 
		//�̶� ��� ��� �ұ��?
		//�л� 4��
	
			   //��ǥ
		//[]   - x 		(�׳� Ż��)
		//list - 6	  O
		//Set  - 0	  x (���� ����x)	
		//Map  - 13   x (���� ����x)
		ArrayList<Student> student = new ArrayList<Student>();
		student.add(new Student("īī��", 80, 70, 90));
		student.add(new Student("���̹�", 85, 65, 97));
		student.add(new Student("����", 98, 77, 68));
		student.add(new Student("����", 66, 86, 95));
		
		//�ش� ��ȣ �л��� ��ü ������ ��µǰ�
		student.get(no - 1).printInfo();
		System.out.println("==============");
		
		//�ش� ��ȣ �л��� ���������� ��µǰ�
		System.out.println("�������� : " + student.get(no - 1).getEnglish() + "��");
		System.out.println("==============");
		
		
		//��ü �л��� ���� ���
		for(int i = 0; i<student.size();i++) {
			//������
			System.out.println(student.get(i));
	
			//��ü�л��������
			student.get(i).printInfo();
			System.out.println("=====================");
		
		}
		
//		
//		<String,String> student1 = new HashMap<String,String>(); 
//		student1.put(s.getName(), "īī��");
//		student1.put(s.getKorean(), "80");		
//		student1.put(s.getEnglish(), "70");
//		student1.put(s.getMath(), "90");		 
//									
//		
//		
		
		
		
	}
}
