// Coder : ������
// Programmer : Coder + ���� ***

// OOD (Object Oriented Design) - ��ü ���� ������
// 		�ǻ�Ȱ�� ������ 
//		

public class OMain1 {
	public static void main(String[] args) {
	   // �ǻ� (�̸�, ����)
		Doctor d = new Doctor();
		d.name = "Mike";
		d.age = 46 ;
		
		d.printDoctor();
		
		
		System.out.println("----------------------------");
	   // �մ� (�̸�, ����)
		Guest g = new Guest();
		g.name = "Joy";
		g.age = 31;
		g.showPatient();

		
		
		//BMI�˻�
		d.start(g);
		
	}
}
