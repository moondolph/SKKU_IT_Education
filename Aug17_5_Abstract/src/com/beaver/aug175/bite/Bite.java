package com.beaver.aug175.bite;

// 클래스 : 멤버변수, 메소드 

// 추상클래스 : 멤버변수, 메소드, 추상메소드 
//			-> 객체생성 불가능

// 인터페이스 : 추상메소드, 멤버 상수 
//			-> 객체생성 불가능

public interface Bite {
	// private int a; // 멤버변수 X
	public static final int B = 3; // 멤버 상수 O

//	public void c() {
//		System.out.println("c"); 
//	}	//메소드 x

	public abstract void bite();

}
