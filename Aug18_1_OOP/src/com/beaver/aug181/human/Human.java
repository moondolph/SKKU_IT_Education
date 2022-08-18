package com.beaver.aug181.human;

import com.beaver.aug181.avengers.Avengers;

public class Human {

	private String name;
	private Avengers hero;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void pick(Avengers a) {
		hero = a;
		System.out.println("之之之元");
	}
	
	public void helpAaaaaa() {
		hero.attack();
	}
	
	
}
