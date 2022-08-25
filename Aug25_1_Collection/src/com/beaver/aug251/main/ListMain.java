package com.beaver.aug251.main;

import java.util.ArrayList;
import java.util.Comparator;

// ArrayList   <== ����Ʈ �迭�� ��ǥ���� ����
// ��Ҹ� �ε����� ����ϴ� ���� �迭�� ����
// �迭 : ����� ���� -> �������� ���� �迭�� ũ�⺸�� �������� ������ �Ұ���!
// ArrayList : ����Ǵ� �������� ���� ���� ũ�Ⱑ �ڵ����� ����
//				��Ұ� �������� �Ǹ� ArrayList�� ũ�⸦ �������� ������Ű��, �� �ݴ뵵 ��������..
//				�ڷ����� ��� �����͸� �ִ°� ����! - ����? -> �۽�...

// �ڷ����� �����ϰ� �ʹ�!
//	<  > - generic
//		�ڷ����� �����ϴ� ���� 
//		Ŭ������<�ڷ����� ��ü��> ���� ������...

public class ListMain {
	public static void main(String[] args) {

		ArrayList test = new ArrayList();
		test.add("�߼�");
		test.add(910);
		test.add("����ȣ~");
		test.add(9.10);
		test.add(true);
		
		
		for (Object object : test) { 		// �ڷ����� ���ϵ��� �ʾƼ� object�� ���� �ڷ������� �򰥸�...
			System.out.println(object);
		}
		System.out.println("-------------------------");
	
		ArrayList<String> al = new ArrayList<String>();
		al.add("���ξ���");
//		al.add(1);   //���� ! String�� ���� �� ���� ! 
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(new Integer(100));
		al2.add(50); //Auto-Boxing
		
		System.out.println(al2.get(0)); // �ش� �ε����� ��
		System.out.println(al2.size()); // al2�� ��� ����
		System.out.println("------------------------");
		
		for (int i = 0; i < al2.size(); i++) {
			System.out.println(al2.get(i));
		}
		System.out.println("------------------------");
		al2.add(30);
		al2.add(1, 90); // 1�� �ڸ��� 90 �ֱ�       //������ �߰�
 		al2.set(2, 0); 	// 2�� �ڸ��� 0���� �ٲٱ�	//�ִ��� �ٲٱ�
		al2.remove(0);  // 0�� �ڸ��� �ִ� �� �����
		
		for (Integer ii : al2) { 
			System.out.println(ii);
		}
		al.add("���");
		al.add("����");
		al.add("��");
		al.add("��");
		al.add("hi");
		al2.add(300);
		al2.add(35);
		System.out.println("--------------------------");
		
		
		//���ı��
		Comparator<String> c = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};
		al.sort(c);
		
		for (String s : al) {
			System.out.println(s);
		}
		System.out.println("--------------------");
		
		Comparator<Integer> c2 = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2); //�������� 
			//  return o2.compareTo(o1); //��������	
			}
		};
		al2.sort(c2);
		
		for (Integer s : al2) {
			System.out.println(s);
		}
		System.out.println("--------------------");
		
		
		
		
		
		
		
		
		
	}
}
