import java.util.Scanner;

public class KIMain3 {
	public static void main(String[] args) {
		//메뉴판
		//떡볶이, 순대, 어묵, 튀김, ...
		// 가격을 입력 받아서
		// 메뉴판 모양으로 출력!
		
		Scanner price = new Scanner(System.in);
		
		System.out.println("떡볶이 1인분 가격 책정: ");
		int tteok = price.nextInt();
				
		System.out.println("순대 1인분 가격 책정: ");
		int sun = price.nextInt();
				
		System.out.println("어묵 1인분 가격 책정: ");
		int eo = price.nextInt();
				
		System.out.println("튀김 1인분 가격 책정: ");
		int tui = price.nextInt();
		
		System.out.println("콜라 1인분 가격 책정: ");
		int coke = price.nextInt();
		
		
		
		
		
		System.out.println("\t<메뉴판>");
		System.out.println("=========================");	
		System.out.printf("|*떡볶이:%,d원\t|\n",tteok);
		System.out.printf("|*순대:%,d원\t\t|\n",sun);
		System.out.printf("|*어묵:%,d원\t\t|\n",eo);
		System.out.printf("|*튀김:%,d원\t\t|\n",tui);
		System.out.printf("|*콜라:%,d원\t\t|\n",coke);
		System.out.println("=========================");			
	}

}
