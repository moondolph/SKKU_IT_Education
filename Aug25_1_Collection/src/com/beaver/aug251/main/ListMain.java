package com.beaver.aug251.main;

import java.util.ArrayList;
import java.util.Comparator;

// ArrayList   <== 리스트 배열의 대표적인 종류
// 요소를 인덱스로 사용하는 것이 배열과 유사
// 배열 : 사이즈가 고정 -> 데이터의 수가 배열의 크기보다 많아지면 저장이 불가능!
// ArrayList : 저장되는 데이터의 수에 따라서 크기가 자동으로 변경
//				요소가 가득차게 되면 ArrayList의 크기를 동적으로 증가시키고, 그 반대도 마찬가지..
//				자료형을 섞어서 데이터를 넣는게 가능! - 좋다? -> 글쎄...

// 자료형을 통일하고 싶다!
//	<  > - generic
//		자료형을 고정하는 역할 
//		클래스명<자료형의 객체형> 값을 넣으면...

public class ListMain {
	public static void main(String[] args) {

		ArrayList test = new ArrayList();
		test.add("추석");
		test.add(910);
		test.add("무야호~");
		test.add(9.10);
		test.add(true);
		
		
		for (Object object : test) { 		// 자료형이 통일되지 않아서 object가 무슨 자료형인지 헷갈림...
			System.out.println(object);
		}
		System.out.println("-------------------------");
	
		ArrayList<String> al = new ArrayList<String>();
		al.add("파인애플");
//		al.add(1);   //에러 ! String만 넣을 수 있음 ! 
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(new Integer(100));
		al2.add(50); //Auto-Boxing
		
		System.out.println(al2.get(0)); // 해당 인덱스의 값
		System.out.println(al2.size()); // al2의 요소 개수
		System.out.println("------------------------");
		
		for (int i = 0; i < al2.size(); i++) {
			System.out.println(al2.get(i));
		}
		System.out.println("------------------------");
		al2.add(30);
		al2.add(1, 90); // 1번 자리에 90 넣기       //없던거 추가
 		al2.set(2, 0); 	// 2번 자리를 0으로 바꾸기	//있던거 바꾸기
		al2.remove(0);  // 0번 자리에 있는 값 지우기
		
		for (Integer ii : al2) { 
			System.out.println(ii);
		}
		al.add("사과");
		al.add("수박");
		al.add("감");
		al.add("귤");
		al.add("hi");
		al2.add(300);
		al2.add(35);
		System.out.println("--------------------------");
		
		
		//정렬기능
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
				return o1.compareTo(o2); //오름차순 
			//  return o2.compareTo(o1); //내림차순	
			}
		};
		al2.sort(c2);
		
		for (Integer s : al2) {
			System.out.println(s);
		}
		System.out.println("--------------------");
		
		
		
		
		
		
		
		
		
	}
}
