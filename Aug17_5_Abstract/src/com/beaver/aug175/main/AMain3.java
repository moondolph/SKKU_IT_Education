package com.beaver.aug175.main;

import com.beaver.aug175.avengers.Avengers;
import com.beaver.aug175.avengers.Ironman;

//������ (polymorphism)
//Poly (����) + Morph(���)
//����Ÿ�� ������ ����Ÿ�� ��ü�� ��� ���� ����
//���� ���������� �ٸ� ����� �� �� ����! (overriding�� ������ ����)

public class AMain3 {
	public static void main(String[] args) {
		//���̾�� ��� �׸� i�� ���̾�� ����� ����
		Ironman i = new Ironman("a",123, 1231231);
		
		//���̾�� ��� �׸� a�� ���̾�� ����� ����
		Avengers a = new Ironman("b",123,1222222);
		
	}
}
