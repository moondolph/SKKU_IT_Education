package com.beaver.aug221.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ExampleMain2 {
	// �л��� (�̸�/�������(yyyy.MM.dd)/����/����/����)�� �Է� �޾Ƽ�
	// �л��� ����(�ѱ�����), ����, ��� ���� ���
	// StringTokenizer
	
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("�̸�/�������(yyyy.MM.dd)/����/����/���� : ");
		String s = k.next();
		
		StringTokenizer st = new StringTokenizer(s, "/");
		System.out.printf("�̸� : %s\n", st.nextToken());
		
		try {
			String bd = st.nextToken();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
			Date birthday = sdf.parse(bd);
			System.out.println(birthday);
			
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
			String birthdayStr = sdf2.format(birthday);
			System.out.printf("���� : %s\n", birthdayStr);
			
			SimpleDateFormat yearFmt = new SimpleDateFormat("yyyy");
			String nowYr = yearFmt.format(new Date());
			int ny = Integer.parseInt(nowYr);
			
			String birthdayYr = yearFmt.format(birthday);
			int by = Integer.parseInt(birthdayYr);
			
			int age = ny - by + 1;
			System.out.printf("���� : %d��\n", age);

			int kor = Integer.parseInt(st.nextToken());
			int math = Integer.parseInt(st.nextToken());
			int eng = Integer.parseInt(st.nextToken());

			System.out.printf("���� : %d��\n", kor);
			System.out.printf("���� : %d��\n", math);
			System.out.printf("���� : %d��\n", eng);
			
			int sum = kor + math + eng;
			System.out.printf("���� : %d��\n", sum);
			double avg = (double) sum / 3;
			System.out.printf("��� : %.2f��\n",avg);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
//		Scanner k = new Scanner(System.in);
//		System.out.print("�̸�/�������(yyyy.MM.dd)/����/����/���� �Է�: ");
//		String str = k.next();
//		
//		//��ũ������ ���
//		StringTokenizer tokenizer = new StringTokenizer(str,"/");
//		String[] tokenArray = null;
//		
//		for(int i=0; i<5; i++) {
//		tokenArray[i] = tokenizer.nextToken();
//		}
//		System.out.println(tokenArray[0]);
//		System.out.println(tokenArray[1]);
//		System.out.println(tokenArray[2]);
//		System.out.println(tokenArray[3]);
//		System.out.println(tokenArray[4]);
		
		
		
		
		
		

//        System.out.println("=== String Tokenizer Strart ===");
//        while (tokenizer.hasMoreTokens()){
//            System.out.println(tokenizer.nextToken());
//        }
//		}
		
	}

}
