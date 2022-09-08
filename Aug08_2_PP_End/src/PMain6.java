import java.util.Arrays;
import java.util.Scanner;

//Bubble Sort : 인접한 두 항목의 값을 비교해서
//				기준에 만족하면 서로의 값을 교환하는 정렬 방법

public class PMain6 {
	// 숫자를 입력 받아서 배열에 담을 것 (숫자는 5개)
	public static int[] getNum() {
		Scanner k = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d번째 숫자 입력 : ", i + 1);
			num[i] = k.nextInt();
		}
		System.out.println();
		System.out.println("-----------");
		return num;
	}

//	public static int[] num() {
//		Scanner k = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요 : ");
//		int a = k.nextInt();
//		int b = k.nextInt();
//		int c = k.nextInt();
//		int d = k.nextInt();
//		int e = k.nextInt();
//		int[] bubble = new int[] { a, b, c, d, e };
//		return bubble;
//	}

	// 정렬 전의 값을 출력
	public static void printNum(int[] num) {
		System.out.println("<<< 입력한 값 >>>");
		for (int i : num) {
			System.out.println();
		}
	}

	// public static void pre(int[] bubble) {
//		System.out.println("오름차순 정렬 전");
//		for (int i = 0; i < bubble.length; i++) {
//			System.out.print(bubble[i] + " ");
//	}
//}
	// 정렬
	// 오름차순(ASC)
	public static int[] getResult(int[] num) {
		int b = 0;
		for (int turn = 1; turn < num.length; turn++) {
			for (int i = 0; i < num.length - 1; i++) {
				// num.length - 1 :
				// if문 안에서 계산을 할 때, 다음 배열값을 비교하기 위해서
				// + 1을 사용했는데
				// length 길이 그대로 사용하면 에러가 발생 함 !

				if (num[i] > num[i + 1]) {
					b = num[i];
					num[i] = num[i + 1];
					num[i + 1] = b;
				}
				System.out.print(num[i] + " ");
			}
			System.out.println(num[4]);
			System.out.println("정렬된 값 : " + b);
			System.out.println("---------");
		}
		return num;
	}

//public static void asc(int[] bubble) {
//
//		for (int i = 0; i < bubble.length - 1; i++) {
//			for (int j = 0; j < bubble.length - 1 - i; j++) {
//				if (bubble[j] > bubble[j + 1]) {
//					int tmp = bubble[j];
//					bubble[j] = bubble[j + 1];
//					bubble[j + 1] = tmp;
//				}
//				
//			}
//		}
//		return bubble; 

	// 정렬 후의 값을 출력
	public static void printResult(int[] result) {
		System.out.println("<< 정렬 후 값 >>");
		for (int i : result) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("------------");
	}

//	public static void after(int[] bubble) {
//		System.out.println("\n오름차순 정렬 후");
//		for (int i = 0; i < bubble.length; i++) {
//			System.out.printf("%d ",bubble[i]);
//		}
//	}

	public static void main(String[] args) {
		int[] num = getNum();
		printNum(num);
		int[] result = getResult(num);
		printResult(result);

//사실상 크게 의미가 없음...!
//성능에서 효과가 없기 때문에 !
// 코테용으로 사용만 ㅋ_ㅋ;;
		Arrays.sort(num);
		for (int i : num) {
			System.out.print(i + " ");
		}
	}

}
//	public static void main(String[] args) {									//함수에서 출력기능까지 만들것인가 main함수에서 프린트를 할 것인가?
//	int[] bubble = num();
//	pre(bubble);
//	asc(bubble);
//	after(bubble);
