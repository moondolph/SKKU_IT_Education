
public class FMain1 {

	//정수 두개를 넣으면, 그 중에 더 큰 숫자를 출력해주는 함수
	public static void printBigger(int a, int b) {
		int bigNum = (a > b) ? a : b;
		System.out.println(bigNum);
	}
	
	// 실수 두개를 넣으면, 그 중에 큰 숫자를 구해주는 함수
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
