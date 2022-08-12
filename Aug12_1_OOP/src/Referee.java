
public class Referee {


You y = new You();
Me m = new Me();





public void introduce(You y, Me m) {
	System.out.println("심판 : 가위바위보 게임을 시작합니다");
	System.out.println("심판 : 자 선수 입장 !");
	y.showId();
	m.showId();
	
	System.out.println("-----------------------");
	System.out.println("나님 : ㅎㅇㅎㅇ !");
	System.out.println("너님 : 가위바위보 운빨게임 아님");
	System.out.println("-----------------------");
	System.out.println("심판 : 규칙을 설명하겠습니다. ");
	System.out.println("심판 : 걍 먼저 5승을 하면 승리입니다.");
	System.out.println("심판 : 자 그럼 1라운드 시작합니다.");
}
public void play(You y, Me m) {
	int w = 0;
	int d = 0;
	int l = 0;
	for(int i=1;true;i++) {
		System.out.println("심판 : 가위바위보 !!");
		System.out.printf("%d라운드 !! 대결",i);
		int mm = m.playMe();
		int yy = y.playYou();
		if(yy==mm) {
			System.out.println("무승부 !!");
			d++;
			System.out.printf("<<%d라운드 결과>>",i);
			System.out.printf("나님:%d승,%d무,%d패",w,d,l);
			System.out.printf("너님:%d승,%d무,%d패",l,d,w);
			
			 
		}
		else if(yy<mm) {
			System.out.println("'나님' 승 !!!");
			w++;
			System.out.printf("<<%d라운드 결과>>",i);
			System.out.printf("나님:%d승,%d무,%d패",w,d,l);
			System.out.printf("너님:%d승,%d무,%d패",l,d,w);
		}
		else {
			System.out.println("'너님' 승 !!!");
			l++;
			System.out.printf("<<%d라운드 결과>>",i);
			System.out.printf("나님:%d승,%d무,%d패",w,d,l);
			System.out.printf("너님:%d승,%d무,%d패",l,d,w);
		}
		if (w==5 || l==5) {
			System.out.println("승자가 나타났습니다 !!");
			System.out.printf("<<%d라운드 결과>>",i);
			System.out.printf("나님:%d승,%d무,%d패",w,d,l);
			System.out.printf("너님:%d승,%d무,%d패",l,d,w);
		break;
		}
		
	}
	
}
	
	
	




//실행 메소드 모음
public void start() {
	introduce(y,m);
	play(y,m);
	
}

	
	
}
