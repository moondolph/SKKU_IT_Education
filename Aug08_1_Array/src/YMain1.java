import java.util.Scanner ;

public class YMain1 {
	// ATM 기능을 하는 프로그램
	// 1을 고르면 예금 / 2를 고르면 출금 / 3을 고르면 잔고 확인 / 4를 고르면 프로그램 종료
	// 돈 값은 입력 받을 것 (입금, 출금)
	// main 함수에 !
	
	public static void main(String[] args) {
		
		System.out.println("[ATM 기능을 하는 프로그램]");
		
		System.out.println("1. 예금 | 2. 출금 | 3. 잔고확인 | 4. 프로그램 종료");
		System.out.print("원하는 기능의 번호를 입력하세요 : ");
		Scanner k = new Scanner(System.in);
		int a = k.nextInt();
		int balance = 0 ;
		int b = 0;
		int c = 0;
		while (a!=4) {
		if (a==1) {
			System.out.print("예금할 돈 : ");
			b = k.nextInt();
			balance += b ;
			System.out.print("원하는 기능의 번호를 입력하세요 : ");
			 a = k.nextInt();
		}
		else if(a==2) {
			System.out.print("출금할 돈 : ");
			c = k.nextInt();
			balance -= c ;
			System.out.print("번호를 입력하세요 : ");
			a = k.nextInt();
		
		}
		else if(a==3) {
			System.out.print("잔고: ");
		
			System.out.printf("%d원\n",balance);								
			System.out.print("번호를 입력하세요 : ");
			a = k.nextInt();
		}
		else {
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}
		
	}
  }
}