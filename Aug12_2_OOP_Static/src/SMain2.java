// ����
//		���� 2���� ������ �� ���� ����ϴ� ���
public class SMain2 {
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		c.sum(10, 20); 			// static O
		c.sum(10, 20, 30);		// static x
	///////////////////////////////////////////
		
		
		Calculator.sum(30, 50) ;     // static O -> �޸𸮸� �� ���� �ذ� (��������)
//		Calculator.sum(10, 30, 60);  // static X 
		
		// ���� �ƶ����� Java�� ���� Ŭ���� �� �ϳ��� Math 
		// �̰� ���� ��ü�� ������ �ʰ� ����� ���!
		System.out.println(Math.PI);
		double s = Math.sqrt(10);
		System.out.println(s);
		
	}
}
