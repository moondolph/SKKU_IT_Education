import java.util.Scanner;

public class CMain4 {

	//switch-case (ex : 권한 설정)
	
	//Scaneer로 입력 받을 것

	//이병입력 -> 눈치, 관등성명, 훈련, 잠
	//일병입력 -> 관등성명, 훈련, 잠
	//상병입력 -> 훈련, 잠
	//병장입력 -> 잠
	
	public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	System.out.print("계급 : ");
	String rank = k.next();
	System.out.println(rank);
	
	switch (rank) {
	case "이병": System.out.println("눈치");
	case "일병": System.out.println("관등성명");
	case "상병": System.out.println("훈련");
	case "병장": System.out.println("잠");
		break;                   
	default: System.out.println("계급은 모르겠고... 돈 많은 백수가 꿈입니다...");
		break;
	
	}
	
	
	}

}
