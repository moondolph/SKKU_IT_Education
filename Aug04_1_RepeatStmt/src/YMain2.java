import java.util.Scanner;

// ���� ������ ������ִ� ���α׷�

// �ð��� �Է� �޾Ƽ� (24�ð�����) ->�ش�ð��� ���ϴ� ������ ���
//	-> (�Է��� �ð���) �ð� ������ �ƴϸ� �ٽ� �Է�

// ���� 9�� ~ ���� 6�� :�п����� ���� 
// ���� 9��, ���� 6��, ���� 2�� : QR���
// ���� 12�� : ���ɽð�
// ���� 6�� �Ѿ ~ ���� 8�� : �������� �ð�
// ���� 6�� ~ ���� 9�� ������ : ��� + �ı� + �п�����
// ���� 8�� ~ ���� 6�� : �����ð� + ��ħ

public class YMain2 {

	// �ð��� �Է¹޴� �Լ�
	public static int getHour() {
		Scanner k = new Scanner(System.in);
		System.out.println("�ð� �Է� (00 ~ 24): ");
		int hour = k.nextInt();
		return (hour >= 0 && hour <=24) ? hour : getHour();
	}
	// �ð��� ����ϴ� �Լ�
	public static void printHour(int akdfjlasdjf) {
		System.out.println("---------------");
		System.out.printf("%d�� ! \n",akdfjlasdjf);
		System.out.println("---------------");
	}
	// ����� ����ϴ� �Լ�
	public static void printResult(int hour) {
		if (hour >= 9 && hour <=18) {
			System.out.println("�п����� ���θ� �մϴ�.");
			if (hour == 9 || hour == 14 || hour == 18) {
				System.out.println("QR!!!!!!!!!!!!!!!!!!");
			}else if (hour >=12 && hour <13) {
				System.out.println("���� ���ƾƾƾƾƾƾƾƾƾ�~");
			}
	   }else if(hour > 18 && hour <=20) {
		   System.out.println("ħ�밡 ��ٷ���! �� �����ؿ�!!!!");
	   }else if(hour >= 6 && hour < 9) {
		   System.out.println("�Ͼ�� + �ı� + �п�����......;;;");
	   }else {
		   System.out.println("���� �ð� + ��ħ !");
	   }
    }
	
	
	
	public static void main(String[] args) {
		int hour = getHour();
		System.out.println(hour);
	}
	
	
	
	
	
	
//	------------------------���� ���� �ڵ�-----------------------------
	//	public static int hour() {
//		Scanner k = new Scanner(System.in);
//		System.out.print("�ð�(24�ð�����) : ");
//		int h = k.nextInt();
//		if (h<0 || h>24) {
//			hour();}
//		else {
//			return h ; 	
//		}
//		return hour();
//	}
//	
//	public static int minute() {
//		Scanner k = new Scanner(System.in);
//		System.out.print("�� : ");
//		int m = k.nextInt();
//		
//		if (m<0 || m>60) {
//			minute
//			();}
//		else {
//			return m ; 	
//		}
//		return hour();
//	}
//		
//	public static String result(int h, int m) {
//		if (h>=6 && h<9) {
//			return "��� + �ı� + �п�����" ;
//		}
//		else if(h == 9 || h == 18 || h== 14) {
//			return "QR���";
//		}
//		else if(h>=9 && h <= 18) {
//			return "�п����� ����";
//			if 
//		}
//		else if(h>=12 && h<=13) {
//			return "���ɽð�";
//		}
//		else if(h>18 && h <= 20) {
//			return "�������� �ð�";
//		}
//		else if(h>=20 || h <= 6) {
//			return "�����ð� + ��ħ";
//		}
//		return result(h, m);
//	}
//	
//	public static void main(String[] args) {
//		int h=hour();	
//		int m=minute();
//		String print =result(h,m);
//		System.out.println(print);
//	}	
	
	
	
	
	
	
}
