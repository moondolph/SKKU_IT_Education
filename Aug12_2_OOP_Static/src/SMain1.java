//����
// 1. ���� ������ �ҽ��� stack ������ �� (��������)
// 2. static ����������� static ������ ��ġ
// 3. JVM�� SMain1.main(...); �� ȣ��
// 4. ����




public class SMain1 {
	public static void main(String[] args) {
		//���� ��ü
		//���� �̸�, �߷�, ����
		//����ϴ� ���

		// ���� main���� ���ڰ�ü�� ���� ����
		// ���� �̸�? -> ��
		// ���� ����? -> ��
		// ���� ����? -> ��
		// ���� ������? -> ����
//		System.out.println(Snack.manufacturer);
		System.out.println("------------");
		
		
		Snack s1 = new Snack();
		s1.name = "��Ϲ���Ĩ";
		s1.weight = 150.3;
		s1.price = 3000;
		s1.printInfo();
		System.out.println("------------");
		
		Snack s2 = new Snack();
		s2.name = "�����۽�";
		s2.weight = 200.1;
		s2.price = 3500;
		s2.printInfo();
		System.out.println("------------");
		
		// �������� ���� �ٲ㺾�ô�.
//		s2.manufacturer = "�ֺ��";
//		s2.printInfo();
//		System.out.println("------------");
		
//		s2.MANUFACTURER = "�ֺ��"; //����!!!
		
		Snack.printTaste();
		
		
	}
}
