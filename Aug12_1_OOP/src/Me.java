import java.util.Scanner;

public class Me {
	Scanner k = new Scanner(System.in);
	
	String name = "나님" ;
	int age = 20;
	String gender = "남" ;
	String job = "프로그래머";
	
	public void showId() {
		
		System.out.println("---------선수 B---------");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성 : " + gender);
		System.out.println("직업 : " + job);
		
	}
	
	
	
	
	public int playMe() {
		System.out.print("가위(1)/바위(2)/보(3) 중 숫자를 입력하여 내시오: ");
		int m = k.nextInt();
		return m;
	}

	
	
	
	
	
	
	
}
