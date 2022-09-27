public class StartMain {
	// 주석(Comment) : 필기, 기능설명 용도,  
	// / : Slash
	// \ : BackSlash
	
	//주석에는 두 종류가 있다.  한 줄 주석과 여러 줄 주석 !!
	
	//1. 한 줄 주석은 ctrl+/를 누르면 된다. 아니면 //를 직접 쳐라. 

	//2. 여러 줄 주석은 /*를 치고 엔터 누르면 
	/*	다음 과 같이 쫘라라라락 내려간다. 
	 * 하지만 비효율적이서 쉬프트+방향키로 여러 줄을 드래그하고 컨트롤+/가 더 편하다.   
	 * 
	 */

	
	// /**이건 자바 doc를 만드는 명령어다.
//	인수인계를 하거나 기능을 명세할 때, 
//	자바 소스 파일들을 문서화 할 일이 있을 수 있는데 이럴때 html 형식으로 설명, 
//	하이퍼링크를 생성해주는 것이 javadoc이다.
	/**
	 * 좀 멋지네 ㅋㅋ
	 * 
	 */
	
	
	
	/**
	* 다른 사람들에게 보여주기 위한 설명서
	* @author beaver
	* @version 1.1.10
	*/
	
	// Java !
	// 세심하게 하나하나 개발자가 손을 봐줘야...!
	// 상대적으로 저급언어
	// => 먼저 Java를 공부하고 나중에 다른언어(Python)를 습득할때 좀 더 쉽게..~
	// 전 세계적으로 많이 쓰는 언어 중 하나 !
	// => 개발자들이 작업한 자료들을 공개 / 공유하는 문화가 존재 !
	
	// OpenJDK
	// .msi / .zip
	// msi->설치버전 : 한 컴퓨터에서 Eclipse를 여러개 사용 o
	// zip->압축버전 : 한 컴퓨터에서 Eclipse를 하나만 사용 o
	
	
	//  Java를 사용하려면 JDK(Java Development Kit)가 설치가 되어있어야 하는데, 
	//  JDK = JRE + 실행 키트를 합쳐놓은 개념
	//  JRE (Java Runtime Environment), Java로 만든 프로그램을 실행할 수 있게 하는 것
	//  Oracle JDK vs OpenJDK 
	//  Sun마이크로시스템즈에서 만든 제품 - Java
	//  Sun사가 Oracle에 인수를 당함
	//  Oracle의 제품 - Java
	//	Oracle JDK(OpenJDK + 추가 기능) : 유료
	//	OpenJDK : 무료
	// 	LTS (Long Term Support)	
			
	// javac.exe : JDK에 포함이 되어있는 주요한 Java의 컴파일러(Complier)
	// 이 텍스트 파일(Hello)을 Bytecode(바이트코드, 실행을 하기 위한 이진 표현법)로 변환
	// 		이것을 Complie이라고 함
	// 이 컴파일 과정을 해주는게 javac ! 
	// 텍스트파일을 javac로 실행하면, .class파일이 생성된 것을 볼 수 있음 !
	
	// java.exe : 컴파일 된 .class파일을 실행시켜주는 프로그램
	
	//  javac.exe : 영어,한국어... --번역--> 기계어
	
	//  java.exe  : 기계어 --실행-->  
	
	// Eclipse는
	// 통합 개발 환경(IDE)중 하나이다.
	// Intellij, VSCode, ...등등 많지만 
	// 굳이 Eclipse를 선택한 이유...? => 무료라서 !ㅋㅋㅋ 걍 교육용으로 많이 씀 
	
	// Developer vs Enterprise 
	// 기본적인 서비스만 제공 vs 기본 서비스 + 추가 기능
	
	// Encoding 
	// 사람이 입력한 글자를 컴퓨터가 사용할 수 있게 신호로 바꿔주는 것
	// MS949, UTF-8, EUC-KR, ...
	
	/* 알아두면 유용한 단축키 !
	 * 1. ctrl + s : 저장   ㅇ
 	   2. ctrl + a : 전체 선택 ㅇ
 	   3. ctrl + m : 화면비율 ㅇ 
	 * 4. ctrl + shift + / : 여러 줄 주석처리 ㅇ
       5. ctrl + alt + 방향키(위/아래로) : 그 줄 기준으로 (위/아래로) 복사 ㅇ  	
	   6. alt + 방향키(위/아래) : 그 줄을 위/아래로 이동 ㅇ  
	   7. ctrl + shift + +/- (숫자키 옆) : 글자 크기를 키우거나 줄일때 ㅇ   
	   8. ctrl + d : 그 줄 삭제 ㅇ
	   9. ctrl + spacebar : 자동완성 ㅇ
	  10. ctrl + f : 줄 정리 기능 ㅇ
	  11. ctrl + f11 : 실행 기능 ㅇ
	   
	   
	 */
	
	
	//ㅋㅋㅋ를 출력해주는 기능을 하는 메소드 prinkkkk
	
	public static void printkkk(int a) {	//외부 파라미터 a를 받는 메소드 printkkk(int a)
		System.out.println("ㅋㅋㅋ");	
	}

	// ㅎㅎㅎ를 줄력해주는 기능을 하는 메소드 printhhh
	public static void printhhh( ) {
		System.out.println("ㅎㅎㅎ");
	}
	
	//실행은 main에서 !!! 
	public static void main(String[] args) {
		printkkk(123);	// a자리에는 int(정수)를 넣어줘야 한다.
		printhhh();
		printkkk(); 	// 안 넣으면 에러 뜸 
	
	}
}






