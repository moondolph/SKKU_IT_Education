// �˰����� �ô� x -> ���������� �ô� O

// �������� ���α׷��� (Procedural Programming)
//	 ������� �� ���α׷����ؼ� ����� �� ���� !
//	 ���� �ϳ� �� ����, ȿ�������� �ڵ� ®�� !
//   ���ǹ�, �ݺ���, ...
//   ���� : ó���ӵ�, ����ӵ��� ������.

// ��ü���� ���α׷��� (Object - Oriented programming)
//	  �ǻ�Ȱ�� ǥ��. �������� ! (�츮�� ��� �ִ� ������ �𵨸�)
//    �ҽ� ���Ⱑ �� ����	
//	  ���������� ����
//	  ���� : �ڵ��� ���뼺, ���������� ����, ��Ը� ������Ʈ�� ����
//	  
public class OMain1 {
	public static void main(String[] args) {

		// �������� �ִ� �ǹ� 1������ ī�䰡 �ϳ� �ִµ�
		// �� ī���� ������ ǥ��...

		// ī�� �̸��� �ҷγ�
		String name = "�ҷγ�";
		// ī�� ��ġ�� �ǹ� 1��
		String location = "�ǹ� 1��";
		// �Ÿ��� 61.7m
		double distance = 61.7;
		// ���
		System.out.println("<<<ī�� ����>>>");
		System.out.println("name");
		System.out.println("location");
		System.out.println("distance");

		System.out.println("----------------");
		// OOP�� �ҷγ��� ǥ��
		// ��ü(Object) : �ǻ�Ȱ�� �����ϴ� ��~~~~~~~~~�� ��! ( = �ν��Ͻ� (Instance))
		// �ؾ�� ������� �ؾ Ʋ�� �ʿ�!
		// ��ü�� ������� 'Class'��� ���� �ʿ� !
		// ��ü�� ����ؼ� �ϳ��� �ϼ�ǰ�� ������ ���α׷��� �����
		// => ��ü���� ���α׷���
		// => �����δ� Class�� ��û ���� �� !
		

		Cafe c = new Cafe(); // ���ο� ī�� �ϳ� !
		c.name = "�ҷγ�";
		c.location = "�ǹ� 1��";
		c.distance = 61.7;
		System.out.println(c.name);
		System.out.println(c.location);
		System.out.println(c.distance);
	}
}