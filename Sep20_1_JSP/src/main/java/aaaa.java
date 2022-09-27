
public class aaaa {
public static void main(String[] args) {
	
	for(int i=2;i<=9;i++) {
		System.out.printf("<%d> ",i);
	}	
		System.out.println();
	
	for(int j=1;j<=9;j++){
		for(int i=2;i<=9;i++){
			System.out.printf("%2d  ",i*j);
		}
		System.out.println();
	}
	
	
}
}
<%
	for(int i=2;i<=9;i++){
	%> 
	<table border>
	
	<%="<i´Ü>"%>
<%}%>	
	<%="<hr>"%>

<%for(int j=1;j<=9;j++){
	for(int i=2;i<=9;i++){%>
		<%=("%2d  ",i*j)%><%}%>
	<%="<hr>"%>
<%}%>  