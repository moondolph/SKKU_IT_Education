package com.beaver.aug191.main;

import java.util.Scanner;

// ���α׷� ���� => �ܼ�â�� �����۾��� ~~~~ ������ �� => ���� / ���� / ���� �˸� / ���

// error 
// 		�ѱ��� - ���� -> ����
// 		���			 apple 	
//		�ٳ���		 banana
//		����           ???
// 	Java�� ������ �ȸ°� �Ἥ �������� �Ұ����� ���� 
// 	������ �߸� ! 
// 	�ϼ����� ������ ����

// 	warning
//		�������� �ڵ�
//		������ �߸� !
//		�������� �����ϴ� => �ϼ����� ����(�����ϴµ� ���� ���� O)
//		��Ŭ������ �ܼҸ��� ��..!
//		ex) Scanner ��ü ����� ���� => �� ����� �� ����

// 	exception
//		���α׷��� 100% �ϼ�!		
//		������ �� ���� �ܺ����� ���ο� ���ؼ� �۵��� ����� �ȵǴ� ��Ȳ ...
//		������ �߸��� �ƴ� 
//		������ ���� -> �����ڰ� ��Ȳ�� �����ؼ� ��å�� �������� ...!
//

public class EMain1 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("x : ");
		int x = k.nextInt();

		System.out.print("y : ");
		int y = k.nextInt();

		System.out.printf("x + y : %d\n", x + y);
		System.out.printf("x - y : %d\n", x - y);
		System.out.printf("x * y : %d\n", x * y);
//		System.out.printf("x / y : %d\n", x / y);

		// ���࿡ y ���� 0�� ������ ...? => Exception �߻� !
		
		// Exception ó���� �� �� �ִ� ��� !
//		try {
//			�ϴ� �� �κ��� ���� - (����)
//		} catch (�������� ������) {
//			try���� �����ϴٰ� �ش� ������ ���ܰ� �߻��ϸ� �� �κ��� ���� 
//			����, ���� ���� ���������� ������� ���, catch�κ��� �׳� ����ġ��
//			�� ���� �ҽ��� ����
//		} catch (Exception e) {
//			...
//		} finally {
//			���������� ���α׷��� ����ƴ���,
//			���ܰ� �������� ������� ����.
//			return���� ���� ����

		
		// �ΰ��� ������ ���ÿ� ���� ���? => ���� ���� catch�� ���븸 ���
		// JAVA�� ���忡�� ù��° ���ܰ� ������ ��
		// ��� ���� ���� �� �ش� ����ó���κ����� �Ѿ�� ����!
		
		// x : 10, y : 0 => 70 - 71 (Arith) - 75 - 76
		// x : 10, y : 1 => 70 - 71 - 72 - 73 - 76 - 77 
		// x : 2, y : 1 => 70 - 71 - 72 - 73 
		
		 try {
			 System.out.printf("x / y : %d\n", x / y);
			int[] ar = {1, 2, 3};
			 System.out.println(ar[x]);	
		} catch (Exception e) { // ��~~~�� exception�� �� �����
			System.out.println("���� ���� ��");
			e.printStackTrace();	//��Ȳ ��� (�����ڿ�)
		} finally {
			System.out.println("������������������������");
		}
		
		 
	}
}

