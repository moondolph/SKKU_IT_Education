import java.util.Scanner;

public class CMain6 {
	// 1년 = 12달
	// 각 달마다 며칠인지 다릅니다
	// 몇 월인지 입력을 받아서
	// 31일까지 있습니다. / 30일까지 있습니다. / 28일까지 있습니다.
	// 14월 -> 없는 달입니다 출력
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("? : 월");
		int month = a.nextInt();
		System.out.printf("%d월\n",month);
		int day = 0;
		
		switch (month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			day = 31;
			System.out.printf("%d월은 %d일까지 있습니다.\n",month,day);
			break;
		case 4:case 6:case 9:case 11:
			day = 30;
			System.out.printf("%d월은 %d일까지 있습니다.\n",month,day);
			break;
		case 2:
			day = 28;
			System.out.printf("%d월은 %d일까지 있습니다.\n",month,day);
			break;
		default:
			System.err.printf("%d월은 없는 달입니다.\n",month);    //err 뜨는 것처럼 빨간 글자로 표시
			break;	
		}
//		System.out.printf("%d월은 %d일까지 있습니다.\n",month,day);         //?왜 여기서 그대로 이어지는지
	}

}
