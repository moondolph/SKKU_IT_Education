package com.beaver.aug251.main;

import java.util.HashMap;
import java.util.Set;

// Map 계열 (Python : dict / Object-C : NSDictionary)
// 	    가변사이즈 
//		<Key, Value>
//		Key값도 지정해줘야 함
//		순서 개념 X
//		HashMap, HashTable, ...,

public class MapMain {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("아메리카노", 4000);
		hm.put("녹차라떼", 5000);		//생성
		hm.put("레몬에이드", 6000);
		hm.put("녹차라떼", 7000);		// '녹차라떼' key값이 같기 때문에 
									// 제일 마지막에 저장된 Value값으로 '수정' 됨
		
		
		System.out.println(hm.get("녹차라떼")); // key값을 넣으면 value값을 출력
		System.out.println("------------------------");
		
		
		Set<String> k = hm.keySet(); // key값만 추출
		for (String string : k) {
			System.out.println(string); //key값만 추출, 녹차라떼 중복 -> 하나 삭제 
			System.out.println(hm.get(string)); // 해당 key값에 맞는 value 값을 출력
			System.out.println("--------------------------");
		}
		
		
		
		
		
		
	}
}
