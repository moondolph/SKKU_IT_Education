package com.beaver.aug251.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;

// set �迭
// 	   ���������� 
//	   �ߺ������� �ڵ� ���� 
//	   	  ���� ��ü ������ ���� �ϳ��� ���� 
//	   ������ ���� 
//		 HashSet, TreeSet, ...
//		  =>���������� �״� �������� ����
//			

public class SetMain {
	public static void main(String[] args) {
		HashSet<String> hs =new HashSet<String>();
		hs.add("����");
		hs.add("����");
		hs.add("����");
		hs.add("����");
		hs.add("����");
		hs.add("����");
	
		System.out.println(hs.size());
		System.out.println("-------------");
//		for (int i = 0; i < hs.size(); i++) {
//			System.out.println(hs[i]);
//		}
	
		
		
		for (String a : hs) {
			System.out.println(a);
		}
		System.out.println("-------------");
	
		// ArrayList�� �����͸� �޾ƿ��� ! => ���� - 10��(���� ���� �ֵ���)
		
		ArrayList<Integer> test = new ArrayList<Integer>();
		Random r = new Random();
		
		for (int i = 0; i < 10; i++) {
			int data = r.nextInt(5)+1;
			test.add(data);
		}
		System.out.println("�޾ƿ� ��� : " + test);
		// �ߺ������ؼ�   --->set�迭��������  Hashset ���
		HashSet<Integer> hashSet = new HashSet<Integer>(test);		//set�� ArrayList�� ��Ƽ� �ߺ� ���� !
        for(Integer item : test){
            hashSet.add(item);
        }
        System.out.println("hashSet���� �Űܴ��� ��� : " + hashSet);
        
        /*ArrayList<Integer>*/ test = new ArrayList<Integer>(hashSet);			//�ߺ� ���� �� �ٽ� list�� <-- sort�� set �迭�� ���
        System.out.println("�ߺ� ���� �� ArrayList�� �ٽ� ���� ��� : " + test);
        
        // �������� ���� ���
		Comparator<Integer> c = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
//				return o1.compareTo(o2); // ��������
				return o2.compareTo(o1); // ��������
			}
			
		};
		test.sort(c);
		for (Integer i : test) {
			System.out.println(i);
		}
		
	}
}
