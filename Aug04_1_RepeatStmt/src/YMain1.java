import java.util.Scanner;

public class YMain1 {
	public static void main(String[] args) {
		// 점수를 입력 받아서 90이상 이면 'A',
		// 90미만 80이상이면 'B'
		// 80미만 70이상이면 'C'
		// 70미만 60이상이면 'D'
		// 60미만이면 'F' 를 출력
		// switch-case로 !

		Scanner k = new Scanner(System.in);
		System.out.print("점수: ");
		int point = k.nextInt();
		char grade ;
		switch (point / 10)  {   // JAVA에서 정수 ÷ 정수는 나머지 부분 잘리는 것을 응용한다.								
		case 10: case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		System.out.printf("당신의 등급은 %c입니다.", grade);
	}
}
