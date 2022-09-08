package com.beaver.aug175.main;

import com.beaver.aug175.avengers.Avengers;
import com.beaver.aug175.avengers.Ironman;

public class AMain2 {
	// ����� Ŭ����
	// �̸�, ���� �Ӽ�
	// �����ϱ� ���

	public static void main(String[] args) {

		// Avengers�κ��� ��ӹ���
		// Ŭ�������� ��
		// ���ο� �������� Ŭ����

		// �͸� ���� Ŭ���� (anonymous inner class)

		Avengers a = new Avengers() { // �߰�ȣ ���ʺκ��� Ŭ���� �κ�

			@Override
			public void attack() {
				System.out.println("�Ź��ٹ߻�");
			}
		};

		a.printInfo();
		a.attack();
		System.out.println("----------");
		
		
		
		// ���̾���� �����
		// �Ӽ����� ���
		// ������ ��
		// �� o
		// ���� o
		Ironman i = new Ironman("��Ÿũ",40,999999999);
		i.printInfo();
		i.attack();
		i.smoke();
		i.drive();
		
		
	}

}
