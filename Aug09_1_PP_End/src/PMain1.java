import java.util.Random;
import java.util.Scanner;

public class PMain1 {
	public static void main(String[] args) {
		// 10개의 숫자를 랜덤으로 뽑아서 ( 1 ~ 100 )
		// 배열에 담고 -> 출력 !
		int[] num = new int[10];
		Random r = new Random();
		
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(100) + 1;
		}
		for (int i :qoㅊ) {
			System.out.println(i + " ");
		}
		System.out.println();
		System.out.println("------------");
		//10개의 숫자를 직접 입력해서
		//배열에 담고 -> 출력
		
		int[] num2 = new int[10];
		Scanner k = new Scanner(System.in);
		
		for (int i = 0; i<num2.length; i++) {
			System.out.printf("%d번째 숫자? : ", i + 1);
			num2[i] = k.nextInt();
			 
		}
		for (int i : num2) {
			System.out.println(i + " ");
		}
		System.out.println();
		System.out.println("--------------");
		
		// 배열 num(Random)으로 받아온 최대값, 최소값 구하기 -> 출력
		int max = num[0];	// 배열의 0번째 숫자가 최대값이라고 가정
		int min = num[0];	// 배열의 0번째 숫자가 최소값이라고 가정
		for (int i = 0; i < num.length; i++) {
			if (min > num[i]) { // num[i]의 숫자가 더 작다면 
				min = num[i];   // num[i]의 숫자값을 min에 옮겨 담기
			} else if (max < num[i]) { // num[i]의 숫자가 더 크다면 
				max = num[i];  	// num[i]의 숫자값을 max에 옮겨 담기
			}
		}
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);
	}
}
	
		
		
		
//		int g = 0;
//		for(int i = 0; i<num.length-1; i++) {
//			if(num[i]>num[i+1]){
//				g=num[i];
//				num[i]=num[i+1];
//				num[i+1]=g;
//			}
//		}System.out.printf("최대값 : %d", num[9]);
//		for(int i = num.length-1; i>num.length-1; i--) {
//			if(num[i]>num[i+1]){
//				g=num[i];
//				num[i]=num[i+1];
//				num[i+1]=g;
//			}

		
	
	
//		Random r = new Random();
//		
//		for(int i = 0; i<10; i++) {
//		int num = r.nextInt(100) + 1;
//		System.out.println(num);
		
		
	

