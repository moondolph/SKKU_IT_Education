// Java : Perfect ��ü������ (������)
// C++, Python : Hybrid ��ü������ ( ������)

// �ǻ�Ȱ�� �������� -> ���Ⱑ ������ �� -> ���������� �������� ! 


//main()�ִ� Ŭ���� : XXXMain
public class OMain2 {
	public static void main(String[] args) {
		//������ Java�� ǥ���غ��� -> ǥ���ϰ� �������� �׻�! Ŭ������! ����! ������!
		// ������ȣ / ���� /  ����ȸ�� / �����̸� / ������ => ���
		// int, double, String, ... XXX : ?!, �����ϱ� ��ƴ�...
		// �ּ��� �� �ʿ䰡 ���ٴ°� ���� ! -> �� ǥ���ϰ��� �ϴ��� �� �� �ֱ� ������ !
		// b1 : ��ü, instance ��� �θ�
		// 
		
		
		Bus b1 = new Bus();   //���� �Ѵ밡 �ϼ� !
		b1.no = 1234;
		b1.brand = "��Ʋũ����";
		b1.company = "benz";
		b1.driver = "Hamilton";
		b1.startPoint = "Seoul";
		
//		System.out.println(b1.no);
//		System.out.println(b1.brand);
//		System.out.println(b1.company);
//		System.out.println(b1.driver);
//		System.out.println(b1.startPoint);
		b1.printInfo();
		b1.go();
		
		
		
		System.out.println("------------------");
		//�ڵ���
		//	�𵨸�
		//	������
		//  ����
		//  ������ ���
		//  ��ȭ���� �� - �츮�� ~ ��� 
		Phone p = new Phone();
		System.out.println(p);  // �⺻���� �ƴ� �͵��� �� ������ !!
		p.printInfo();
		
		System.out.println("--------");
		
		p.model = "Galaxy s10";
		p.company = "Samsung";
		p.price = 10000 ;
		p.printInfo();
		p.ringBell();
		System.out.println("--------");
		
		// p�� �Ȱ��� �Ӽ� ���� ���� p2 ���� - �Ұ��� !!!
		// ������ new�� �����ؾ� !!!!!
		
		Phone p2 = p; //p�� ������ �ϳ� �� �߰��� ��Ȳ!
		System.out.println(p2); // �������� ����. //  �ڵ��� �ϳ��� 2���� �����ϰ� �ִ� ��Ȳ! 
		p2.price = 150000;
		p2.printInfo();
		System.out.println("--------");
		p.printInfo(); // ������ p2 ������ 150000���� ���� -> p2 = p�̶� ����.
		System.out.println("--------");

	
	}
}
