package com.beaver.aug175.main;

import com.beaver.aug175.animal.Bird;

public class AMain1 {
	public static void main(String[] args) {
		// �߻�ȭ(Abstraction) : ������ �Ӽ��̳� ����� ��� �̸��� ���̴� ��
		Bird b = new Bird("��", 93, 3);
		b.PrintInfo();
		b.roar();
		b.bite();
	}
}
