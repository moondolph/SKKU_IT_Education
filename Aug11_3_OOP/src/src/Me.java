import java.util.Scanner;

public class Me {
	// ������ ������ ���ϱ�
	Scanner mouth = new Scanner(System.in);
	
	public int tellMyAns() {
		System.out.print("������ : ");
		int myAns = mouth.nextInt();
		return myAns;
	}
}
