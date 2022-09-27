package com.jaden.sep261.apple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.beaver.db.manager.BeaverDBManager;

public class AppleDAO {
	private static final AppleDAO APPLEDAO = new AppleDAO();
	
	public AppleDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public static AppleDAO getAppledao() {
		return APPLEDAO;
	}
	
	// 모든 사과 데이터 다 가져오기
	public void getAllApples(HttpServletRequest req) {
		Connection con  = null;
		PreparedStatement pstmt = null;
		
		ResultSet rs = null;
		
		try {
			con = BeaverDBManager.connect("beaverPool");
		
			// sql문 작성 
			String sql = "select * from sep26_apple order by a_price";
			pstmt = con.prepareStatement(sql);
			
			// C / U / D : pstmt.executeUpdate()로 실행 
			//		=> 데이터 몇 개 영향을 받았는지 
			// R : pstmt.executeQuery()로 실행
			//		=> select 결과를 ResultSet으로 보냄 
			rs = pstmt.executeQuery();
		
			ArrayList<Apple> apples = new ArrayList<Apple>();
			Apple apple = null;
			while (rs.next()) {
				apple = new Apple();
				apple.setA_location(rs.getString("a_location"));
				apple.setA_color(rs.getString("a_color"));
				apple.setA_flavor(rs.getString("a_flavor"));
				apple.setA_price(rs.getInt("a_price"));
				apple.setA_introduce(rs.getString("a_introduce"));
				apples.add(apple);
			}
			req.setAttribute("apples", apples);
		} catch (Exception e) {
			e.printStackTrace();
		}
		BeaverDBManager.close(con, pstmt, rs);
	}
	
	//등록하기
	public void reg(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = BeaverDBManager.connect("beaverPool");
			
			//데이터 입력
			req.setCharacterEncoding("EUC-KR");
			String location = req.getParameter("a_location");
			String color = req.getParameter("a_color");
			String flavor = req.getParameter("a_flavor");
			int price = Integer.parseInt(req.getParameter("a_price"));

			// <textArea>에서 엔터친거 : \r\n
		
			// 웹페이지에서 줄바꾸기 : <br>
			String introduce = req.getParameter("a_introduce");
		
			// sql문 작성 (미완성) - 값으로 어떤 값을 넣을지 모르기 때문에 
			String sql = "insert into sep26_apple values(?, ?, ?, ?, ?)";
		
			// DB관련 총괄매니저(pstmt)
			pstmt = con.prepareStatement(sql);
			
			//sql완성
			pstmt.setString(1, location);
			pstmt.setString(2, color);
			pstmt.setString(3, flavor);
			pstmt.setInt(4, price);
			pstmt.setString(5, introduce);
		
			// 실행 + 결과처리
			if(pstmt.executeUpdate() == 1 ) {
				req.setAttribute("r", "[등록 성공]");
			}
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "[등록 실패]");
		}
		BeaverDBManager.close(con, pstmt, null);
		
		
		
		
		
	}
	
	
	
}
