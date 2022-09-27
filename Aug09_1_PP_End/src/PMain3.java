import java.util.Scanner;

public class PMain3 {
	// 함수를 만들어서 진행
	// 1을 입력하면 학생 수 값을 입력 받을 수 있게
	// 2를 입력하면 각 학생들의 점수를 입력 받을 수 있게 (점수 범위 고려 x)
	// 3을 입력하면 학생들의 점수리스트 출력 할 수 있게(ex : 1번 학생 점수 : 50점 )
	// 4를 입력하면 최고점수와 평균점수를 분석해서 출력 할 수 있게
	// 5를 입력하면 프로그램 종료

	// 첫 시작 부분 
	public static void start() {
		System.out.println("==================================================");
		System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
		System.out.println("==================================================");
		
	}
	
	// 선택할 메뉴 번호 받아오기
	public static int getSelectNo() {
		Scanner k = new Scanner(System.in);
		System.out.print("선택> ");
		int selectNo = k.nextInt();
		return selectNo;
	}
	
	// 학생 수 값 받아오기
	public static int getStudentNum() {
		Scanner k = new Scanner(System.in);
		System.out.print("학생 수 : ");
		int studentNum = k.nextInt();
		return studentNum;
	}
	
	// 학생 개인의 점수 받아오기
	public static int getScore() {
		Scanner k = new Scanner(System.in);
		int score = k.nextInt();
		if (score > 100) {
			System.out.println("점수는 100점을 넘을 수 없습니다.");
			System.out.print("다시 입력 : ");
		} else if (score < 0) {
			System.out.println("점수는 0점보다 낮을 수 없습니다.");
			System.out.println("다시 입력 : ");
		}
		return (score >= 0 && score <= 100) ? score : getScore() ;
	}
	
	// 학생들의 점수 입력하기
	public static int[] getScore(int[] scores) {
		for ( int i = 0; i < scores.length; i++) {
			System.out.printf("%d번 학생 점수 입력 : ",i+1);
			scores[i] = getScore();
		}
		return scores;
	}
	// 학생들의 점수 출력하기
	public static void printScore(int[] scores) {
		int index = 1;
		for (int i : scores) {
			System.out.printf("%d번 학생 점수 : %d점\n", index++, i);
		}
	}
	
	
	// 최고 점수, 평균 점수 출력하기
		public static void printStats(int[] scores) {
	int sum = 0;
	int max = 0;
	double avg = 0;
	for (int i : scores) {
		sum += i;
		max = (max < i)? i : max;
	 }
	avg = (double) sum / scores.length;
	System.out.printf("최고 점수 : %d점\n", max);
	System.out.printf("평균 점수 : %.2f점\n", avg);
  }
	
	// 종료메시지
		public static void end() {
			System.out.println("종료합니다.");
			System.out.println("====================================");
		}
		
	// 전체적인 프로그램이 돌아갈 기능
	public static void activate() {
		int selectNo = 0;
		int studentNum = 0;
		int[] scores = null;
		while (true) {
			start();
			selectNo = getSelectNo();
			if(selectNo ==1) {
				studentNum = getStudentNum();
				scores = new int[studentNum]; // 학생의 수만큼 배열의 크기를 정함
			}else if(selectNo == 2) {
				getScore(scores);
			}else if(selectNo == 3) {
				printScore(scores);
			}else if(selectNo == 4) {
				printStats(scores);
			}else if(selectNo == 5) {
				end();
				break;
			}else {
				System.out.println("입력이 잘못되었습니다.");
				System.out.println("다시 입력하세요.");
			}
			
		}
	}
public static void main(String[] args) {
	activate();
}
	}
	// 
//	public static int intro() {
//		Scanner k = new Scanner(System.in);
//		
//		System.out.println("==================================================");
//		System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
//		System.out.println("==================================================");
//		System.out.print("선택> ");
//		int n = k.nextInt();
//		
//		return n ;
//	}
//	
//	
//	
//	public static int num() {
//		System.out.print("학생 수 : ");
//		Scanner k = new Scanner(System.in);
//		int num = k.nextInt();
//		return num ;
//	}
//	
//	public static void score(int num) {
//		int student[] = null ;
//		for(int i=0;i<num;i++) {
//			student[i] = k.nextInt();
//			
//		}
//	}
//	public static void list(int num, int[] student) {
//		for(int i=0;i<num;i++) {
//			System.out.printf("%d번 학생 점수 : %d",i+1,student[i]);
//		}
//	}
//	
//	public static void print(int num, int[] student) {
//		int max = 0 ; 
//		int sum = 0 ;
//		for(int i = 0; i<num; i++) {
//		if (max < student[i]) {
//			max = student[i];
//		}
//		sum += student[i];
//		}double avg = (double) sum / num ; 
//	System.out.printf("최고 점수: %d", max);
//	System.out.printf("평균 점수: %d", avg);
//	}
//	
//	public static void end() {
//		System.out.println("시스템을 종료합니다");
//		
//	}
//	
//	
//
//	
//	
//	public static void main(String[] args) {
//		while(true) {
//			int n = intro() ;
//			if(n==1) {
//				int num=num();
//			break ;
//			}
//			if(n==2) {
//				score(num());
//			break;	
//			}
//			int[] student = score(num);
//			if(n==3) {
//				list(num(), student );
//			}
//			if(n==4) {
//				print(num,student);
//				
//			}
//		}
//		
//		num();
		
		
		
		
	
