public class WhatIsValue {
	// �˰� ���� �ڷ����� �⺻���� ��������� ����
	//�⺻�� - ����
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
	
	
	// ����ϴ� �޼ҵ带 ����
	public void printInfo() {
		
		System.out.println("byte : " + byteField);
		System.out.println("short : " + shortField);
		System.out.println("int : " + intField);
		System.out.println("long : " + longField);
		System.out.println("boolean : " + booleanField);
		System.out.println("char : " + charField);// �⺻���� ����
		 										// (�����ڵ� :\u0000)
		System.out.println("float : " + floatField);
		System.out.println("double : " + doubleField);
		System.out.println("String : " + stringField);
		System.out.println("Array : " + arrayField);

	}
	
	
	
}
