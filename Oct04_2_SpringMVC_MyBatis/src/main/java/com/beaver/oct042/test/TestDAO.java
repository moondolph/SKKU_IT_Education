package com.beaver.oct042.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestDAO {
	
	@Autowired
	private SqlSession ss;
	
	public void regTest(Test t, HttpServletRequest req) {
		try {
			// View 파라미터 3개(t_y, t_m, t_d -> t_when 합쳐줄리없죠?ㅋㅋㅋㅋ -->DAO)
			String t_y = req.getParameter("t_y");
			
			// 2022 1 1 -> SimpleDateFormat
			// 202211 -> 2022년 11월? / 2022년 1월 1일?
			int t_m = Integer.parseInt(req.getParameter("t_m"));
			int t_d = Integer.parseInt(req.getParameter("t_d"));
			
			String t_when2 = String.format("%s%02d%02d", t_y, t_m, t_d); //20220101
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			
			Date t_when = sdf.parse(t_when2);
			t_setT_when(t_when);
			
			if (ss.getMapper(TestMapper.class).regTest(t) == 1) {
				req.setAttribute("r", "시험날짜 등록 성공");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "시험날짜 등록 실패");
		}
	}
	
	public void getAllTest(HttpServletRequest req) {
		
		try {
			req.setAttribute("tests", ss.getMapper(TestMapper.class).getAllTest());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// cos.jar 쓸 때 
	
	// 1. req.getParameter() -> mr.getParameter()를 써야!
	// 2. 실행되는 서버상에서 파일이 업로드되는 폴더 경로
	//	   String path = req.getServletContext().getRealPath("img"); => ( X )
	//	   String path = req.getSession().getServletContext().getRealPath("resources/img");
	//
	//
	//
	
	
	
	
}
