package com.beaver.aug191.calculator;

public class Calculator {

	// 1. ���⼭ �ƿ� ������ ���� !? : try -catch - finally
	// ���� :  7 - 8 - 9 [ 14 -15 - 16] - 10 ( [] : finally)
	// ���� ������ 0 :7 - 8 - 9 (Arith) - 11 - 12[14 - 15 - 16] - 12([] : finally)
	
	public static int divide(int price, int weight) {
		try {
			int d = price / weight;
			return d;
		} catch (Exception e) {
			System.out.println("����");
			return - 9999;
		} finally {
			System.out.println("zzzzz");
		}
		
		
	}
	// 2. �̷�� : throws -> try���� �� �ַ� 
	// divide2�� �����ϴٰ� Arithmetic...�� ������
	// divide2�� ȣ���� �ʿ��� �ذ��ض�!
	public static int divide2(int price, int weight) throws /*Arithmetic*/Exception {
		int d = price / weight;
		return d;
	}
	
	
	
	
	
}
