import java.util.Scanner;

public class Me {
	Scanner k = new Scanner(System.in);
	
	String name = "����" ;
	int age = 20;
	String gender = "��" ;
	String job = "���α׷���";
	
	public void showId() {
		
		System.out.println("---------���� B---------");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�� : " + gender);
		System.out.println("���� : " + job);
		
	}
	
	
	
	
	public int playMe() {
		System.out.print("����(1)/����(2)/��(3) �� ���ڸ� �Է��Ͽ� ���ÿ�: ");
		int m = k.nextInt();
		return m;
	}

	
	
	
	
	
	
	
}
