import java.util.Scanner;

public class YMain1 {

	//(3���� ����) ���� �ϳ��� �Է¹޴� �Լ�
	// 3���� ũ�ų� ���� �� -> �ٽ� �Է� ���� �� �ֵ���!
	
	public static int getNum() { 
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("���� : ");
		int num = keyboard.nextInt();
		return (num < 3) ? num : getNum();
	}
	//Ȧ���� �Է� ���� �� �ִ� �Լ�
	// => ¦���� �Է��ϸ� �ٽ� �Է� ���� �� �ֵ���!
	public static int getNum2() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("���� : ");
		int num = keyboard.nextInt();
		return (num % 2 == 1) ? num : getNum2();	
	}
	
	// ������ �Է¹޴� �Լ� => 0 ~ 100
	// => �������� ������ �ƴ϶�� �ٽ� �Է� ���� �� �ֵ���!
	public static int getNum3() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("����(����) 0 ~ 100 : ");
		int num = keyboard.nextInt();
		return (num >= 0 && num <=100) ? num : getNum3() ;
	}

	public static void main(String[] args) {
		int num1 = getNum();
		System.out.println(num1);
		int num2 = getNum2();
		System.out.println(num2);
		int num3 = getNum3();
		System.out.println(num3);
	}		
	
}
