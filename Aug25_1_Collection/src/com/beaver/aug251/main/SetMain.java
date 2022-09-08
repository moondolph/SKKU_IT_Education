package com.beaver.aug251.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;

// set 계열
// 	   가변사이즈 
//	   중복데이터 자동 삭제 
//	   	  같은 객체 여러번 들어가면 하나만 남김 
//	   순서가 랜덤 
//		 HashSet, TreeSet, ...
//		  =>실전에서는 그닥 유용하지 않음
//			

public class SetMain {
	public static void main(String[] args) {
		HashSet<String> hs =new HashSet<String>();
		hs.add("ㅁㅁ");
		hs.add("ㄴㄴ");
		hs.add("ㅎㅎ");
		hs.add("ㄹㄹ");
		hs.add("ㅎㅎ");
		hs.add("ㄹㄹ");
	
		System.out.println(hs.size());
		System.out.println("-------------");
//		for (int i = 0; i < hs.size(); i++) {
//			System.out.println(hs[i]);
//		}
	
		
		
		for (String a : hs) {
			System.out.println(a);
		}
		System.out.println("-------------");
	
		// ArrayList로 데이터를 받아오자 ! => 정수 - 10개(같은 값이 있도록)
		
		ArrayList<Integer> test = new ArrayList<Integer>();
		Random r = new Random();
		
		for (int i = 0; i < 10; i++) {
			int data = r.nextInt(5)+1;
			test.add(data);
		}
		System.out.println("받아온 결과 : " + test);
		// 중복제거해서   --->set계열에서가능  Hashset 사용
		HashSet<Integer> hashSet = new HashSet<Integer>(test);		//set에 ArrayList를 담아서 중복 제거 !
        for(Integer item : test){
            hashSet.add(item);
        }
        System.out.println("hashSet으로 옮겨담은 결과 : " + hashSet);
        
        /*ArrayList<Integer>*/ test = new ArrayList<Integer>(hashSet);			//중복 제거 후 다시 list로 <-- sort가 set 계열에 없어서
        System.out.println("중복 제거 후 ArrayList에 다시 담은 결과 : " + test);
        
        // 내림차순 정렬 출력
		Comparator<Integer> c = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
//				return o1.compareTo(o2); // 오름차순
				return o2.compareTo(o1); // 내림차순
			}
			
		};
		test.sort(c);
		for (Integer i : test) {
			System.out.println(i);
		}
		
	}
}
