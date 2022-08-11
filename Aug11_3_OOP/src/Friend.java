import java.util.Random;

public class Friend {

	Random brain = new Random();
	
	public int answer() {
	int think = brain.nextInt(100)+1;
	// 머리속으로 숫자 하나를 <생각>해서 
	// 종이에 써서 답 제출
	
	System.out.println("친구: (음...고민때리다가 슥슥슥)\"네 여기요\"");
	return think;
	}
	
	
}
