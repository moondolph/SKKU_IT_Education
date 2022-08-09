// ����� ȣ�� (recursive call)
// �Լ� �ӿ��� �ڱ� �ڽ�(�� �Լ�)�� �� ȣ�� -> �ݺ�

//�Լ��� �θ��� : ���� �۾�

// �ݺ��� : ex) 'for' 
public class FMain7 {
	
	// ��������
	// ������ �ϳ� ������ 
	// 1 + 2 + 3 + 4 + ... +  �� ���ڱ���
	// �� ���� ���� �����ִ� �Լ�
	 
	
	// add(1) = 1
	// add(2) = 3 -> add(1) + 2 -> 1 + 2
	// add(3) = 6 -> add(2) + 3 -> add(1) + 2 + 3
	// add(4) = 10 -> add(3) + 4 -> add(2) + 3 + 4 -> add(1) + 2 + 3 + 4
	public static int add(int x) {
		int answer = (x == 1) ? 1 : (x + add(x - 1));
		return answer;
	}
	
	// ������ �ϳ� ������ factorial �� ���ϴ� �Լ�
	// ex) 6! = 720
	// 1! = 1
	// 2! = 2 => 2 * 1
	// 3! = 6 => 3 * 2 * 1
	 
	public static int factorial(int x) {
		int answer = (x == 1) ? 1 : (x * factorial(x - 1));
		return answer ;
	}
	
	// �Ǻ���ġ ����
	// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
	public static int fibo(int x) {
//		int answer = (x < 3) ? 1 : (fibo(x - 1) + fibo(x - 2));
//		return answer;
		
		
			int answer = (x == 1 || x == 2 ) ? 1 : fibo(x-1)+fibo(x-2) ;  
			
			return answer; 
	}
	
	public static void main(String[] args) {
		int a = add(10);
		System.out.println(a);
		
		int b =factorial(6);
		System.out.println(b);
		
		int c= factorial(5);
		System.out.println(c);
		
		int d = fibo(9);
		System.out.println(d);
	}
}
