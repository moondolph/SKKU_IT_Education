import java.util.Random;
import java.util.Scanner;

// Up & Down 게임 (함수 사용 0)
// 컴퓨터 : 1 ~ 100 사이의 숫자를 뽑음 (ex : 34)
// 유저가 입력
//	  1트 : 50 -> down !
//	  2트 : 20 -> up !
//	  ...
//    10트 : 34 -> 정답!

public class YMain1 {
	// 컴퓨터가 1 ~ 100 사이의 숫자를 하나 뽑아주는 함수
	public static int getNumber() {
		Random r = new Random();
		int i = r.nextInt(100) + 1;
		return i;
	}
	// 유저가 답을 입력할 수 있는 함수
	public static int getUserAns() {
		Scanner k = new Scanner(System.in);
		System.out.print("정답은? : ");
		int answer = k.nextInt();
		if (answer < 1) {
			System.out.println("정답은 1 이상이어야 합니다.");
		}else if (answer >100) {
			System.out.println("정답은 100 이하이어야 합니다.");
		}
		return (answer >= 1 && answer <=100) ? answer : getUserAns();
	}
	
	// 정답을 한 번 입력했을때 정답인지 아닌지 확인 + 반복문을 깰지 말지 전달됨
	public static boolean checkAnswer(int number, int answer) {
		if(number==answer) {
			System.out.println("정답!");
//			return true; // 정답일때 true값을 리턴하면서 이 함수가 종료되게
		}else if(number> answer) {
			System.out.println("Up !");
//			return false; // 정답이 아닐때 false값을 리턴하면서 게임을 계속 진행하도록
		}else{
			System.out.println("Down !");
//			return false;
		}
		return(number == answer); // 이 조건에 맞을때 true값을 리턴하고,
								  // 조건에 맞지 않으면 false값을 리턴
		
	}
	
	// 정답을 맞출때까지 반복하는 함수
	public static void printResult(int number, int answer) {
		int turn = 0;
		while (true) {
			turn++;
			answer = getUserAns();
			if(checkAnswer(number,answer)) {
				System.out.printf("%d번 만에 정답!\n",turn);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		int number = getNumber();
		int answer = 0;
		printResult(number, answer);
		
		
	}
	
	
	
//	public static void introduce() {
//		System.out.println("<<<<Up & Down 게임!!>>>>");
//	}
//	
//	
//	public static int computer() {
//		System.out.println("컴퓨터가 번호(1~100)중 하나를 뽑았습니다");
//		Random r = new Random();
//		int computer = r.nextInt(100) + 1;
//		return computer;
//	}
//
//	public static int user() {
//		System.out.println("유저의 차례입니다.");
//		System.out.print("컴퓨터가 고른 번호를 맞춰보세요: ");
//		Scanner k = new Scanner(System.in);
//		int user = k.nextInt();
//		return user;
//
//	}
//
//	public static void result(int computer, int user) {
//		Scanner k = new Scanner(System.in);
//		for (int i = 1;; i++) {
//			if (computer > user) {
//				System.out.printf("%dtry : %d --> UP!\n", i, user);
//				System.out.print("다시 입력하세요: ");
//				user = k.nextInt();
//			} else if (computer < user) {
//				System.out.printf("%dtry : %d --> Down!\n", i, user);
//				System.out.print("다시 입력하세요: ");
//				user = k.nextInt();
//			} else {
//				System.out.printf("%dtry : %d --> 정답!\n", i, user);
//				System.out.println("게임을 종료합니다!!");
//				break;
//			}
//		}
//	}
//
//	public static void main(String[] args) {
//		introduce();
//		int computer=computer();
//		int user=user();
//		result(computer,user);
//	}
//	
	
	
	
	
}
