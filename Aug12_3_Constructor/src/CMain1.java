
public class CMain1 {
	public static void main(String[] args) {
		//�Ź�
		//����Ű Ȩ������
		//�̸� : ???
		//������ : 260
		//���� : 110000
		//�귣�� : ����Ű
		//���� ���
		//----------------
		//�̸� : ???
		//������ : 260
		//���� : 110000
		//�귣�� : ����Ű
		//���� ���
		//----------------
	
		Shoes s1 = new Shoes();
		s1.name = "����ƽ� �ö��̴�Ʈ ���̼�";
		s1.size = 265;
		s1.price = 189000;
		s1.printInfo();
		
		System.out.println("-----------");
		
		Shoes s2 = new Shoes();
		s2.name = "�Ƽ���";
		s2.size = 265;
		s2.price = 59000;
		s2.printInfo();
		
		System.out.println("-----------");
		
		s2.test(s2.name);
		System.out.println("-----------");
		s2.test("zzzz");
		System.out.println("-----------");

		//������ �����ε�
		Shoes s3 = new Shoes("�Ź�", 250, 3000);
		s3.printInfo();

		
		
	}
}
