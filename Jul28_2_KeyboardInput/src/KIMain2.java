import java.util.Scanner;

public class KIMain2 {
	public static void main(String[] args) {
		//반지름을 입력받아서 원의 면적 계산하기!
//		Scanner circle = new Scanner(System.in);
//	
//		System.out.print("반지름을 입력하시오:");
//	int r = circle.nextInt();
//		System.out.printf("원의 면적:%.2f\n",Math.pow(r, 2)*Math.PI);	
//			
//		
//		
//		// 가로, 세로 입력 받아서 사각형 면적 계산하기!
//		Scanner square = new Scanner(System.in);
//		System.out.print("가로를 입력하시오:");
//		double horizontal = square.nextDouble();
//		System.out.print("세로를 입력하시오:");
//		double vertical = square.nextDouble();
//		System.out.printf("사각형의 면적: %.2f\n",horizontal * vertical);
//		
		
		
		// 시간(초)를 입력 받아서
//		Scanner time = new Scanner(System.in);
//		System.out.print("초를 입력하시오:");
//		int second = time.nextInt();
//		
//		System.out.printf("분으로 환산하면: %.4f\n",second / 60);
//		System.out.printf("시간으로 환산하면: %.4f\n",second / 3600);
//		
		// int 나누기 int = int 이므로 오류 뜸 (소수점 부분 다 잘림)
		// 따라서 
		Scanner time = new Scanner(System.in);
		System.out.print("초를 입력하시오:");
		int second = time.nextInt();
		double minute = second / 60;
		double hour = minute / 60;		
		System.out.printf("분으로 환산하면: %.4f\n",minute);
		System.out.printf("시간으로 환산하면: %.4f\n",hour);
		
	}
}
