import java.util.Scanner;

public class FMain5 {
	//���³�.. �濡�� ������ �ϰ� �ִµ�.. => ������ �ɺθ� ���ѿ�...
	public static void makeErrand() {
	  System.out.println("�Ƶ�~");
	  System.out.println("�� ���״ϱ�");
	  System.out.println("���۰���");
	  System.out.println("����̶�");
	  System.out.println("��ġ ���");
	  System.out.println("���� �� ������~");
	  System.out.println("-------------");
	}
	  
	// ������ ���� �̴ּ� !(�� = �Է�)
	public static int takeMoney() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("������ �� �� : ");
		int money = keyboard.nextInt();
		System.out.printf("������ %d���� �̴ּ�!\n", money);
		return money;
		// ����(int)�� ���� ���� main �Լ��� return, ��ȯ�ҰŴϱ�
		// return type�� int�� ����
		// 
	}
	
	// �ɺθ� �߿�...(��� : 3200, ��ġ : 2170, ���� : 1500)
	// ���� �� ������.. ����.. 
	public static void doErrand(int money1) {
		int ramen = 3200; 
		int tuna = 2170;
		int snack = 1500;
		//����ϴ� �Լ�
		//	 ����̶�� �۾��� �Ϸ��� '�޾ƿ� ��'�� �ʿ�
		// �� ����... �Ķ���ͷ� �޾ƿ� ��!
		System.out.printf("�ɺθ��ϸ� %d���� ����...��\n", money1 - (ramen + tuna + snack));
		System.out.println("-----------------");
		
	}
	
	//����� �ϰ�, �ܵ��� �������� ����...
	public static int calculate(int money) {
		int ramen = 3200;
		int tuna = 2170;
		int snack = 1500;
		int bbingddang = 3000;
		
		int restMoney = money - (ramen + tuna + snack+bbingddang);
		return restMoney;
	}
	
	
	
	
	
	public static void main(String[] args) {
		makeErrand();
		int h = takeMoney();
		//System.out.println(money);
		doErrand(h);
		int restMoney = calculate(h);
		System.out.println(restMoney);
		
	}
}	

// �Լ��� ǥ���ϴ� 4���� ���!
// ��? ����ұ�� ?

// ���� ���ϰ�
// ���� �߰߿� ���ϰ�
// ���� ����
// �ٸ������� ����ϱ� ����

// main�Լ��� �ڵ带 �ִ��� ª�� �����ϱ� ���ؼ� 
// ��ɵ��� ��� �Լ���°ɷ� ���!
// ����� ������ ȿ�������� ���!
//  

