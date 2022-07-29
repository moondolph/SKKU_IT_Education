import java.util.Scanner;

public class OMain4 {
	public static void main(String[] args) {
		// 이름을 입력 받을거에요 !
		// 그 이름이 '홍길동'이랑 같은지 true / false
//		Scanner k = new Scanner(System.in);
//		System.out.print("이름: ");
//		String name = k.next();
//		boolean check = ( name == "홍길동"); //'name 주소값'이랑 '홍길동'이라는 값이 다르기 때문에 false가 도출되었음 !
//		System.out.printf("이름일치여부:%b\n",check);
//
//		// **String과 같은지 비교
//		// 대상의 값 자체를 비교하기 위해서 .equals()를 사용!
//		boolean check2 = name.equals("홍길동");
//		System.out.printf("이름일치여부:%b\n",check2);
		
		
		
		
		// Shift 연산자 : 다중선택..!
		// shift : 옮기다. 이동하다.
		// (십진수 << 정수)의 형태
		// << : 앞에 있는 수(십진수)를 2진수로 바꾸고, 뒤에 있는 수(정수)만큼 왼쪽으로 밀어라.
		// 비어있는(오른쪽) 칸 수를 0으로 채우고, 2진수를 다시 10진수로 바꿔라.
		
		// ex) 카페!
		//	   24시간 : 1 << 0 = 1
		//	   와이파이 : 1 << 1 = 2
		//     흡연실 : 1 << 2 = 4
		//     주차장 : 1 << 3 = 8
		
		//A매장 : 2    와이파이
		//B매장 : 8    주차장
		//C매장 : 13   24시간, 흡연실, 주차장
		//D매장 : 6	  와이파이, 흡연실
		
//		int c = (150 << 6);
//		System.out.println(c);
		
		//연산자
		//	단항 연산자 : a++, a--, !a, ... 
		//	이항 연산자 : a + b, a > b, ...
		// 	삼항 연산자 : 
		//				조건을 따져서 값을 대입할 때 사용
		//				if문으로 대체가 가능하지만, 문법이 길어짐
		//				(조건식 ? 조건을 만족할 때 쓸 값 : 조건 불성립시 쓸 값
		//
		
		//나이 값도 입력받아서 
		// 나이가 20살 이상이면 '안녕하세요'를 출력
		// 나이가 20살 미만이면 'NAGA!' 를 출력
		
		Scanner k = new Scanner(System.in);
		
//		System.out.print("이름: ");
//		String name = k.next();
//		
//		System.out.print("나이: ");
//		int age = k.nextInt();
//		System.out.printf("나이는 %d살\n", age);
//		String result = (age >= 20) ? "안녕하세요" : "NAGA!";			
//		System.out.println(result);
//		
//		//이름이 홍길동씨 : 1강의장
//		//또는 나이가 짝수 : 1강의장
//		//나머지는 : 2강의장
//		
//		
//	
//		//String result2 = name.equals("홍길동")|| age % 2 == 0 ? "1강의장" : "2강의장" ;
//		String result2 = (age % 2 == 0) || (name.equals("홍길동")) ? "1강의장" : "2강의장" ;
//		
//		System.out.println(result2);
		
		// 상자 하나에 축구공이 6개 들어갈 수 있습니다.
		// 공의 개수를 입력 받아서 
		// 공을 모두 담을 상자의 개수가 몇 개인지 출력
		
		System.out.print("축구공 개수: ");
		int ball = k.nextInt();
		
		int result3 = ball % 6 == 0 ? ball/6 : ball/6 + 1 ;
		System.out.printf("%d개의 공을 넣는데 필요한 상자 개수: %d개\n",ball,result3);
		
		
		
	}
}
