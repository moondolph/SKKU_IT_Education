
public class RMain3 {
	public static void main(String[] args) throws InterruptedException {
		// �ʽð�
		// �� �� �� �� 
		// 1�ʸ��� �� ���� ���� 
		// ex) [Day00] 00:00:01 <-���� �� 1�ʵ� �ܼ�â ����
		// ex) [Day00] 00:00:02 <-���� �� 2�ʵ� �ܼ�â ����
		// ex) [Day00] 00:00:03 <-���� �� 3�ʵ� �ܼ�â ����
		
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
