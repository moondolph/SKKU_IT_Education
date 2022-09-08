package com.beaver.aug192.main;

// Wrapper Class : (�ڷ���) �⺻������ ��ü�� (���尴ü)
//		Integer, Double, Long, Void, Boolean, ...
//		�⺻ �ڷ����� ��ü�� �ٷ�� ���ؼ� ����ϴ� Class
//		Java�� �⺻���� ���� ������ �ִ� ��ü ������ ����
//		�⺻���� ������ �ִ� ���� ���ο� �ΰ� �� ���� �����ϴ� ���

// Boxing : �⺻�� -> ����Ŭ����
// UnBoxing : ����Ŭ���� -> �⺻��

// 1. ��ü�� Ŭ������ �����ϴ� method ����� ��
// 2. Ŭ������ �����ϴ� ����� ���(MIN_VALUE, MAX_VALUE, ...)
// 3. ����, ���ڷ� ����ȯ�� �� �� (v)
public class WMain {
	public static void main(String[] args) {
		int a = 10;
		String a1 = "100";
//		double bb = (double) a;
		
		// Integer ��ü�� ���� -> �������� �־ -> int
		Integer b = new Integer(a1);
		System.out.println(b.getClass());
		b.intValue();
		System.out.println(b);
		System.out.println(b.TYPE);
		
		// �⺻�� -> ��ü�� 
		double c = 123.456;
		Double d = new Double(c);
	
		// ��ü�� -> �⺻��
		Boolean e = new Boolean(true);
		boolean f = e.booleanValue();
		
		// ��ü�� -> �⺻��(���� ������ �ڵ����� ���� : Auto-Unboxing)
		Integer g = 10;
		
		// �⺻�� -> ��ü��(���� ������ �ڵ����� ���� : Auto-boxing) 
		int h = g;
				
		int max = Integer.MAX_VALUE;
		System.out.println(max);
		int min = Integer.MIN_VALUE;
		System.out.println(min);
		
		// int �ڷ����� ���� -> String(������)���� 
		String num1 = Integer.toString(321);
		
		// int �ڷ����� ���� -> 2������ ���·�(String)
		String num2 = Integer.toBinaryString(5);
		
		// String -> �⺻��(���̷�Ʈ�δ� �����, ��ü���� ���ľ�)
		// String -> ��ü�� -> �⺻�� 
		String k = "345.67";
		Double k2 = Double.parseDouble(k);
		double k3 = k2.doubleValue();
		
		String m = "150";
		int m2 = Integer.parseInt(m);
		
		
		
		
	}
}
