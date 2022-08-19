package com.beaver.aug191.calculator;

public class Calculator {

	// 1. 여기서 아예 끝장을 보자 !? : try -catch - finally
	// 정상 :  7 - 8 - 9 [ 14 -15 - 16] - 10 ( [] : finally)
	// 무게 값으로 0 :7 - 8 - 9 (Arith) - 11 - 12[14 - 15 - 16] - 12([] : finally)
	
	public static int divide(int price, int weight) {
		try {
			int d = price / weight;
			return d;
		} catch (Exception e) {
			System.out.println("으엑");
			return - 9999;
		} finally {
			System.out.println("zzzzz");
		}
		
		
	}
	// 2. 미루기 : throws -> try보다 더 주력 
	// divide2를 실행하다가 Arithmetic...가 터지면
	// divide2를 호출한 쪽에서 해결해라!
	public static int divide2(int price, int weight) throws /*Arithmetic*/Exception {
		int d = price / weight;
		return d;
	}
	
	
	
	
	
}
