import java.util.Random;

public class Computer {
	Random cpu = new Random();
	int coin = 20;	
	
	public int askHowManyCoin(User u) {
		System.out.println("몇개로 할래?(2개 이상 20개 이하) : ");
		int startCoin = u.answerHowManyCoin();
		if(startCoin < 2 || startCoin > 21) {
			System.out.println("다시 입력 해!!");
		}
		return(startCoin >= 2 && startCoin <=20) ? startCoin : askHowManyCoin(u);
	}
	
	public int shakeCoin(int userCoin) {
		return cpu.nextInt(userCoin)+1;
	}
	
	public String askHJ(User u) {
		System.out.print("홀? 짝? : ");
		String userAns = u.answerHJ();
		return (userAns.equals("홀") || userAns.equals("짝")) ? userAns : askHJ(u);
	}
	
	public String judgeCoin(int shakeCoin) {
		return (shakeCoin % 2 == 0) ? "짝" : "홀" ;
	}
	
	public String getResult(String userAns, String comAns) { 
		return userAns.equals(comAns) ? "정답" : "오답" ;
	}

	public void printResult(int shakeCoin, String result) {
		System.out.printf("동전은 %d개 뽑았고, %s이야\n", shakeCoin, result);
	}

	public void start(User u) {
		int userCoin = askHowManyCoin(u);
		int shakeCoin = shakeCoin(userCoin);
		String userAns = askHJ(u);
		String comAns = judgeCoin(shakeCoin);
		String result = getResult(userAns,comAns);
		printResult(shakeCoin,result);
	}
}	
////컴퓨터가 동전을 가지고 있고(20개)
//	public void coin() {
//		System.out.println("컴퓨터가 동전을 20개 가지고 있습니다.");
//		System.out.println("컴퓨터 : 유저야 동전 몇 개로 할래?");
//	}
//
////컴퓨터가 짤짤이해서 유저한테 홀/짝 물어보고
//	public String shake(User u) {
//		System.out.println("컴퓨터: 짤짤이 한다 ~!!");
//		Random r = new Random();
//		int coin = r.nextInt(u.answerCoin()) + 1;
//		System.out.println("컴퓨터: 짤짤이 끝 ~!! 홀/짝 ?!");
//		
//		return (coin % 2==1) ? "홀" : "짝" ;
//		
//		
//	}
//
//	
////판정
//	public void judge(String shake, User u) {
//		
//		
//		switch (coin%2) {
//		case : 1
//			
//			break;
//
//		default:
//			break;
//		}
//		
//		
//		
//		
//	}
	

