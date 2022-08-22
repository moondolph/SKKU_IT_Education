package com.beaver.aug221.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExampleMain1 {
	// �л��� (�̸� / ������� (yyyy.MM.dd)/����/����/����) �� �Է� �޾Ƽ�
	// �л��� ����(�ѱ�����), ����, ��� ���� ��� 
	// split
	
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("�̸�/�������(yyyy.MM.dd)/����/����/���� : ");
		String s = k.next();

		String[] sData = s.split("/");
		String name = sData[0];
		System.out.printf("�̸� : %s\n", name);
		
		try {
			//����(����)
			String bd = sData[1];
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
			Date birthday = sdf.parse(bd);
			System.out.println(birthday);
		
			Date now = new Date();
			SimpleDateFormat yrFmt = new SimpleDateFormat("yyyy");
			String nowYr = yrFmt.format(now);
			String birthdayYr = yrFmt.format(birthday);
			
			int ny = Integer.parseInt(nowYr);
			int by = Integer.parseInt(birthdayYr);
			int age = ny - by + 1;
			System.out.printf("���� : %d��\n", age);
//			System.out.printf("���� : %d��\n", now.getYear() - birthday.getYear() + 1);
			
			int kor = Integer.parseInt(sData[2]);
			int math = Integer.parseInt(sData[3]);
			int eng = Integer.parseInt(sData[4]);
			
			System.out.printf("���� : %d��\n",kor);
			System.out.printf("���� : %d��\n",math);
			System.out.printf("���� : %d��\n",eng);
			
			int sum = kor + math + eng ;
			System.out.printf("���� : %d��\n", sum);
	
			double avg = (double) sum / 3 ;
			System.out.printf("��� : %.2f��\n", avg);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
//		---------------���� ���� �ڵ�---------------
//		//��ĳ�ʷ� �Է� �޾Ƽ� �迭�� ����
//		Scanner k = new Scanner(System.in);
//		
//		System.out.print("�̸�: ");
//		String name = k.next();
//		System.out.print("�������: ");
//		String birth = k.next();
//		System.out.print("����: ");
//		int korean = k.nextInt();
//		System.out.print("����: ");
//		int math = k.nextInt();
//		System.out.print("����: ");
//		int english = k.nextInt();
//
//		//���� �迭 �� �ᵵ �ɰŰ���
//		//���̴� split�Ἥ .�κ� �ڸ��� 2022 - yyyy + 1�� ���
//		String birthArray[] = birth.split("\\.");
//		System.out.println(birthArray);
//		System.out.println(birthArray[0]);
//		System.out.println(birthArray[1]);
//		System.out.println(birthArray[2]);
//		
//		int yyyy =Integer.parseInt(birthArray[0]);
//		
//		System.out.printf("���� : %d\n", 2022-yyyy+1);
//		
//		
//		//����
//		int total = korean + math + english ;
//		System.out.printf("���� : %d\n", total);
//		
//		
//		//��հ��� ����/3
//		double avg = (double) (korean + math + english) / 3 ;
//		System.out.printf("��� : %.1f", avg);
		
		
		
		
		
		
	}
}
