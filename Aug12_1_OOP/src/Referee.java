
public class Referee {


You y = new You();
Me m = new Me();





public void introduce(You y, Me m) {
	System.out.println("���� : ���������� ������ �����մϴ�");
	System.out.println("���� : �� ���� ���� !");
	y.showId();
	m.showId();
	
	System.out.println("-----------------------");
	System.out.println("���� : �������� !");
	System.out.println("�ʴ� : ���������� ����� �ƴ�");
	System.out.println("-----------------------");
	System.out.println("���� : ��Ģ�� �����ϰڽ��ϴ�. ");
	System.out.println("���� : �� ���� 5���� �ϸ� �¸��Դϴ�.");
	System.out.println("���� : �� �׷� 1���� �����մϴ�.");
}
public void play(You y, Me m) {
	int w = 0;
	int d = 0;
	int l = 0;
	for(int i=1;true;i++) {
		System.out.println("���� : ���������� !!");
		System.out.printf("%d���� !! ���",i);
		int mm = m.playMe();
		int yy = y.playYou();
		if(yy==mm) {
			System.out.println("���º� !!");
			d++;
			System.out.printf("<<%d���� ���>>",i);
			System.out.printf("����:%d��,%d��,%d��",w,d,l);
			System.out.printf("�ʴ�:%d��,%d��,%d��",l,d,w);
			
			 
		}
		else if(yy<mm) {
			System.out.println("'����' �� !!!");
			w++;
			System.out.printf("<<%d���� ���>>",i);
			System.out.printf("����:%d��,%d��,%d��",w,d,l);
			System.out.printf("�ʴ�:%d��,%d��,%d��",l,d,w);
		}
		else {
			System.out.println("'�ʴ�' �� !!!");
			l++;
			System.out.printf("<<%d���� ���>>",i);
			System.out.printf("����:%d��,%d��,%d��",w,d,l);
			System.out.printf("�ʴ�:%d��,%d��,%d��",l,d,w);
		}
		if (w==5 || l==5) {
			System.out.println("���ڰ� ��Ÿ�����ϴ� !!");
			System.out.printf("<<%d���� ���>>",i);
			System.out.printf("����:%d��,%d��,%d��",w,d,l);
			System.out.printf("�ʴ�:%d��,%d��,%d��",l,d,w);
		break;
		}
		
	}
	
}
	
	
	




//���� �޼ҵ� ����
public void start() {
	introduce(y,m);
	play(y,m);
	
}

	
	
}
