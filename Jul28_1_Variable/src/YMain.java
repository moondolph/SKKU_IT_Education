
public class YMain {
	public static void main(String[] args) throws InterruptedException {
		// 집까지 얼마나 걸렸는지 (시간) : 0.5시간
		// 저녁 식사 메뉴 ? : ???
		// 수업 후에 뭐하셨나요 ? : ???
		// 취침 시간 : ?시 ?분
		// 소감 : ~~~
		// 수업 성취도 : ?.?%
		// 출력
		
		// 5초 정도 딜레이 걸어서 -> .bat로 실행까지 !
		
		System.out.printf("집까지 얼마나 걸렸는지:%.1f시간\n",1.5);
		System.out.printf("저녁식사 메뉴? : %s","한식\n");
		System.out.printf("수업 후에 뭐 하셨나요?: %s\n", "복습&이클립스깃연동");
		System.out.printf("취침 시간 : %02d시 %02d분\n",00,40);
		System.out.printf("소감 : %s\n","타자 뚜들기는 손맛이 있어서 재밌다");
		System.out.printf("수업 성취도 : %.1f%%\n",95.5);
		
		
		Thread.sleep(5000);
		
		
		
		
	}
}
