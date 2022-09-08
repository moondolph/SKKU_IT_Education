import java.util.Random;
import java.util.Scanner;
//Up & Down 게임 (main에)
//1 ~ 100 사이의 숫자
//컴퓨터 vs 나 => 같은 숫자내면 종료
//	 숫자가 나보다 낮으면 Down!
//	 숫자가 나보다 높으면 Up!
//   몇 턴만에 정답을 찾았는지 출력!
// 반복문(for), 조건문(if)

public class RMain2 {

	public static void main(String[] args) {
System.out.println("컴퓨터가 1~100 사이의 숫자 1개를 고릅니다.");
		Random r = new Random();
		int computer = r.nextInt(100)+1;
System.out.println("컴퓨터가 1~100 사이의 숫자 1개를 다 골랐습니다.");

System.out.print("당신의 차례입니다. 번호를 입력하세요 : ");
		
Scanner k = new Scanner(System.in); // for 안에다 만들면 계속 반복하니까 불필요하잖아 밖에다 만들어
		
		int me = 0; // for 안에다 만들면 계속 반복하니까 불필요하잖아 밖에다 만들어
		
		for (int i = 1; ; i++) { // 몇 번 반복할지 모르기 때문에 조건을 지정할 수 없음. 조건 지정안해도 됨. 아니면 true 넣어.
			me = k.nextInt();
			if (computer == me) {
				System.out.printf("%d번만에 정답입니다.\n", i);
				System.out.println("게임을 종료합니다.");
				break ;
			} else if (computer > me) {
				System.out.println("->UP!");
				System.out.print("다시 번호를 입력하세요: ");
			} else if (computer < me) {
				System.out.println("->down!");
				System.out.print("다시 번호를 입력하세요: ");
				
			}
		} System.out.println("*******************");
	
	
	
	
	}
}