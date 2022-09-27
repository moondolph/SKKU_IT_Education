<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="CalcController" name="calcForm"
		onsubmit="return calcCheck();">
		<table border="1" width=500 height=500 align="center">
			<tr>
				<td>
					<table id="calcTbl" border="1" width=250 height=250 align="center">

						<tr>
							<td align="center">x: <input placeholder="x"
								autofocus="autofocus" autocomplete="off" name="x"></td>
						</tr>

						<tr>
							<td align="center">y: <input placeholder="x"
								autocomplete="off" name="y"></td>
						</tr>

						<tr>
							<td align="left"><button>계산</button></td>
						</tr>

					</table>

				</td>
			</tr>
		</table>
	</form>
</body>
</html>