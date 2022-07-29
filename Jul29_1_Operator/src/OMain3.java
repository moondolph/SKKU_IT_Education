import java.util.Scanner;

//논리연산자
// 	결과가 boolean (true / false)
// 	> (초과), >= (이상), == (같다), != (다르다), < (미만), <= (이하)	

public class OMain3 {
	public static void main(String[] args) {
		
		//놀이공원에서 놀이기구를 타도 되는지 판정해주는 프로그램
		// 키(cm), 나이를 입력받아서 출력

	Scanner a = new Scanner(System.in);
		
		System.out.print("키(cm)를 입력하세요: ");
		double height = a.nextDouble();
		
		System.out.print("나이를 입력하세요: ");
		int age = a.nextInt();
		
		System.out.printf("키는 %.1fcm, 나이는 %d살\n", height, age);
		
		//나이가 10살이 넘는 사람만 탈 수 있음
		boolean ride1 = (age > 10);
		System.out.printf("ride1 탑승 가능 ? : %b\n", ride1);
		
		//나이가 5살 미만만 탈 수 있음
		boolean ride2 = (age < 5);
		System.out.printf("ride2 탑승 가능 ? : %b\n", ride2);
		
		//나이가 20살만 탈 수 있음
		boolean ride3 = (age == 20);
		System.out.printf("ride3 탑승 가능 ? : %b\n", ride3);
		
		//나이가 1살만 아니면 탈 수 있음
		boolean ride4 = (age != 1);
		System.out.printf("ride4 탑승 가능 ? : %b\n", ride4);
		
		//나이가 홀수인 사람만 탈 수 있음
		boolean ride5 = (age % 2 == 1);   // 약간의 수학적 사고가 필요!
		System.out.printf("ride5 탑승 가능 ? : %b\n", ride5);
		System.out.println("==============================");
		//업그레이드 ! 
		//		~고 (and)  : &&
		// 		~거나 (or)  : ||(shift + \)
		//		XOR		  : ^   (eXclusive OR) => 두 입력이 서로 다를 때 '1' 결과값을 출력 !
		//		NOT		  : !	=> 결과를 뒤집는 것
		
		// A && B : A도 만족, B도 만족 => 최종 OK !
		//			확률이 낮은 조건을 앞으로 배치!
		// A || B : A가 만족하거나, B가 만족하거나, 둘 다 만족하거나 => 최종 OK!
		//		  : 확률이 높은 조건을 앞으로 배치 !
		// 결국 컴퓨터가 빠르게 효율적으로 찾게 해줘야함
		
		// 나이가 3살이 넘고, 키가 2m 넘어야 탈 수 있음

		
		// boolean ride6 = (age > 3 && height > 200);
		boolean ride6 = (height > 200 && age > 3); // 이게 더 효율적
		System.out.printf("ride6 탑승 가능 ? : %b\n", ride6);
	
		
		// 키가 1.9m 넘거나, 나이가 50살 미만이면 탈 수 있음
		//boolean ride7 = (height > 190 || age < 50);
		boolean ride7 = (age < 50 || height > 190); //이게 더 효율적
		System.out.printf("ride7 탑승 가능 ? : %b\n", ride7);
		
		// 10 < 나이 < 40이면 탈 수 있음
		boolean ride8 = (age < 40 && age > 10); //이게 더 효율적
		//boolean ride8 = (10 < age < 40); // 안됨 ㅋㅋ
		System.out.printf("ride8 탑승 가능 ? : %b\n", ride8);
		
		//나이가 10살 이상이든지, 키가 1.5m이상이든지 하나만 맞아야됩니다
		boolean ride9 = (height >= 150 ^ age >= 10); 
		System.out.printf("ride9 탑승 가능 ? : %b\n", ride9);
	
		//ride9를 탈 수 있는 사람은 못 타고,
		//ride9를 탈 수 없는 사람만 탈 수 있음
		boolean ride10 = !ride9; 
		System.out.printf("ride10 탑승 가능 ? : %b\n", ride10);
		
		
		
		
	}
}
