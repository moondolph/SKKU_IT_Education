
public class RMain3 {
	public static void main(String[] args) throws InterruptedException {
		// 초시계
		// 일 시 분 초 
		// 1초마다 초 값이 증가 
		// ex) [Day00] 00:00:01 <-실행 후 1초뒤 콘솔창 내용
		// ex) [Day00] 00:00:02 <-실행 후 2초뒤 콘솔창 내용
		// ex) [Day00] 00:00:03 <-실행 후 3초뒤 콘솔창 내용
		
		for(int day=0; day<30; day++) {
			for (int hour=0;hour<24;hour++) {
				for(int minute=0; minute<60; minute++) {
					for(int second=0;second<60;second++) {
						System.out.printf("[Day%02d] %02d:%02d:%02d\n",day,hour,minute,second);
						Thread.sleep(1000);
					}
				}
			}
		}
		
		
		
		
		
//		for(int s=0;true;s++) {
//			System.out.printf("[Day00] 00:00:%02d\n",s);
//			Thread.sleep(1000);
//			if (s==60) {
//				break;
//			}
			
		
		
		
		
		
	}
}
