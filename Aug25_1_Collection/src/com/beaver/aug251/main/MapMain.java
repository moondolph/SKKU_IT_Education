package com.beaver.aug251.main;

import java.util.HashMap;
import java.util.Set;

// Map �迭 (Python : dict / Object-C : NSDictionary)
// 	    ���������� 
//		<Key, Value>
//		Key���� ��������� ��
//		���� ���� X
//		HashMap, HashTable, ...,

public class MapMain {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("�Ƹ޸�ī��", 4000);
		hm.put("������", 5000);		//����
		hm.put("�����̵�", 6000);
		hm.put("������", 7000);		// '������' key���� ���� ������ 
									// ���� �������� ����� Value������ '����' ��
		
		
		System.out.println(hm.get("������")); // key���� ������ value���� ���
		System.out.println("------------------------");
		
		
		Set<String> k = hm.keySet(); // key���� ����
		for (String string : k) {
			System.out.println(string); //key���� ����, ������ �ߺ� -> �ϳ� ���� 
			System.out.println(hm.get(string)); // �ش� key���� �´� value ���� ���
			System.out.println("--------------------------");
		}
		
		
		
		
		
		
	}
}
