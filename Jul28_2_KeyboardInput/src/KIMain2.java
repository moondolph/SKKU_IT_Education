import java.util.Scanner;

public class KIMain2 {
	public static void main(String[] args) {
		//�������� �Է¹޾Ƽ� ���� ���� ����ϱ�!
//		Scanner circle = new Scanner(System.in);
//	
//		System.out.print("�������� �Է��Ͻÿ�:");
//	int r = circle.nextInt();
//		System.out.printf("���� ����:%.2f\n",Math.pow(r, 2)*Math.PI);	
//			
//		
//		
//		// ����, ���� �Է� �޾Ƽ� �簢�� ���� ����ϱ�!
//		Scanner square = new Scanner(System.in);
//		System.out.print("���θ� �Է��Ͻÿ�:");
//		double horizontal = square.nextDouble();
//		System.out.print("���θ� �Է��Ͻÿ�:");
//		double vertical = square.nextDouble();
//		System.out.printf("�簢���� ����: %.2f\n",horizontal * vertical);
//		
		
		
		// �ð�(��)�� �Է� �޾Ƽ�
//		Scanner time = new Scanner(System.in);
//		System.out.print("�ʸ� �Է��Ͻÿ�:");
//		int second = time.nextInt();
//		
//		System.out.printf("������ ȯ���ϸ�: %.4f\n",second / 60);
//		System.out.printf("�ð����� ȯ���ϸ�: %.4f\n",second / 3600);
//		
		// int ������ int = int �̹Ƿ� ���� �� (�Ҽ��� �κ� �� �߸�)
		// ���� 
		Scanner time = new Scanner(System.in);
		System.out.print("�ʸ� �Է��Ͻÿ�:");
		int second = time.nextInt();
		double minute = second / 60;
		double hour = minute / 60;		
		System.out.printf("������ ȯ���ϸ�: %.4f\n",minute);
		System.out.printf("�ð����� ȯ���ϸ�: %.4f\n",hour);
		
	}
}
