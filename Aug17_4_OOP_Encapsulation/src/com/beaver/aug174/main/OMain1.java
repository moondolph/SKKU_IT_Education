package com.beaver.aug174.main;

import com.beaver.aug174.coffee.Coffee;
import com.beaver.aug174.human.Human;

public class OMain1 {
	public static void main(String[] args) {
//		// Ÿ��Ʋ�� �������� JFrame
//		JFrame f = new JFrame("������");
//		
//		// ����� 300, 500 ����
//		f.setSize(300, 500);
//		
//		//Ÿ��Ʋ�� �������� ����
//		f.setTitle("������");
//		
//		//���̰� �ϰ� ����
////		f.show();
//		f.setVisible(true);
		
		// Ŀ��...
		// �̸��� �Ƹ޸�ī��, 3000��
		// ���
		Coffee c = new Coffee();
		c.printInfo();
		System.out.println("----------");
		
		//���
		Human p = new Human("�̸�",0);
		
		
		
		
		//�̸�, ����, ������
		Human h = new Human();
		h.setName("�����");
		h.setAge(-31);
		System.out.println(h.getAge());
	}
	
	
	
	
	
}
