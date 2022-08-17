//��ü���� ����
// 	  A has a B : ��� has a �ڵ���
// 	  A is a B : �� is a ����

// A has a B : ���԰���

public class HMain1 {
	public static void main(String[] args) {
		// �̸��� Kim Andrew, ����, �ڵ��� ��ȣ�� 010-1234-5678�� ���
		// ���
		Person p = new Person("Kim Andrew", "����", "010-1234-5678");
		p.printInfo();
		System.out.println("-------------");
		
		// �Ǳ�����, ����, 032-1222-3444, Kim Andrew�� �Ĵ�
		// ���(�Ĵ������� ��������)
		
		Restaurant res = new Restaurant("�Ǳ�����","����","032-1222-3444",p);
		res.printInfo();
		System.out.println("---------------");
		
		// �������, 22000��, �Ǳ��������� �Ĵ� �޴�
		// �� �޴��� ���� ��ü ������ ���
		
		Menu menu1 = new Menu("�������", 22000, res);
		menu1.printInfo();
		
		
		System.out.println("---------------");

		// ����Ұ��, 25000��, �Ǳ��������� �Ĵ� �޴�
		// �� �޴��� ���� ��ü ������ ���
		
		Menu menu2 = new Menu("����Ұ��", 25000, res);
		menu2.printInfo();
		
		System.out.println("---------------");
		
		//����, 5000��, ����Ұ�⸦ ���� ����
		//���õ� ��ü ������ ���
		Dish d = new Dish("����", 5000, menu2);
		d.printInfo();
		
		//��������, ���ı�, ���踦 ������ ����
		//���õ� ��ü ������ ���
		Market market = new Market("��������", "���ı�", d);
		market.printInfo();
		System.out.println("---------------");
		
		
		
		//������, ���������� �����ϴ� ����
		//���õ� ��ü ������ ��� 
		Merchant mer = new Merchant("������", market);
		mer.printInfo();
		System.out.println("----------------");
		
		
		
		// �������� �̸��� ���
		System.out.println(mer.name);	
		System.out.println("----------------");
		
		// �������� �����ϴ� ���� ������ ��ü ���
		mer.ma.printInfo();
		System.out.println("---------------");
		
		// �������� �����ϴ� ������ ���? ���
		System.out.println(mer.ma.location);
		System.out.println("---------------");
		
		// �������� �����ϴ� ���忡�� �� ���� ��ü ����
		mer.ma.d.printInfo();
		System.out.println("---------------");
		
		// �������� �����ϴ� ���忡�� �� ���� ����
		System.out.println(mer.ma.d.price);
		System.out.println("---------------");

		//�������� �����ϴ� ���忡�� �� ���ÿ� ��� �޴��� ����
		mer.ma.d.m.printInfo();
		System.out.println("---------------");
		
		//�������� �����ϴ� ���忡�� �� ���ÿ� ��� �޴� ����
		System.out.println(mer.ma.d.price);
		System.out.println("---------------");
		
		//�������� �����ϴ� ���忡�� �� ���ÿ� ��� �޴��� �� �Ĵ� ����ó
		System.out.println(mer.ma.d.m.where.callNum);
		System.out.println("---------------");
		
		//�������� �����ϴ� ���忡�� �� ���ÿ� ��� �޴��� �� �Ĵ� ���� ����ó
		System.out.println(mer.ma.d.m.where.owner.phoneNum);
		System.out.println("---------------");
		
		//������̸� �Ĵ� ��� ����ó
		System.out.println(menu1.where.owner.phoneNum);
		System.out.println("---------------");
		
		
		
	}
}
