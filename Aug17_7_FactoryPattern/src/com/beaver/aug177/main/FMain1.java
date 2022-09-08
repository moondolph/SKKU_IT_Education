package com.beaver.aug177.main;

import com.beaver.aug177.register.Academy;
import com.beaver.aug177.register.Student;

// 학원에서 학생을 상담한 후 해당 커리큘럼 대기자로 등록하려고 함
// 학생의 정보는 이름 / 나이 !
// 등록 순서대로 번호를 부여하고 싶은데 어떻게 해야 할까 ?
// 


public class FMain1 {
	public static void main(String[] args) {
		Academy ac = new Academy();

		Student s1 = ac.consult("aa", 20);
		s1.printInfo();
		System.out.println("=======");
		Student s2 = ac.consult("bb", 21);
		s2.printInfo();
		System.out.println("=======");
		Student s3 = ac.consult("cc", 22);
		s3.printInfo();
		System.out.println("=======");
	
	}
}
