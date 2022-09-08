import java.util.Scanner;

public class RMain6 {
	public static void main(String[] args) {
		//반복문 10번 -> 반복문 1번 돌때마다 안녕하세요 x3번씩 출력
		//갑자기 숫자 3이 맘에 안들어서...
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i==3) {
				continue;
			}
			System.out.println(i);
			System.out.println("안녕하세요 1트");
			System.out.println("안녕하세요 2트");
			System.out.println("안녕하세요 3트");
		}
		System.out.println("---------------------");
		for (int i = 0; i <10 ; i++) {
			if(i%2 ==0) {
				System.out.println("와!");
			} else {
				//continue;     // 강제반복(턴종료) -> 홀수일때는 무시하고, 다음으로 넘어감
				break; 			// (공식적), 반복문 끝!
				//return;       // (비공식적), 함수가 끝, 어쨌든간에 반복문이 깨짐! 
			}
		}
		System.out.println("---------------------------");
		// 코멘트 내용을 입력 받을건데, 내용은 계속 받아올 것
		// 내용이 "ㅎㅇ"면 반복문 끝!
		
		Scanner k = new Scanner(System.in);
		System.out.print("코멘트를 입력하세요: ");
		String cmt = k.next();
		while (!cmt.equals("ㅎㅇ")) { 					//조건 비교해봐 밑에 코드랑. 위에는 바로 ㅎㅇ 입력하게되면 끝나게 해놨음. 
			System.out.println(cmt);
			System.out.print("코멘트를 다시 입력하세요: ");
			cmt = k.next();
		}System.out.println("반복문 끝!");
		
		while(true) {									//밑에는 무조건 돌아가게 했음
			System.out.print("내용 : ");
			cmt = k.next();
			System.out.println("------------");
			System.out.println(cmt);
			System.out.println("------------");
			if (cmt.equals("ㅎㅇ")) {
				System.out.println("반복문 끝!");
				break;
			}
		}
		
		
	
	
	}
}
