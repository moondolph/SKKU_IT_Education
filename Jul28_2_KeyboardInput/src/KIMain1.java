import java.util.Scanner;

public class KIMain1 {
	public static void main(String[] args) throws InterruptedException {
		// Scanner : Java�� ����Ǿ��ִ� ��� �� �ϳ� !
		// �� ����� ����ϱ� ���ؼ� 'Import'��� ���� ����
		// �� Scanner��°� ����Ϸ��� ������ �ϳ� �ʿ��ѵ�...
		
		// new ~~~ : ��ü
		
		// Scanner�� ȭ��(��Ŭ������ �ܼ�â)���κ��� �����͸� �Է� �޴� ���
		
		Scanner keyboard = new Scanner(System.in);
		
		// �̸��� �ܼ�â�� ���
		System.out.print("�̸� : ");
		String name = keyboard.next();
		System.out.println(name);
		
		// Ű, ������, �Ź߻�����, ���డ�� ���� ��, �����ϴ� ����, ��� ������ ����
		
		
		System.out.print("Ű: ");
		double height = keyboard.nextDouble();
		System.out.printf("%.1fcm\n",height);
		
		System.out.print("������: ");
		double weight = keyboard.nextDouble();
		System.out.printf("%.1fkg\n",weight);
		
		System.out.print("�Ź߻�����: ");
		int shoesSize = keyboard.nextInt();
		System.out.printf("%dmm\n",shoesSize);
		
		System.out.print("���డ�� ���� ��: ");
		String place = keyboard.next();
		System.out.println(place);
		
		System.out.print("�����ϴ� ����: ");
		int likeNum = keyboard.nextInt();
		System.out.println(likeNum);
		
		System.out.print("������?: true �Ǵ� false�� �Է��Ͻÿ�.");
		boolean play = keyboard.nextBoolean();
		System.out.println(play);
		
		// bat ���� ���� =>
		// '���� ������ �ƹ��ų� �Է��ϼ��� : '		
		// ���� �Է��ؼ� ���� ġ�� 1�ʸ��� .�� 3�� �����鼭 ����Ǵ�!
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.print("���� ������ �ƹ��ų� �Է��ϼ��� : ");
		String quit = keyboard.next();
		keyboard.close();
		
		
		Thread.sleep(1000);
		System.out.print(".");
		
		Thread.sleep(1000);

		System.out.print(".");

		Thread.sleep(1000);
		
		System.out.println(".");
		
		Thread.sleep(1000);
		
		System.out.print("���α׷��� �����մϴ�");
		
		Thread.sleep(500);				

	}
}
