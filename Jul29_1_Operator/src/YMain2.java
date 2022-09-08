import java.util.Scanner;

public class YMain2 {
	public static void main(String[] args) {
		
		//국어, 수학, 영어 점수를 입력 받아서 출력
		// 총점과 평균까지
		
		Scanner a = new Scanner(System.in);
		System.out.print("국어 점수를 입력하시오 : ");
		int korean = a.nextInt();
		
		System.out.print("수학 점수를 입력하시오 : ");
		int math = a.nextInt();
		
		System.out.print("영어 점수를 입력하시오 : ");
		int english = a.nextInt();
				
		System.out.printf("국어:%.1d\n",korean);
		System.out.printf("수학:%.1d\n",math);
		System.out.printf("영어:%.1d\n",english);
		System.out.printf("총점:%.1d\n",korean + math + english);
		System.out.printf("평균:%.1f\n", (double) (korean + math + english)/3);

		//int / int = int로 나온다.소수점은 짤림
		//(형변환) 
	}
}
