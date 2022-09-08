package com.beaver.aug176.maru;

public class Maru {

	private String name;
	private int age;
	private String nickname;
	
	private static final Maru MARU = new Maru("¸¶·ç", 3, "µÅÁö");
			
	
	
	public Maru() {
		// TODO Auto-generated constructor stub
	}

	public Maru(String name, int age, String nickname) {
		super();
		this.name = name;
		this.age = age;
		this.nickname = nickname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public static Maru getMaru() {
		return MARU;
	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(nickname);
	}
	
	
	
	
}
