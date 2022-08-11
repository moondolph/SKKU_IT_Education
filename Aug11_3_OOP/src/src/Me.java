import java.util.Scanner;

public class Me {
	// 정답을 입으로 말하기
	Scanner mouth = new Scanner(System.in);
	
	public int tellMyAns() {
		System.out.print("정답은 : ");
		int myAns = mouth.nextInt();
		return myAns;
	}
}
