package com.jaden.oct062.fruit;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Fruits {
	private List<Fruit> fruit;
	
	public Fruits() {
		
	}

	public Fruits(List<Fruit> fruit) {
		super();
		this.fruit = fruit;
	}

	public List<Fruit> getFruit() {
		return fruit;
	}

	@XmlElement
	public void setFruit(List<Fruit> fruit) {
		this.fruit = fruit;
	}
	
	
	
	
	
	
	
	
}
