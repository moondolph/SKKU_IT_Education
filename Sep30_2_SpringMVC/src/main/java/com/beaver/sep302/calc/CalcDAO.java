package com.beaver.sep302.calc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

// 멤버변수 없으면 : static method 기반 
// M / DAO에는 게시판같은 기능을 구현한다면 멤버변수가 생김 
//		-> static 기반 method는 포기  -> 객체를 만들어서 사용해야 하는데 
//		-> 새로고침 or 요청 => calculate.do로 요청할 때마다 새로운 cDAO가 생성됩니다
//		-> 메모리 폭발(메모리를 계속 사용하게 됨, 비효율적)
//		 	+ allCalcCount도 제대로 카운팅 x ! 

// 해결방안 : CalcDAO를 singleton처리 !	

// Spring식의 singleton 처리방법
@Service // servlet-context.xml에 CalcDAO객체 하나를 등록해놓은 효과! 
public class CalcDAO {
	private int allCalcCount;
	
//	public void calculate(CalcResult cr, HttpServletRequest req) {
//		allCalcCount++;
//		System.out.println(allCalcCount);
//		int add = cr.getX() + cr.getY();
//		
//		System.out.println(add);
//		
//	}
	
	
	public void calculate(CalcResult cr, HttpServletRequest req) {
		allCalcCount++;
		System.out.println(allCalcCount);
		int add = cr.getX() + cr.getY();
		req.setAttribute("r", add);
		
	}
	
	
	
}
