package com.beaver.aug191.main;

public class EMain2 {
	public static void main(String [] args) {
		//Exception�� ����
		
		
		// 1. NullPointerException 
		//		��ü������ ���� ��Ȳ
		//		null���� �ִ� ���������� .XXX()�� ����� �� ���� �߻�
//		String s = null;
//		System.out.println(s.length());
		
		// 2. ArrayIndexOutOfBoundsException
		//		�迭���� �ε����� ������ �ʰ��ϰ� �Ǵ� ��Ȳ���� �߻�
//		int[] ar = {1, 2, 3};
//		System.out.println(ar[3]);
		
		// 3.NumberFormatException
		// 	   ���ڿ�(String) -> ����(int, double)�� �ٲٴ� ��Ȳ����
		//	   ��ȯ�� �� ���� ���ڰ� �ִ� ��Ȳ���� �߻�
		String s = "a12345";
		int i = Integer.parseInt(s);
		System.out.println(i+20);
		
	}
}
