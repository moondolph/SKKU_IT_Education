<%@page import="java.net.URLEncoder"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link 隔嬢辞 css尻衣背辞 荷耕奄>
</head>
<body>
	<% 
	request.setCharacterEncoding("EUC-KR"); // post号縦拭辞 戚暗 照馬檎 廃越 凹閃辞 蟹身 
	
	response.setCharacterEncoding("EUC-KR");
	// 督析戚 穣稽球 吃 辞獄雌税 虹希税 箭企井稽
	String path = request.getServletContext().getRealPath("img");
	System.out.println(path); //箭企 井稽税 是帖
	
	//督析 穣稽球
	MultipartRequest mr = new MultipartRequest(
			request, path,
	//買遂拝 督析税 置企 滴奄(byte)
			10 * 1024 * 1024,
	//推短督虞耕斗 昔坪漁 号縦
	"EUC-KR",
	//紫遂切亜 穣稽球廃 督析誤 掻差吃 凶 坦軒 
	//掻差獣拭 督析誤 及拭 収切研 細戚惟 馬澗 号縦
	new DefaultFileRenamePolicy());		
	
	
	
	String n = mr.getParameter("name");
	double h = Double.parseDouble(mr.getParameter("height"));
	double w = Double.parseDouble(mr.getParameter("weight"));
	w /= 100;
	String fileName = mr.getFilesystemName("picture");
	double bmi = w / (h*h);
	String result = "煽端掻";
	if(bmi >= 40){
		result = "壱亀搾幻";
	}else if (bmi >= 35){
		result = "掻装亀搾幻";
	}else if (bmi >= 30){
		result = "井亀搾幻";
	
	}else if (bmi >= 25){
		result = "引端掻";
	}else if (bmi >= 18.5){
		result = "舛雌";
	}
	
	
	
	
	fileName = URLEncoder.encode(fileName,"EUC-KR");
	
	String fileName2 = URLDecoder.decode(fileName, "EUC-KR");
	
	//BMI呪帖 => 社呪繊 却属切軒猿走幻 (** 焼掘拭辞澗 照鞠艦猿 食奄辞 背衣 !)
	
	
	%>
	<table>
		<tr>
			<th>BMI REsult</th>
		</tr>
		<tr>
			<td>戚硯</td>
			<td><%=a%>徹</td>
		</tr>
		<tr>
			<td>徹</td>
			<td><%=h%>cm</td>
		</tr>
		<tr>
			<td>倖巷惟</td>
			<td><%=w%>cm</td>
		</tr>
		<tr>
			<td>BMI</td>
			<td><%=height * 100 %>cm</td>
		</tr>
		<tr>
			<td>雁重精 <%=result%> 脊艦陥.</td>
		</tr>
		<tr>
			<td><img src="img/<%=img%>" style="max-width: 60%; height: auto;"></td>
		</tr>
	
	
	</table>
</body>
</html>


                                                                                                                                                                                                                                                                                   そそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそそいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいいぉぉぉぉぉぉぉぉぉぉぉぉぉぉぉぉぉぉぉぉぉぉぉぉぉせ                                                                                                                                                                                                                                                                       
<!--辞鷺鹸生稽 衣引 姥薄 or JSP稽 衣引 姥薄 食奄澗 JSP稽 廃暗績 -->