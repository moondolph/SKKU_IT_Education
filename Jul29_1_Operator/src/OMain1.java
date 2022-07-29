import java.util.Scanner;

public class OMain1 {
	public static void main(String[] args) {
		// 변수
		// 자료형 변수형 = 값;
		// = (대입연산자)
		// A = B
		// 우항에 있는 것을 좌항에 넣어라. 
		// 변수에 값을 넣을 때 사용
		
		// 사칙연산 (Scanner + 출력) 
		// 숫자는 2개만 입력받음 (x, y)
		// 
		
		Scanner a = new Scanner(System.in);
		System.out.print("x = ");
		int x = a.nextInt();
		
		System.out.print("y = ");
		int y = a.nextInt();
		
		System.out.printf("x+y = %d\n",x+y);
		System.out.printf("x-y = %d\n",x-y);
		System.out.printf("x*y = %d\n",x*y);
		System.out.printf("x/y = %.2f\n",x*1.0/y);
		System.out.printf("x/y = %.2f\n",(double) x/y);
		
	
		// 사칙연산 : 산술연산자
		int plus = x + y;
		int minus = x - y;
		int multiply = x * y;
		int divide = x / y;
		
		System.out.printf("%d + %d = %d\n",x,y,plus);
		System.out.printf("%d - %d = %d\n",x,y,minus);
		System.out.printf("%d * %d = %d\n",x,y,multiply);
		System.out.printf("%d / %d = %d\n",x,y,divide);
		
		// int / int = int(Java 한정) ex) 10 / 4 = 2 (o), 2.5 (x)
		// double / int = double
		// int / double = double
		// double / double = double
		
		double divide2 = (double) x / y; // 형 변환
		System.out.println(divide2);
		
		//나누기 후에 나머지 값 구할 때
		int remainder = x % y;
		System.out.println(remainder);
		
		System.out.println("----------------------");
		// 다시 리마인드!!!
		// A = B는 같다라는 의미가 아니라, <A에 B를 넣어라!>
		// x = 10, y = 4
		System.out.printf("x는 %d\n", x); // 10
		System.out.printf("y는 %d\n", y); // 4
		x = y;
		System.out.printf("x는 %d\n", x); // 4
		System.out.printf("y는 %d\n", y); // 4
		
		// 대입연산자를 활용!
		// [ +=, -=, *=, /=, %=]
		// 한 글자 2byte -> 한 글자라도 덜 쳐서...
		
		x += 1; // x = x + 1;
		System.out.println(x);
		
		x -= 1; // x = x - 1;
		System.out.println(x);
		
		x *= 2; // x = x * 2;
		System.out.println(x);

		x /= 2; // x = x / 2;
		System.out.println(x);
		
		x %= 2; // x = x % 2;
		System.out.println(x);
		
		// 한번 더 줄이기
		// ++, --
		x++; // x += 1; // x = x + 1;
		System.out.println(x);
		
		x--; // x -= 1; // x = x - 1;
		System.out.println(x);
		
		//x**;
		//x//;    얘네는 안 됨.
		//x%%;
	}
}
