import java.util.Scanner;

public class YMain1 {
	public static void main(String[] args) {
	// Ű, �����Ը� �Է� �޾Ƽ� -> �񸸵� �˻� ���α׷�
		
	// ǥ��ü�� = (Ű - 100) * 0.9
	// �񸸵� = (���� ü�� / ǥ��ü��) * 100
	// �񸸵��� 120�� ������ ��, �ƴϸ� �� �� ������ ���
	// �ƹ� Ű�� �Է����� �� ���α׷��� ����ǰ�!
		
	Scanner k = new Scanner(System.in);
	System.out.print("Ű�� �Է��ϼ���: ");
	double height = k.nextDouble();
	
	System.out.print("�����Ը� �Է��ϼ���: ");
	double weight = k.nextDouble();
	
	double stdWeight = (height - 100) * 0.9;
	double obesity_rate = (weight / stdWeight) * 100;
	
	String obesity = obesity_rate > 120 ? "��" : "�� ��";
	
	System.out.printf("����� Ű�� %.1fcm, �����԰� %.1fkg���� " + "�񸸵��� %.1f�� %s�Դϴ�.\n", height, weight, obesity_rate, obesity);
	System.out.println("�ƹ� Ű�� �Է� �ϸ� ���α׷��� ����˴ϴ�");
	String bye = k.next();
	System.out.println("���α׷��� �����մϴ�.");
	System.out.print("��? �Ӿ��� ? : ");
	String realBye = k.next();
	System.out.println("������ ��¥ �ȳ�!!!");
	System.exit(0); 
	
	
		
	// 	���� ������ : 
	//				������ ������ ���� ������ �� ���
	//				if������ ��ü�� ����������, ������ �����
	//				(���ǽ� ? ������ ������ �� �� �� : ���� �Ҽ����� �� ��
	//
		
	}
	
}
