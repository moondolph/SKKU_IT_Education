
public class FMain1 {

	//���� �ΰ��� ������, �� �߿� �� ū ���ڸ� ������ִ� �Լ�
	public static void printBigger(int a, int b) {
		int bigNum = (a > b) ? a : b;
		System.out.println(bigNum);
	}
	
	// �Ǽ� �ΰ��� ������, �� �߿� ū ���ڸ� �����ִ� �Լ�
	public static double getBigger(double a, double b) {
		double bigNum = (a > b) ? a : b ;		
		return bigNum;
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		printBigger(3, 6);
		getBigger(1.2, 10.1);
		double bigNum = getBigger(1.3, 4.5);
		System.out.println(bigNum);
		Thread.sleep((long) bigNum);
	}
}
