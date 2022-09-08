package com.beaver.aug171.main;

import com.beaver.aug171.product.Computer;
import com.beaver.aug171.product.Scanner;

public class PMain1 {
	public static void main(String[] args) {
		// 매직스테이션, 800000원, i5-1234, 8GB, 500GB 컴퓨터
		// 출력
		Computer c = new Computer("매직스테이션", 800000, "i5-1234", 8, 500);
		c.printInfo();
		System.out.println("---------------");
		// 멀티익스프레스, 500000원 스캐너
		// 출력
		com.beaver.aug171.product.Scanner s
			= new com.beaver.aug171.product.Scanner("멀티익스프레스", 500000);
		s.printInfo();
					
					
					
	}
}
