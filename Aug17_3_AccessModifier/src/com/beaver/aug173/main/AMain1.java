package com.beaver.aug173.main;

import com.beaver.aug173.dog.Dog;

public class AMain1 extends Dog {
	public static void main(String[] args) {
			Dog dog = new Dog();
			
			dog.a = 1;		//public  �� ��
//			dog.b = 2;    //protected int b;			//���� ��Ű�� or �ٸ� ��Ű����� �� ���� Ŭ����-->����Ŭ���� �Ǵ°� �����ַ��� ����ߴµ� �ȵ�. 
//			dog.c = 3;		//default ���� ��Ű��������
//			dog.d = 4;		//private ���� Ŭ����
			dog.e = 5;		//�� ��=default ���� ��Ű�� 
		
		
	}
}
