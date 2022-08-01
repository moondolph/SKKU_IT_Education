import java.util.Scanner;

public class YMain1 {
	public static void main(String[] args) {
	// 키, 몸무게를 입력 받아서 -> 비만도 검사 프로그램
		
	// 표준체중 = (키 - 100) * 0.9
	// 비만도 = (실제 체중 / 표준체중) * 100
	// 비만도가 120이 넘으면 비만, 아니면 안 비만 문구를 출력
	// 아무 키나 입력했을 때 프로그램이 종료되게!
		
	Scanner k = new Scanner(System.in);
	System.out.print("키를 입력하세요: ");
	double height = k.nextDouble();
	
	System.out.print("몸무게를 입력하세요: ");
	double weight = k.nextDouble();
	
	double stdWeight = (height - 100) * 0.9;
	double obesity_rate = (weight / stdWeight) * 100;
	
	String obesity = obesity_rate > 120 ? "비만" : "안 비만";
	
	System.out.printf("당신은 키가 %.1fcm, 몸무게가 %.1fkg으로 " + "비만도가 %.1f라서 %s입니다.\n", height, weight, obesity_rate, obesity);
	System.out.println("아무 키나 입력 하면 프로그램이 종료됩니다");
	String bye = k.next();
	System.out.println("프로그램을 종료합니다.");
	System.out.print("힝? 속았지 ? : ");
	String realBye = k.next();
	System.out.println("ㅋㅋㅋ 진짜 안냥!!!");
	System.exit(0); 
	
	
		
	// 	삼항 연산자 : 
	//				조건을 따져서 값을 대입할 때 사용
	//				if문으로 대체가 가능하지만, 문법이 길어짐
	//				(조건식 ? 조건을 만족할 때 쓸 값 : 조건 불성립시 쓸 값
	//
		
	}
	
}
