import java.util.Random;

public class FMain2 {
	// ������ ������ '���'�ϴ� �Լ�!
	public static void red() {
		Random r = new Random(); // ������ ������ ���� �غ� !
		int i = r.nextInt();
		System.out.println(i);
	}
	
	//������ ������ '����'�ϴ�(���ϴ�) �Լ� ! => ������ '����'�ϴ� ���� ��ǥ!
	public static int blue() {
		Random r = new Random();
		int i = r. nextInt();
		return i ; // i�� �ִ� ���� ���� ����� ����
				   // �� �Լ��� ����
	}
	//������ �ϳ� ������
	//Ȧ������ ¦������ ����ϴ� �Լ�
	public static void yellow(int a) {
	String result = (a % 2 == 1) ? "Ȧ��" : "¦��" ;
	System.out.printf("%d�� %s!\n", a, result);
	}
	
	// ������ �� �� �־��� �� 
	// �� ���ڰ� ũ�� '��', �� ���ڰ� ũ�ų� ���ٸ� '��' ���ڿ��� �����ϴ� �Լ�
	
	public static String purple(int a, int b) {
		String result = (a > b)? "��" : "��";
		return result ;
	}
	
	//JVM -> main �Լ��� �ڵ����� ȣ��
	public static void main(String[] args) {
		red();
		
		//blue()�� ���ؼ� ������ ���ڸ� i��� �׸��� ��Ƽ� �ֿܼ� ���
		int i = blue();
		System.out.println(i);
		System.out.println("==============");
		
		//yellow()�� ���ؼ� ¦������ Ȧ������ �ֿܼ� ���
		yellow(i);
		yellow(5);
		yellow(8);
		System.out.println("==============");
		
		//purple()�� ���ؼ� 
		String ss = purple(20,30);
		System.out.println(ss);
		System.out.println("==============");
		
		//���ɸ޴� (2���� �� �ϳ�)
		//���� �Լ��� �̿��ؼ�...
		//������ ���� 2���� �̾Ƽ�
		//���� ������ ũ�� '�ʹ�', �ƴϸ� '¥���'�� ���
		System.out.println("�԰� ���� ���� �޴��� ���ڿ� �ʹ��̴�.");
		int a = blue();
		int b = blue();
		System.out.println(a);
		System.out.println(b);
		
		String sss = purple(a, b);
		String menu = (sss == "��") ? "����" : "�ʹ�";  // ���ڿ� �񱳴� == ���� sss.equals("��") 
		
		System.out.printf("���� %s�� ����Ѵ�.", menu);
			
	}

}
