package com.beaver.aug177.main;

import com.beaver.aug177.register.Academy;
import com.beaver.aug177.register.Student;

// �п����� �л��� ����� �� �ش� Ŀ��ŧ�� ����ڷ� ����Ϸ��� ��
// �л��� ������ �̸� / ���� !
// ��� ������� ��ȣ�� �ο��ϰ� ������ ��� �ؾ� �ұ� ?
// 


public class FMain1 {
	public static void main(String[] args) {
		Academy ac = new Academy();

		Student s1 = ac.consult("aa", 20);
		s1.printInfo();
		System.out.println("=======");
		Student s2 = ac.consult("bb", 21);
		s2.printInfo();
		System.out.println("=======");
		Student s3 = ac.consult("cc", 22);
		s3.printInfo();
		System.out.println("=======");
	
	}
}
