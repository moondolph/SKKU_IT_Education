import java.util.Random;

public class You {
	Random r = new Random();

	String name = "�ʴ�" ;
	int age = 41;
	String gender = "��" ;
	String job = "�ٸ���Ÿ";
	
	public void showId() {
		System.out.println("---------���� A---------");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�� : " + gender);
		System.out.println("���� : " + job);
		
	}

	
	public int playYou() {
		int y = r.nextInt(3) + 1;
		System.out.println("'�ʴ�'�� ����(1)/����(2)/��(3) �� �ϳ��� �½��ϴ�.");
		return y ;
		
	}

	
	
	
	
	
	
	
	
}
