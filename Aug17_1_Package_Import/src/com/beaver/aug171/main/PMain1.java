package com.beaver.aug171.main;

import com.beaver.aug171.product.Computer;
import com.beaver.aug171.product.Scanner;

public class PMain1 {
	public static void main(String[] args) {
		// ���������̼�, 800000��, i5-1234, 8GB, 500GB ��ǻ��
		// ���
		Computer c = new Computer("���������̼�", 800000, "i5-1234", 8, 500);
		c.printInfo();
		System.out.println("---------------");
		// ��Ƽ�ͽ�������, 500000�� ��ĳ��
		// ���
		com.beaver.aug171.product.Scanner s
			= new com.beaver.aug171.product.Scanner("��Ƽ�ͽ�������", 500000);
		s.printInfo();
					
					
					
	}
}
