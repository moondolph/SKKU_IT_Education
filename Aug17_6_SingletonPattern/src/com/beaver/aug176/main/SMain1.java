package com.beaver.aug176.main;

import com.beaver.aug176.maru.Maru;
import com.beaver.aug176.person.Person;

// ���ϴ� ��ü �ϳ� ����
// �̸�, ����, ����
// ���

//�������α׷���
//		�̱������� ***


public class SMain1 {
	public static void main(String[] args) {
	
//		Maru m = new Maru("����", 3, "����");
//		m.printInfo();
//		System.out.println(m);
//		
//		System.out.println("----------");
//		
//		Maru m2 = new Maru("����", 3, "����");
//		m.printInfo();
//		System.out.println(m2);
//		Person p = new Person("���Һ�", 22, "����");
//		p.printInfo();

		Maru m = Maru.getMaru();
		m.printInfo();
		System.out.println(m);
		System.out.println("-------------");
		Maru m2 = Maru.getMaru();
		m2.printInfo();
		System.out.println(m2);
		System.out.println("-------------");                         //�ּҰ��� �����ϴ�! ���� �ǵ��� �� �Ѹ����� ������ maru�� �Ǿ����ϴ�.
		
		
		
		
	}
	
	
	
}
