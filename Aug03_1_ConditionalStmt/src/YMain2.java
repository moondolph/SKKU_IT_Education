import java.util.Scanner;

// ���� 2���� �Է¹޾Ƽ� (������ �Լ���)
// �� ���� 2���� �������� ¦���� ��� ����, �ƴϸ� ���� ���Է�
public class YMain2 {

	public static int getNum() {
		
		Scanner k = new Scanner(System.in);
		
		System.out.print("ù��° ������ �Է��ϼ���: ");
		int a = k.nextInt();
		return a ;
		
	}

	public static int getNum2() {
		

		Scanner k = new Scanner(System.in);
		System.out.print("�ι�° ������ �Է��ϼ���: ");
		int b = k.nextInt();
		return b ;
		
	}
		
	//������ ����ؼ� ����� ������ �Լ�
	
	public static int getResult(int a, int b) {
		int sum = a + b ;
//		return (sum % 2 == 0) ? sum : getResult(a, b);  // ���ϴ� ���� ������ ������ 
													    // ���ѷ����� ���ư�
													// => ó�� Ȧ���� �Է��� ���� ��� ����!
		return (sum % 2 == 0) ? sum : getResult(getNum(), getNum2());
	}
	
	
	public static void main(String[] args) {
		int a = getNum();
		int b = getNum2();
//		System.out.println(a);
//		System.out.println(b);
		int sum = getResult(a,b);
		System.out.println(sum);
	
	}
	


}
