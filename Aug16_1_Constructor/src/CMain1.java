
public class CMain1 {

	public static void main(String[] args) {
		// Ŀ�� 
		// Ŀ�� �̸� / ���� / 
		// �Ƹ޸�ī�� / 3000
		// ��� 
		
		Coffee c1 = new Coffee();
		c1.name = "�Ƹ޸�ī��";
		c1.price = 3000;
		
		c1.printInfo();
		System.out.println("---------");
		
		Coffee c2 = new Coffee("�ƾ�", 3000);
		c2.printInfo();
		
		
		
	}

}
