import java.util.Scanner;

public class KIMain1 {
	public static void main(String[] args) throws InterruptedException {
		// Scanner : Java에 내장되어있는 기능 중 하나 !
		// 이 기능을 사용하기 위해서 'Import'라는 것이 사용됨
		// 이 Scanner라는걸 사용하려면 조건이 하나 필요한데...
		
		// new ~~~ : 객체
		
		// Scanner는 화면(이클립스의 콘솔창)으로부터 데이터를 입력 받는 기능
		
		Scanner keyboard = new Scanner(System.in);
		
		// 이름을 콘솔창에 출력
		System.out.print("이름 : ");
		String name = keyboard.next();
		System.out.println(name);
		
		// 키, 몸무게, 신발사이즈, 여행가고 싶은 곳, 좋아하는 숫자, 놀고 싶은지 유무
		
		
		System.out.print("키: ");
		double height = keyboard.nextDouble();
		System.out.printf("%.1fcm\n",height);
		
		System.out.print("몸무게: ");
		double weight = keyboard.nextDouble();
		System.out.printf("%.1fkg\n",weight);
		
		System.out.print("신발사이즈: ");
		int shoesSize = keyboard.nextInt();
		System.out.printf("%dmm\n",shoesSize);
		
		System.out.print("여행가고 싶은 곳: ");
		String place = keyboard.next();
		System.out.println(place);
		
		System.out.print("좋아하는 숫자: ");
		int likeNum = keyboard.nextInt();
		System.out.println(likeNum);
		
		System.out.print("놀고싶음?: true 또는 false를 입력하시오.");
		boolean play = keyboard.nextBoolean();
		System.out.println(play);
		
		// bat 파일 생성 =>
		// '끄고 싶으면 아무거나 입력하세요 : '		
		// 뭔가 입력해서 엔터 치면 1초마다 .이 3번 나오면서 종료되는!
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.print("끄고 싶으면 아무거나 입력하세요 : ");
		String quit = keyboard.next();
		keyboard.close();
		
		
		Thread.sleep(1000);
		System.out.print(".");
		
		Thread.sleep(1000);

		System.out.print(".");

		Thread.sleep(1000);
		
		System.out.println(".");
		
		Thread.sleep(1000);
		
		System.out.print("프로그램을 종료합니다");
		
		Thread.sleep(500);				

	}
}
