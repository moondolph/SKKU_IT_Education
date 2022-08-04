import java.util.Scanner;

// 평일 스케줄 출력해주는 프로그램

// 시간을 입력 받아서 (24시간단위) ->해당시간에 속하는 내용을 출력
//	-> (입력한 시간이) 시간 범위가 아니면 다시 입력

// 오전 9시 ~ 오후 6시 :학원에서 공부 
// 오전 9시, 오후 6시, 오후 2시 : QR찍기
// 오후 12시 : 점심시간
// 오후 6시 넘어서 ~ 오후 8시 : 집에가는 시간
// 오전 6시 ~ 오전 9시 전까지 : 기상 + 씻기 + 학원가기
// 오후 8시 ~ 오전 6시 : 여가시간 + 취침

public class YMain2 {

	// 시간을 입력받는 함수
	public static int getHour() {
		Scanner k = new Scanner(System.in);
		System.out.println("시간 입력 (00 ~ 24): ");
		int hour = k.nextInt();
		return (hour >= 0 && hour <=24) ? hour : getHour();
	}
	// 시간을 출력하는 함수
	public static void printHour(int akdfjlasdjf) {
		System.out.println("---------------");
		System.out.printf("%d시 ! \n",akdfjlasdjf);
		System.out.println("---------------");
	}
	// 결과를 출력하는 함수
	public static void printResult(int hour) {
		if (hour >= 9 && hour <=18) {
			System.out.println("학원에서 공부를 합니다.");
			if (hour == 9 || hour == 14 || hour == 18) {
				System.out.println("QR!!!!!!!!!!!!!!!!!!");
			}else if (hour >=12 && hour <13) {
				System.out.println("점심 빠아아아아아아아아아압~");
			}
	   }else if(hour > 18 && hour <=20) {
		   System.out.println("침대가 기다려요! 얼른 가야해요!!!!");
	   }else if(hour >= 6 && hour < 9) {
		   System.out.println("일어나기 + 씻기 + 학원가기......;;;");
	   }else {
		   System.out.println("여가 시간 + 취침 !");
	   }
    }
	
	
	
	public static void main(String[] args) {
		int hour = getHour();
		System.out.println(hour);
	}
	
	
	
	
	
	
//	------------------------이하 나의 코드-----------------------------
	//	public static int hour() {
//		Scanner k = new Scanner(System.in);
//		System.out.print("시간(24시간단위) : ");
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
//		System.out.print("분 : ");
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
//			return "기상 + 씻기 + 학원가기" ;
//		}
//		else if(h == 9 || h == 18 || h== 14) {
//			return "QR찍기";
//		}
//		else if(h>=9 && h <= 18) {
//			return "학원에서 공부";
//			if 
//		}
//		else if(h>=12 && h<=13) {
//			return "점심시간";
//		}
//		else if(h>18 && h <= 20) {
//			return "집에가는 시간";
//		}
//		else if(h>=20 || h <= 6) {
//			return "여가시간 + 취침";
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
