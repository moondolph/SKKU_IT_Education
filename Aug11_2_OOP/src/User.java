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
////������ ���ϰ�(��������)
//	public int answerCoin() {
//		System.out.println("��.....");
//		System.out.print("���� ������ : ");
//		int answerCoin = k.nextInt();
//		return (answerCoin > 20) ? answerCoin() : answerCoin ;
//	}
//
////������ Ȧ/¦ ���ϰ�
//	
//	public String answerResult() {
//		
//		System.out.println("��.....");
//		System.out.print("������.. : ");
//		String answerResult = k.next();
//		return answerResult;
//	}
//	
//	
//}
