import java.util.Scanner;

// 정수 2개를 입력받아서 (각각의 함수에)
// 그 정수 2개를 더했을때 짝수면 결과 리턴, 아니면 값을 재입력
public class YMain2 {

	public static int getNum() {
		
		Scanner k = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요: ");
		int a = k.nextInt();
		return a ;
		
	}

	public static int getNum2() {
		

		Scanner k = new Scanner(System.in);
		System.out.print("두번째 정수를 입력하세요: ");
		int b = k.nextInt();
		return b ;
		
	}
		
	//덧셈을 계산해서 결과를 리턴할 함수
	
	public static int getResult(int a, int b) {
		int sum = a + b ;
//		return (sum % 2 == 0) ? sum : getResult(a, b);  // 원하는 값이 들어오지 않으면 
													    // 무한루프가 돌아감
													// => 처음 홀수를 입력한 값이 계속 계산됨!
		return (sum % 2 == 0) ? sum : getResult(getNum(), getNum2());
	}
	
	
	public static void main(String[] args) {
		int a = getNum();
		int b = getNum2();
//		System.out.println(a);
//		System.out.println(b);
		int sum = getResult(a,b);
		System.out.println(sum);
	
	}
	


}
