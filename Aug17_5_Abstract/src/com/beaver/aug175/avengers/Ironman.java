package com.beaver.aug175.avengers;

import com.beaver.aug175.drive.Drive;
import com.beaver.aug175.smoke.Smoke;

public class Ironman extends Avengers implements Drive, Smoke {

	int property;
	
	public Ironman() {
		// TODO Auto-generated constructor stub
	}

	public Ironman(String name, int age, int property) {
		super(name, age);
		this.property = property;
	}
	
	public int getProperty() {
		return property;
	}

	public void setProperty(int property) {
		this.property = property;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(property);
	}
	
	
	@Override
	public void attack() {
		System.out.println("Å»¸ð ºö!!!");
	}
	
	@Override
	public void drive() {
		System.out.println("ºÎ¸ªºÎ¸ª");
	}
	
	@Override
	public void smoke() {
		System.out.println("»µ²û»µ²û");
		
	}

	
	
	
	
	
	
	
}
