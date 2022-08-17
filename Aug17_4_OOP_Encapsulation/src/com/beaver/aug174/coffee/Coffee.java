package com.beaver.aug174.coffee;

public class Coffee {

	private String name;
	private int price;

	public Coffee() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Coffee(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(price);

	}

}
