import java.util.Random;
import java.util.Scanner;

public class PMain1 {
	public static void main(String[] args) {
		// 10���� ���ڸ� �������� �̾Ƽ� ( 1 ~ 100 )
		// �迭�� ��� -> ��� !
		int[] num = new int[10];
		Random r = new Random();
		
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(100) + 1;
		}
		for (int i :qo��) {
			System.out.println(i + " ");
		}
		System.out.println();
		System.out.println("------------");
		//10���� ���ڸ� ���� �Է��ؼ�
		//�迭�� ��� -> ���
		
		int[] num2 = new int[10];
		Scanner k = new Scanner(System.in);
		
		for (int i = 0; i<num2.length; i++) {
			System.out.printf("%d��° ����? : ", i + 1);
			num2[i] = k.nextInt();
			 
		}
		for (int i : num2) {
			System.out.println(i + " ");
		}
		System.out.println();
		System.out.println("--------------");
		
		// �迭 num(Random)���� �޾ƿ� �ִ밪, �ּҰ� ���ϱ� -> ���
		int max = num[0];	// �迭�� 0��° ���ڰ� �ִ밪�̶�� ����
		int min = num[0];	// �迭�� 0��° ���ڰ� �ּҰ��̶�� ����
		for (int i = 0; i < num.length; i++) {
			if (min > num[i]) { // num[i]�� ���ڰ� �� �۴ٸ� 
				min = num[i];   // num[i]�� ���ڰ��� min�� �Ű� ���
			} else if (max < num[i]) { // num[i]�� ���ڰ� �� ũ�ٸ� 
				max = num[i];  	// num[i]�� ���ڰ��� max�� �Ű� ���
			}
		}
		System.out.println("�ּҰ� : " + min);
		System.out.println("�ִ밪 : " + max);
	}
}
	
		
		
		
//		int g = 0;
//		for(int i = 0; i<num.length-1; i++) {
//			if(num[i]>num[i+1]){
//				g=num[i];
//				num[i]=num[i+1];
//				num[i+1]=g;
//			}
//		}System.out.printf("�ִ밪 : %d", num[9]);
//		for(int i = num.length-1; i>num.length-1; i--) {
//			if(num[i]>num[i+1]){
//				g=num[i];
//				num[i]=num[i+1];
//				num[i+1]=g;
//			}

		
	
	
//		Random r = new Random();
//		
//		for(int i = 0; i<10; i++) {
//		int num = r.nextInt(100) + 1;
//		System.out.println(num);
		
		
	

