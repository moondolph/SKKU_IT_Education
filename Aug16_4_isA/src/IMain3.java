public class IMain3 {
	public static void main(String[] args) {

		
		// ȫ�浿, 17��, �Ǳ�����б�, 1�г� -> ���
		Student s1 = new Student("ȫ�浿", 17, "�Ǳ�����б�", 1); 
		s1.printInfo();
		System.out.println("-----------------------");
		
		// ��浿, 21��, ���հ����б�, 2�г� -> ���
		Student s2 = new Student("��浿", 21, "���հ����б�", 2); 
		s2.printInfo();
		System.out.println("-----------------------");
		
		
		
		
		// ��浿, 22��, ����, �� -> ���
		Army a1 = new Army("��浿", 22, "����","��" ); 
		a1.printInfo();
		
		System.out.println("-----------------------");
		
		
		
		Pen p = new Pen();
		System.out.println("--------");	
		Pen p2 = new Pen("����");
		System.out.println("--------");	
		Pen p3 = new Pen("�𳪹�", 300, "����");
		System.out.println("--------");	
			
		//�̸��� �мǸ���ũ, ������ 1000���� ����ũ   .. ��ü�� ������ּ���.	
		Mask m = new Mask("�мǸ���ũ", 1000);
		
			
		
		}
}
