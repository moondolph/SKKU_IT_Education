import java.util.Random;

public class You {
	Random r = new Random();

	String name = "너님" ;
	int age = 41;
	String gender = "남" ;
	String job = "바리스타";
	
	public void showId() {
		System.out.println("---------선수 A---------");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성 : " + gender);
		System.out.println("직업 : " + job);
		
	}

	
	public int playYou() {
		int y = r.nextInt(3) + 1;
		System.out.println("'너님'이 가위(1)/바위(2)/보(3) 중 하나를 냈습니다.");
		return y ;
		
	}

	
	
	
	
	
	
	
	
}
