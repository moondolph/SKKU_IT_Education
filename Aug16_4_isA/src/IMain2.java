// A is a B : ��Ӱ���
// ���θ� - ��ǰ�� ���� ������ �Խ��ϰ� ����

public class IMain2 {
	public static void main(String[] args) {
		//�Ź� (�̸�, ����, ������)
		//���
		Shoes s = new Shoes("������",3000,250);
		s.printInfo();
		System.out.println("-----------------");
		
		
		
		//��ǻ�� (�̸�, ����, cpu, ram, hdd)
		//���
		Computer c = new Computer("��ǻ��", 500000, "I9-1234", 16,500);
		c.printInfo();
		System.out.println("-----------------");
		
		
		//��Ʈ�� (�̸�, ����, cpu, hdd, ����, ���͸� ���ӽð�)
		//���
		
		Laptop l = new Laptop("��Ʈ��", 800000,"i5-1234", 16, 500, 2.3, 8.5);
		l.printInfo();
		System.out.println("-----------------");
		
		
		
	}
}
