
public class WhatIsValue {
	// 알고 싶은 자료형의 기본값을 멤버변수로 만들어서
	//기본형 - 정수
	byte byteField;
	short shortField;
	int intField;
	long longField;
	
	boolean booleanField;
	char charField;  
	float floatField ;
	double doubleField;
	String stringField;
	int[] arrayField;
	
	
	// 출력하는 메소드를 생성
	public void printInfo() {
		
		System.out.println("byte : " + byteField);
		System.out.println("short : " + shortField);
		System.out.println("int : " + intField);
		System.out.println("long : " + longField);
		System.out.println("boolean : " + booleanField);
		System.out.println("char : " + charField);// 기본값이 띄어쓰기
		 										// (유니코드 :\u0000)
		System.out.println("float : " + floatField);
		System.out.println("double : " + doubleField);
		System.out.println("String : " + stringField);
		System.out.println("Array : " + arrayField);

	}
	
	
	
}
