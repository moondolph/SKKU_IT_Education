import java.util.Scanner;

public class User {
	Scanner mouth = new Scanner(System.in);
	
	public int answerHowManyCoin() {
		return mouth.nextInt();
	}
	
	public String answerHJ() {
		return mouth.next();
	}
}	
	
	
	
	
	
	
	
	
	
//	Scanner k = new Scanner(System.in);
////유저가 답하고(동전개수)
//	public int answerCoin() {
//		System.out.println("음.....");
//		System.out.print("동전 개수는 : ");
//		int answerCoin = k.nextInt();
//		return (answerCoin > 20) ? answerCoin() : answerCoin ;
//	}
//
////유저가 홀/짝 답하고
//	
//	public String answerResult() {
//		
//		System.out.println("음.....");
//		System.out.print("정답은.. : ");
//		String answerResult = k.next();
//		return answerResult;
//	}
//	
//	
//}
