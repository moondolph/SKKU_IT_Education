package com.beaver.aug191.main;

import java.io.FileReader;
import java.util.Scanner;

import com.beaver.aug191.calculator.Calculator;

// Java
//		����ó���� ����
// Python
//		ó���ϱ� ������ ���ص� ��

public class EMain3 {
	public static void main(String[] args) {
		// txt������ �޾ƿͼ� ���� �Ұǵ�..���࿡ !
		// �� �ؽ�Ʈ������ �����ų�, ���� �����̶�� ?
		try {
			FileReader fr = new FileReader("C:\\Users\\user\\Desktop\\test.txt");
			System.out.println(fr.read());
		} catch (Exception e) {
			e.printStackTrace();
		}

	
		// ���� / ����(g)�� �Է� �޾Ƽ� (������)
		// g�� ������ ������ ���
		// ��ɿ� ���� ���� Class�ϳ� ���!
		Scanner k = new Scanner(System.in);
		System.out.print("����(��) : ");
		int price = k.nextInt();
		System.out.print("����(g) : ");
		int weight = k.nextInt();
		System.out.println("=============");		
		
		int z1 = Calculator.divide(price, weight);
		System.out.printf("g�� ������ : %d��\n", z1);
		
		try {
			int z2 = Calculator.divide2(price, weight);
			System.out.printf("g�� ������ : %d��\n",z2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// g�� ������...
		// �ٸ� �޼ҵ忡�� try - catch ... -->���� ���� O / main �޼ҵ忡���� ��� !
		// throws : �̰� �� ���� ����� ! / main �޼ҵ� �̿��� �޼ҵ� !
		
		
		
		
			
		
		
		
		
	}
}
