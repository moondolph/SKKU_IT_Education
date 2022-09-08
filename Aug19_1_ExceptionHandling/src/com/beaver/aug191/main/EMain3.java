package com.beaver.aug191.main;

import java.io.FileReader;
import java.util.Scanner;

import com.beaver.aug191.calculator.Calculator;

// Java
//		예외처리가 강제
// Python
//		처리하기 싫으면 안해도 됨

public class EMain3 {
	public static void main(String[] args) {
		// txt파일을 받아와서 뭔가 할건데..만약에 !
		// 이 텍스트파일을 지웠거나, 없는 파일이라면 ?
		try {
			FileReader fr = new FileReader("C:\\Users\\user\\Desktop\\test.txt");
			System.out.println(fr.read());
		} catch (Exception e) {
			e.printStackTrace();
		}

	
		// 가격 / 무게(g)를 입력 받아서 (정수로)
		// g당 가격이 얼마인지 출력
		// 기능에 대한 것은 Class하나 열어서!
		Scanner k = new Scanner(System.in);
		System.out.print("가격(원) : ");
		int price = k.nextInt();
		System.out.print("무게(g) : ");
		int weight = k.nextInt();
		System.out.println("=============");		
		
		int z1 = Calculator.divide(price, weight);
		System.out.printf("g당 가격은 : %d원\n", z1);
		
		try {
			int z2 = Calculator.divide2(price, weight);
			System.out.printf("g당 가격은 : %d원\n",z2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// g당 얼마인지...
		// 다른 메소드에서 try - catch ... -->월권 행위 O / main 메소드에서만 사용 !
		// throws : 이걸 더 많이 사용함 ! / main 메소드 이외의 메소드 !
		
		
		
		
			
		
		
		
		
	}
}
