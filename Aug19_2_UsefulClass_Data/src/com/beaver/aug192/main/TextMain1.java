package com.beaver.aug192.main;

import java.util.StringTokenizer;

public class TextMain1 {
	// ���� 
	// 	  1.8.12
	//	  ���ڸ� : major����(1)
	//	  ���ڸ� : minor����(8.12)
	//	  	�� ���ڸ��� ������ �� minor
	//	  ������ (1.8.12 -> 1.8.13) : ��¦ ����
	//	  ������ (1.8.12 -> 1.9.0) : ��ȭ�� ������� ������ ��
	//	  ������ (1.8.12 -> 2.0.0) : ���ο� ���α׷�
	
	// ��Ʈ��ũ�� ���ؼ� �����͸� �޾ƿ��� : ��������
	// ��Ʈ��ũ�� ���ؼ� �����͸� �� �� : ��������
	// �ѱ�ó���� ��ٷο��� �� ���� !
	public static void main(String[] args) {
		String s1 = "���ƾƾƾƾƾƾƾ�"; // ����? NO! / ��� Yes!
		String s2 = new String("�� ������ �߼�! �ʹ� �ų��� !");
		
		//�ܿ��� ���� ã�ƺ��� !!! (�ڵ��ϼ��� �ִ� ��� �о�鼭 !)
		
		//s2���� 2��°�� �ִ� ���� ���
		System.out.println(s2.charAt(2));
		
		//s2���� �� ��������� ���
		System.out.println(s2.length());
		
		//s2���� '��'�̶�� �ܾ�� �����ϴ���  
		System.out.println(s2.startsWith("��"));
		
		//s2�� '�ʹ�'��� �ܾ �ִ���
		//contains() 
		System.out.println(s2.contentEquals("�ʹ�"));
		//s2���� '�߼�'�� '����'�� �ٲ㼭 ���
		System.out.println(s2.replace("�߼�", "����"));
		//s2���� 2 ~ 5��° ���ڸ� ���                   
		System.out.println(s2.substring(2, 6));   //(������ġ, ����ġ -1)
		System.out.println("====================");
		
		//String ��ü�� �����ϴµ� ������ ��Ƽ�
		String s3 = String.format("���� : %.2fkg", 123.456789);
		System.out.println(s3);
		System.out.println("======================");

		// s2�� ���ڸ� �߰�
		s2 = s2 + "���⿡�� ��� �� �� ������ ���ھ��!";
		System.out.println(s2);
		s2 += "��� ���ڵǼ��� ~ ^-^";
		System.out.println(s2);
		
		s2 = new String(s2 + " ����������");
		System.out.println(s2);
		
		// String �뷮���� �߰�
		StringBuffer sb = new StringBuffer(s2);
		sb.append("���� ���� �ϵ� ���� ���� ���� ���ּ���!");
		sb.append("������������");
		sb.append("�ٵ� �ָ����� �ٻڳ׿�?");
		System.out.println(sb);
		
		String s4 = sb.toString();
		System.out.println(s4);
		System.out.println("======================");
		
		//String �и�
		String s5 = "����,�ں��,�ֺ��,����ƾ���";
		
		//1. Split 
		String[] s5Ar = s5.split(","); //��� ��� �� �� ����
		System.out.println(s5Ar[0]);
		System.out.println(s5Ar[3]);
		System.out.println("======================");
		
		//2. StringTokenizer
		StringTokenizer st = new StringTokenizer(s5, ","); //������� ����
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		while (st.hasMoreTokens()) { // �ݺ�������(while��) + ������� ����
			System.out.println(st.nextToken());
		}
		
		// �ӵ����� �� : StringTokenizer
		// data�ӿ��� ������ ���ٸ� : split
		
	}
}
