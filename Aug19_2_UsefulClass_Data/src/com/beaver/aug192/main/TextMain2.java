package com.beaver.aug192.main;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TextMain2 {
	
	//���� �Է� �����ǵ�

	// a/b/c/d/e/f/g/....

	// 1/2/a/3 -> ���� : 6 / ��� : 2

	// ���ڶ��... ������ ���ϰ� / ����� ���ϰ� => ��� 

	// ���ڶ��.. �ѱ�� 
 
	
	public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	System.out.println("�Է�(a/b/c/d/...) : ");
	String s = k.next();
	System.out.println();
		
	StringTokenizer st = new StringTokenizer(s,"/");
	
	int n = 0;
	int sum = 0;
	int count = 0;
	
	while (st.hasMoreTokens()) {
		try {
			n = Integer.parseInt(st.nextToken());
			count++;
			sum += n;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
		
	System.out.printf("���� : %d\n",sum);	
	System.out.printf("��� : %.2f\n",(double) sum / count);	
		
		
		
	}
	
	
}
