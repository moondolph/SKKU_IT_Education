package com.beaver.aug192.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// Date.java : ��~~~~~~~~~~~~�� ������ (1900���) ������� Class
// 			Y2K�� ������ ���� ����...(Year 2000 problem) >> (K(kilo) = 1000)
//			���� ������ ���� ����
//			1900��� ��ÿ� �뷮�� ������ ������ ���� ���� 2�ڸ���...
//			1970��� ������ ��ǻ�� : �ӵ��� ������, ��ġ�� �뷮�� ������.
// 			�����;��� �Ƴ��� ���ؼ� ����ó���� 4byte�� �ƴ�, 2byte�� �Ҵ�
//			������ ����...!
//			1900��, 2000�� ���� ���ڸ��� 00���� �ν��ؼ� ���ϵ� --> ������ �Ұ���
//				-> ��ǻ���� ���۵� ���ɼ��� ������...!

//	deprecated
//		������ �帣��, ��ǻ�͵� ���� -> ������ ����� ������ ��������...
//		���α׷��־� ������Ʈ�� �Ǿ�� �ϴµ� 
//		���ְų� / ����� ������ ��ȹ�� ���ܹ���
//		���� �ڹٹ��������� OK !! / ���� ������ �������� �Ҹ����� ����!!
//		

// Date : ��¥ / �ð� 
public class DateMain {
	public static void main(String[] args) {
		// �⺻ ���� -> ���� �ð� / ��¥
		Date now = new Date();
		// ���� �ð� ��¥�� ���
		System.out.println(now);

		// ���� year
		System.out.println(now.getYear() + 1900); // �������� 1900���̶� 122�� ����

		// �� month
		System.out.println(now.getMonth() + 1); // 0���� �����ؼ� 7�� ����

		// �� date
		System.out.println(now.getDate()); // �� ����

		// ���� day
		System.out.println(now.getDay()); // 0 ~ 6 ( �� ~ �� )
		String[] day = { "��", "��", "ȭ", "��", "��", "��", "��" };
		System.out.println(day[now.getDay()] + "����");
		System.out.println("===========================");
		// �ѱ�ó��/��¥/�ð� : ���������� �����е��� ������ ��...! o0o!!!

		// Date - ���� ���� -> String
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd E a hh:mm", Locale.CANADA);

		String s1 = sdf.format(now);
		System.out.println(s1);
		System.out.println("===========================");

		// Ư�� �ð� ��¥
		Date d2 = new Date(2000, 8, 19);

		// String - ���� ���� -> Date
		try {
			String s2 = "2000/08/19";
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
			Date d3 = sdf2.parse(s2);
			System.out.println(d3);
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		System.out.println("=============================");
		// 10���� ũ���������� ���� ����? =>ȭ / ��
		try {
			String christmas = "2012.12.25";
			SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy.MM.dd");
			Date christmas2 = sdf3.parse(christmas);
//		System.out.println(christmas2);

			SimpleDateFormat sdf4 = new SimpleDateFormat("E");
			String christmas3 = sdf4.format(christmas2);
			System.out.println(christmas3 + "����");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
