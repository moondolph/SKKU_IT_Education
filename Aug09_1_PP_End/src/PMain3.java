import java.util.Scanner;

public class PMain3 {
	// �Լ��� ���� ����
	// 1�� �Է��ϸ� �л� �� ���� �Է� ���� �� �ְ�
	// 2�� �Է��ϸ� �� �л����� ������ �Է� ���� �� �ְ� (���� ���� ��� x)
	// 3�� �Է��ϸ� �л����� ��������Ʈ ��� �� �� �ְ�(ex : 1�� �л� ���� : 50�� )
	// 4�� �Է��ϸ� �ְ������� ��������� �м��ؼ� ��� �� �� �ְ�
	// 5�� �Է��ϸ� ���α׷� ����

	// ù ���� �κ� 
	public static void start() {
		System.out.println("==================================================");
		System.out.println("1. �л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����");
		System.out.println("==================================================");
		
	}
	
	// ������ �޴� ��ȣ �޾ƿ���
	public static int getSelectNo() {
		Scanner k = new Scanner(System.in);
		System.out.print("����> ");
		int selectNo = k.nextInt();
		return selectNo;
	}
	
	// �л� �� �� �޾ƿ���
	public static int getStudentNum() {
		Scanner k = new Scanner(System.in);
		System.out.print("�л� �� : ");
		int studentNum = k.nextInt();
		return studentNum;
	}
	
	// �л� ������ ���� �޾ƿ���
	public static int getScore() {
		Scanner k = new Scanner(System.in);
		int score = k.nextInt();
		if (score > 100) {
			System.out.println("������ 100���� ���� �� �����ϴ�.");
			System.out.print("�ٽ� �Է� : ");
		} else if (score < 0) {
			System.out.println("������ 0������ ���� �� �����ϴ�.");
			System.out.println("�ٽ� �Է� : ");
		}
		return (score >= 0 && score <= 100) ? score : getScore() ;
	}
	
	// �л����� ���� �Է��ϱ�
	public static int[] getScore(int[] scores) {
		for ( int i = 0; i < scores.length; i++) {
			System.out.printf("%d�� �л� ���� �Է� : ",i+1);
			scores[i] = getScore();
		}
		return scores;
	}
	// �л����� ���� ����ϱ�
	public static void printScore(int[] scores) {
		int index = 1;
		for (int i : scores) {
			System.out.printf("%d�� �л� ���� : %d��\n", index++, i);
		}
	}
	
	
	// �ְ� ����, ��� ���� ����ϱ�
		public static void printStats(int[] scores) {
	int sum = 0;
	int max = 0;
	double avg = 0;
	for (int i : scores) {
		sum += i;
		max = (max < i)? i : max;
	 }
	avg = (double) sum / scores.length;
	System.out.printf("�ְ� ���� : %d��\n", max);
	System.out.printf("��� ���� : %.2f��\n", avg);
  }
	
	// ����޽���
		public static void end() {
			System.out.println("�����մϴ�.");
			System.out.println("====================================");
		}
		
	// ��ü���� ���α׷��� ���ư� ���
	public static void activate() {
		int selectNo = 0;
		int studentNum = 0;
		int[] scores = null;
		while (true) {
			start();
			selectNo = getSelectNo();
			if(selectNo ==1) {
				studentNum = getStudentNum();
				scores = new int[studentNum]; // �л��� ����ŭ �迭�� ũ�⸦ ����
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
				System.out.println("�Է��� �߸��Ǿ����ϴ�.");
				System.out.println("�ٽ� �Է��ϼ���.");
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
//		System.out.println("1. �л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����");
//		System.out.println("==================================================");
//		System.out.print("����> ");
//		int n = k.nextInt();
//		
//		return n ;
//	}
//	
//	
//	
//	public static int num() {
//		System.out.print("�л� �� : ");
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
//			System.out.printf("%d�� �л� ���� : %d",i+1,student[i]);
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
//	System.out.printf("�ְ� ����: %d", max);
//	System.out.printf("��� ����: %d", avg);
//	}
//	
//	public static void end() {
//		System.out.println("�ý����� �����մϴ�");
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
		
		
		
		
	
