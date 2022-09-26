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
	
	// ��� ��� ������ �� ��������
	public void getAllApples(HttpServletRequest req) {
		Connection con  = null;
		PreparedStatement pstmt = null;
		
		ResultSet rs = null;
		
		try {
			con = BeaverDBManager.connect("beaverPool");
		
			// sql�� �ۼ� 
			String sql = "select * from sep26_apple order by a_price";
			pstmt = con.prepareStatement(sql);
			
			// C / U / D : pstmt.executeUpdate()�� ���� 
			//		=> ������ �� �� ������ �޾Ҵ��� 
			// R : pstmt.executeQuery()�� ����
			//		=> select ����� ResultSet���� ���� 
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
	
	//����ϱ�
	public void reg(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = BeaverDBManager.connect("beaverPool");
			
			//������ �Է�
			req.setCharacterEncoding("EUC-KR");
			String location = req.getParameter("a_location");
			String color = req.getParameter("a_color");
			String flavor = req.getParameter("a_flavor");
			int price = Integer.parseInt(req.getParameter("a_price"));

			// <textArea>���� ����ģ�� : \r\n
		
			// ������������ �ٹٲٱ� : <br>
			String introduce = req.getParameter("a_introduce");
		
			// sql�� �ۼ� (�̿ϼ�) - ������ � ���� ������ �𸣱� ������ 
			String sql = "insert into sep26_apple values(?, ?, ?, ?, ?)";
		
			// DB���� �Ѱ��Ŵ���(pstmt)
			pstmt = con.prepareStatement(sql);
			
			//sql�ϼ�
			pstmt.setString(1, location);
			pstmt.setString(2, color);
			pstmt.setString(3, flavor);
			pstmt.setInt(4, price);
			pstmt.setString(5, introduce);
		
			// ���� + ���ó��
			if(pstmt.executeUpdate() == 1 ) {
				req.setAttribute("r", "[��� ����]");
			}
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "[��� ����]");
		}
		BeaverDBManager.close(con, pstmt, null);
		
		
		
		
		
	}
	
	
	
}
