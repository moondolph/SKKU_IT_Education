import java.util.Random;
import java.util.Scanner;

public class YMain2 {
	// Ȧ¦ ���� ����� !
	//		���� 10���� ��� �ִٰ� !
	//		���� 'Ȧ'�̶�� �ϸ�...
	//		�������� �ƴ��� �����ؼ� �� ����� ������ִ� ���α׷�
	
	public static void main(String[] args) {
//		Random r = new Random();
//		int i = r.nextInt();  // int ���� �ȿ� �ִ� ������ ����
//		int i2 = r.nextInt(5); // 0 ~ 4
//		int i3 = r.nextInt(5) + 1 ; // 1 ~ 5
//		
//		System.out.println(i);
//		System.out.println(i2);
//		System.out.println(i3);
		
		Random r = new Random();
		int i = r.nextInt(10)+1;
		
		Scanner k = new Scanner(System.in);
		
		System.out.println(" Ȧ �Ǵ� ¦�� �Է��Ͻÿ�: " );
		String pick = k.next();
		
		String result = (i % 2 == 1) ? "Ȧ" : "¦" ;
		
		String final = pick == result ? "����" : "����";
		
//		
//		String answer = (pick == result) ? "����" : "����" ;
//		
//		System.out.println(answer);
		
		
		
		// �Է� ���� �غ�
		Scanner keyboard = new Scanner(System.in);
		
		
		// �����ϰ� ������ ���� �غ�
		Random r = new Random();
		
		// ������ ���� �߿��� ������ ���� ������ �̱�
		int coin = r.nextInt(10);
		System.out.println(coin);
		
		
		// ���� ������ Ȧ���̸� 'Ȧ', ¦���� '¦'
		String answer = (coin % 2 == 1) ? "Ȧ" : "¦" ;
		//System.out.println(answer);
		
		// ���� ���� �� �ְ� �Է� 
		System.out.print("Ȧ or ¦ : ");
		String userAns = keyboard.next();
		//System.out.println(userAns);
		
		// ����� �������..!(��ǻ�Ͱ� ���� ����� ���� �Է��� ������ ������)
		String result = (answer.equals(userAns)) ? "����" : "��";          //���ڿ������� ��ȣ�� equals
		System.out.printf("���� ������ %d���̹Ƿ�, %s!", coin, result);
		
	}
}
