import java.util.Scanner;

public class YMain2 {
	public static void main(String[] args) {
		
		//����, ����, ���� ������ �Է� �޾Ƽ� ���
		// ������ ��ձ���
		
		Scanner a = new Scanner(System.in);
		System.out.print("���� ������ �Է��Ͻÿ� : ");
		int korean = a.nextInt();
		
		System.out.print("���� ������ �Է��Ͻÿ� : ");
		int math = a.nextInt();
		
		System.out.print("���� ������ �Է��Ͻÿ� : ");
		int english = a.nextInt();
				
		System.out.printf("����:%.1d\n",korean);
		System.out.printf("����:%.1d\n",math);
		System.out.printf("����:%.1d\n",english);
		System.out.printf("����:%.1d\n",korean + math + english);
		System.out.printf("���:%.1f\n", (double) (korean + math + english)/3);

		//int / int = int�� ���´�.�Ҽ����� ©��
		//(����ȯ) 
	}
}
