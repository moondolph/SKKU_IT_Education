
public class AMain2 {
	
	// 저장한 폴더 cmd 실행
	
	// public / static : 좀 더 나중에
	// void : 자료형인데.. 리턴할 게 없다!
	// main : 함수명 
	
	// String[] args의 정체는...? 
	// 외부에서 값을 받아오기 위해서 사용하는 파라미터
	// args 문자열을 배열로 사용하겠다! 
	// args는 변수명이기 때문에 꼭 args가 아니어도 되지만
	// 파라미터는 String[] args 자체를 빼서는 안됨!!!!!!!!!!!
	
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		Thread.sleep(10000);	
			
	}
		
}

