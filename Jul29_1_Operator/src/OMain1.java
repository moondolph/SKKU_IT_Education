import java.util.Scanner;

public class OMain1 {
	public static void main(String[] args) {
		// ����
		// �ڷ��� ������ = ��;
		// = (���Կ�����)
		// A = B
		// ���׿� �ִ� ���� ���׿� �־��. 
		// ������ ���� ���� �� ���
		
		// ��Ģ���� (Scanner + ���) 
		// ���ڴ� 2���� �Է¹��� (x, y)
		// 
		
		Scanner a = new Scanner(System.in);
		System.out.print("x = ");
		int x = a.nextInt();
		
		System.out.print("y = ");
		int y = a.nextInt();
		
		System.out.printf("x+y = %d\n",x+y);
		System.out.printf("x-y = %d\n",x-y);
		System.out.printf("x*y = %d\n",x*y);
		System.out.printf("x/y = %.2f\n",x*1.0/y);
		System.out.printf("x/y = %.2f\n",(double) x/y);
		
	
		// ��Ģ���� : ���������
		int plus = x + y;
		int minus = x - y;
		int multiply = x * y;
		int divide = x / y;
		
		System.out.printf("%d + %d = %d\n",x,y,plus);
		System.out.printf("%d - %d = %d\n",x,y,minus);
		System.out.printf("%d * %d = %d\n",x,y,multiply);
		System.out.printf("%d / %d = %d\n",x,y,divide);
		
		// int / int = int(Java ����) ex) 10 / 4 = 2 (o), 2.5 (x)
		// double / int = double
		// int / double = double
		// double / double = double
		
		double divide2 = (double) x / y; // �� ��ȯ
		System.out.println(divide2);
		
		//������ �Ŀ� ������ �� ���� ��
		int remainder = x % y;
		System.out.println(remainder);
		
		System.out.println("----------------------");
		// �ٽ� �����ε�!!!
		// A = B�� ���ٶ�� �ǹ̰� �ƴ϶�, <A�� B�� �־��!>
		// x = 10, y = 4
		System.out.printf("x�� %d\n", x); // 10
		System.out.printf("y�� %d\n", y); // 4
		x = y;
		System.out.printf("x�� %d\n", x); // 4
		System.out.printf("y�� %d\n", y); // 4
		
		// ���Կ����ڸ� Ȱ��!
		// [ +=, -=, *=, /=, %=]
		// �� ���� 2byte -> �� ���ڶ� �� �ļ�...
		
		x += 1; // x = x + 1;
		System.out.println(x);
		
		x -= 1; // x = x - 1;
		System.out.println(x);
		
		x *= 2; // x = x * 2;
		System.out.println(x);

		x /= 2; // x = x / 2;
		System.out.println(x);
		
		x %= 2; // x = x % 2;
		System.out.println(x);
		
		// �ѹ� �� ���̱�
		// ++, --
		x++; // x += 1; // x = x + 1;
		System.out.println(x);
		
		x--; // x -= 1; // x = x - 1;
		System.out.println(x);
		
		//x**;
		//x//;    ��״� �� ��.
		//x%%;
	}
}
