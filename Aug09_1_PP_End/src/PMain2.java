import java.util.Scanner;

// main�Լ����� ����
// 1�� �Է��ϸ� �л� �� ���� �Է� ���� �� �ְ�
// 2�� �Է��ϸ� �� �л����� ������ �Է� ���� �� �ְ� (���� ���� ��� x)
// 3�� �Է��ϸ� �л����� ��������Ʈ ��� �� �� �ְ�(ex : 1�� �л� ���� : 50�� )
// 4�� �Է��ϸ� �ְ������� ��������� �м��ؼ� ��� �� �� �ְ�
// 5�� �Է��ϸ� ���α׷� ����

public class PMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int selectNo = 0;
		int studentNum = 0;
		int[] scores = null; // �迭�� �⺻�� = null
		a: while (true) {
			System.out.println("==================================================");
			System.out.println("1. �л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����");
			System.out.println("==================================================");
			System.out.print("����> ");
			selectNo = k.nextInt();

			switch (selectNo) {
			case 1:
				System.out.print("�л� �� : ");
				studentNum = k.nextInt();
				scores = new int[studentNum];
				break;
			case 2:
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("%d�� �л� ���� �Է� : ", i + 1);
					scores[i] = k.nextInt(); // �� �ε������� �� �ֱ�
				}
				break;
			case 3:
				int index = 1;
				for (int i : scores) {
					System.out.printf("%d�� �л� ���� : %d��\n", index++, i);
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
				System.out.printf("�ְ� ���� : %d��\n", max);
				System.out.printf("��� ���� : %.2f��\n", avg);
				break;
			case 5:
				System.out.println("�����մϴ�.");
				System.out.println("===========================================");
				break a;
			}

		}

		// Scanner k = new Scanner(System.in);
//		
//		while(true) {
//		System.out.print("��ȣ�� �Է��ϼ���: ");
//		int a = k.nextInt();
//		int[] student = null ;
//		int studentNum = 0;
//		if (a==1) {
//			System.out.print("�л� ��: ");
//			studentNum = k.nextInt();
//			
//		
//		}
//		if (a==2) { 
//				for(int i=0;i<studentNum;i++) {
//					System.out.printf("%d��° �л��� ���� : ", i);
//					int point = k.nextInt();
//					student[i] = point;	
//			}	
//		}	
//					
//		if(a==3) {	for(int j=0; j<studentNum; j++) 
//		{
//		System.out.printf("%d�� �л� ����: %d��",j,student[j]) ;
//			}
//		}
//		
//		if(a==4) { int max = student[0]; double plus = 0;
//		for(int m=0;m<studentNum;m++) { if(max<student[m]) 
//		max = student[m];
//		plus += student[m] ;
//		}
//							
//		System.out.printf("�ְ����� : %d",max);
//		System.out.printf("������� : %.1d",plus/studentNum);
//						}
//		if(a==5) {
//			System.out.println("���α׷��� �����մϴ�.");
//			break;
//		}
//						
//				
//			}
	}

}
