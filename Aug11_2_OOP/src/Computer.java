import java.util.Random;

public class Computer {
	Random cpu = new Random();
	int coin = 20;	
	
	public int askHowManyCoin(User u) {
		System.out.println("��� �ҷ�?(2�� �̻� 20�� ����) : ");
		int startCoin = u.answerHowManyCoin();
		if(startCoin < 2 || startCoin > 21) {
			System.out.println("�ٽ� �Է� ��!!");
		}
		return(startCoin >= 2 && startCoin <=20) ? startCoin : askHowManyCoin(u);
	}
	
	public int shakeCoin(int userCoin) {
		return cpu.nextInt(userCoin)+1;
	}
	
	public String askHJ(User u) {
		System.out.print("Ȧ? ¦? : ");
		String userAns = u.answerHJ();
		return (userAns.equals("Ȧ") || userAns.equals("¦")) ? userAns : askHJ(u);
	}
	
	public String judgeCoin(int shakeCoin) {
		return (shakeCoin % 2 == 0) ? "¦" : "Ȧ" ;
	}
	
	public String getResult(String userAns, String comAns) { 
		return userAns.equals(comAns) ? "����" : "����" ;
	}

	public void printResult(int shakeCoin, String result) {
		System.out.printf("������ %d�� �̾Ұ�, %s�̾�\n", shakeCoin, result);
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
////��ǻ�Ͱ� ������ ������ �ְ�(20��)
//	public void coin() {
//		System.out.println("��ǻ�Ͱ� ������ 20�� ������ �ֽ��ϴ�.");
//		System.out.println("��ǻ�� : ������ ���� �� ���� �ҷ�?");
//	}
//
////��ǻ�Ͱ� ©©���ؼ� �������� Ȧ/¦ �����
//	public String shake(User u) {
//		System.out.println("��ǻ��: ©©�� �Ѵ� ~!!");
//		Random r = new Random();
//		int coin = r.nextInt(u.answerCoin()) + 1;
//		System.out.println("��ǻ��: ©©�� �� ~!! Ȧ/¦ ?!");
//		
//		return (coin % 2==1) ? "Ȧ" : "¦" ;
//		
//		
//	}
//
//	
////����
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
	

