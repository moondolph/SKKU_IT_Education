package com.beaver.aug191.price1g;

import java.util.Scanner;

public class Price1g {

	public void input() {
		Scanner k = new Scanner(System.in);

		System.out.print("���� : ");
		int price = k.nextInt();

		System.out.print("����(g) : ");
		int weight = k.nextInt();

	}

	public void price1g(int price, int weight) {
		
		double price1g = (double) price / weight;
		
		System.out.println(price1g);
	}
	
}
