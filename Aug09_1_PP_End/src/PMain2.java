import java.util.Scanner;

// main함수에서 진행
// 1을 입력하면 학생 수 값을 입력 받을 수 있게
// 2를 입력하면 각 학생들의 점수를 입력 받을 수 있게 (점수 범위 고려 x)
// 3을 입력하면 학생들의 점수리스트 출력 할 수 있게(ex : 1번 학생 점수 : 50점 )
// 4를 입력하면 최고점수와 평균점수를 분석해서 출력 할 수 있게
// 5를 입력하면 프로그램 종료

public class PMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int selectNo = 0;
		int studentNum = 0;
		int[] scores = null; // 배열의 기본값 = null
		a: while (true) {
			System.out.println("==================================================");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("==================================================");
			System.out.print("선택> ");
			selectNo = k.nextInt();

			switch (selectNo) {
			case 1:
				System.out.print("학생 수 : ");
				studentNum = k.nextInt();
				scores = new int[studentNum];
				break;
			case 2:
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("%d번 학생 점수 입력 : ", i + 1);
					scores[i] = k.nextInt(); // 각 인덱스마다 값 넣기
				}
				break;
			case 3:
				int index = 1;
				for (int i : scores) {
					System.out.printf("%d번 학생 점수 : %d점\n", index++, i);
				}
				break;
			case 4:
				int max = 0;
				int sum = 0;
				double avg = 0;
				for (int i : scores) {
					sum += i;
					max = (max < i) ? i : max;
				}
				avg = (double) sum / scores.length;
				System.out.printf("최고 점수 : %d점\n", max);
				System.out.printf("평균 점수 : %.2f점\n", avg);
				break;
			case 5:
				System.out.println("종료합니다.");
				System.out.println("===========================================");
				break a;
			}

		}

		// Scanner k = new Scanner(System.in);
//		
//		while(true) {
//		System.out.print("번호를 입력하세요: ");
//		int a = k.nextInt();
//		int[] student = null ;
//		int studentNum = 0;
//		if (a==1) {
//			System.out.print("학생 수: ");
//			studentNum = k.nextInt();
//			
//		
//		}
//		if (a==2) { 
//				for(int i=0;i<studentNum;i++) {
//					System.out.printf("%d번째 학생의 점수 : ", i);
//					int point = k.nextInt();
//					student[i] = point;	
//			}	
//		}	
//					
//		if(a==3) {	for(int j=0; j<studentNum; j++) 
//		{
//		System.out.printf("%d번 학생 점수: %d점",j,student[j]) ;
//			}
//		}
//		
//		if(a==4) { int max = student[0]; double plus = 0;
//		for(int m=0;m<studentNum;m++) { if(max<student[m]) 
//		max = student[m];
//		plus += student[m] ;
//		}
//							
//		System.out.printf("최고점수 : %d",max);
//		System.out.printf("평균점수 : %.1d",plus/studentNum);
//						}
//		if(a==5) {
//			System.out.println("프로그램을 종료합니다.");
//			break;
//		}
//						
//				
//			}
	}

}
