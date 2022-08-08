import java.util.Scanner;

//Bubble Sort : 인접한 두 항목의 값을 비교해서
//				기준에 만족하면 서로의 값을 교환하는 정렬 방법

public class PMain6 {
	// 숫자를 입력 받아서 배열에 담을 것 (숫자는 5개)
	public static int[] num() {
		Scanner k = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int a = k.nextInt();
		int b = k.nextInt();
		int c = k.nextInt();
		int d = k.nextInt();
		int e = k.nextInt();
		int[] bubble = new int[] { a, b, c, d, e };
		return bubble;
	}

	// 정렬 전의 값을 출력
	public static void pre(int[] bubble) {
		System.out.println("오름차순 정렬 전");
		for (int i = 0; i < bubble.length; i++) {
			System.out.print(bubble[i] + " ");
	}
}
	// 정렬
	// 오름차순(ASC)
	public static void asc(int[] bubble) {

		for (int i = 0; i < bubble.length - 1; i++) {
			for (int j = 0; j < bubble.length - 1 - i; j++) {
				if (bubble[j] > bubble[j + 1]) {
					int tmp = bubble[j];
					bubble[j] = bubble[j + 1];
					bubble[j + 1] = tmp;
				}
				
			}
		}
//		return bubble; 
	}

	// 정렬 후의 값을 출력
	public static void after(int[] bubble) {
		System.out.println("\n오름차순 정렬 후");
		for (int i = 0; i < bubble.length; i++) {
			System.out.printf("%d ",bubble[i]);
		}
	}

	public static void main(String[] args) {									//함수에서 출력기능까지 만들것인가 main함수에서 프린트를 할 것인가?
	int[] bubble = num();
	pre(bubble);
	asc(bubble);
	after(bubble);
}
	}

