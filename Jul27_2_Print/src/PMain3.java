
public class PMain3 {
	public static void main(String[] args) {
		// print
		// System.out.print("1asdf");
		// System.out.print("2asdf");
		
		// printf
		// System.out.printf("%?", 값); 의 형태
		
		// 정수(decimal)
		// %d : 정수데이터가 들어올 자리(decimal, 10진수) -> 모든 언어 공통!
		// %xd : 빈자리가 띄어쓰기로 채워져서 출력
		// %0xd : 빈자리를 0으로 채워서 x자리의 숫자로 만들어 줌
		System.out.printf("%d\n",1);
		System.out.printf("%3d\n",1);
		System.out.printf("%010d\n",1);
		
		
		
				
		System.out.printf("오늘은 %d일 입니다\n",27);
		System.out.printf("오늘은 %5d일 입니다\n",27);
		System.out.printf("오늘은 %05d일 입니다\n",27);
		System.out.printf("---------------\n",27);
		System.out.println("---------------");
		
		// 실수 (float)
		// %f : 실수데이터가 들어올 자리 
		// %.xf : 소수점 이하의 자릿수 (잘리는 부분은 반올림처리)
		//		빈자리는 0으로 채워줌
		
		System.out.printf("%f\n", 123.123123);
		System.out.printf("%.3f\n", 123.456789);
		System.out.printf("%.10f\n", 123.456789);
		System.out.println("------------");
		
		
		System.out.printf("현재 온도는 %f도 입니다\n",31.12345648);
		System.out.printf("원주율은 %.4f 입니다\n",3.641592);	//잘리는 부분 반올림처리
		System.out.printf("1/3은 소수로 %.10f 입니다\n",0.333333);   //빈자리는 0으로 채움
		
		//문자열(String)
		// %s : 글자데이터가 들어올 자리 
		// 숫자 : 그냥 입력하면 됨
		// 글자 : 그냥 입력하게 되면 Java의 문법으로 해석하기 때문에 -> 오류
		//		=> "내용" (큰 따옴표안에 글자 넣기!)
		System.out.printf("%s\n", "오늘 하루도 이렇게 끝이 나네요?!"); 
		System.out.println("--------");
		
		//오늘 날짜 기준으로 연도 -> xxxx년
		//월					  -> xx월
		//일					  -> xx일
		System.out.printf("날짜 : %d년\n",2022);
		System.out.printf("날짜 : %4d년\n",2022);
		System.out.printf("날짜 : %d월\n",7);
		System.out.printf("날짜 : %02d월\n",7);
		System.out.printf("날짜 : %d일\n",27);
		System.out.printf("날짜 : %02d일\n",27);
		System.out.println("--------");
		//연-월-일의 형태로 붙여서
		//ex) 날짜 : xxxx-xx-xx
		System.out.printf("날짜 : %4d-%02d-%02d\n", 2022, 7, 27);
		//날씨 : 더움
		System.out.printf("날씨 : %s\n","더움");		
		//기온 : 32도
		System.out.printf("기온 : %02d도\n", 32);
		// 습도 : 30.71%
		// %% : %를 글자로 표현하고 싶을 때 (단, printf에서만!)
		System.out.printf("습도 : %.2f%%\n",30.71);
	}
}
