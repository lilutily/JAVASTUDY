<%@ page contentType="text/html;charset=UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%!
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String user = "java";
	String password = "1234";
%>
<%
	// 스클립틀릿은 이 JSP가 톰캣에 의해 서블릿 클래스로 전환될때 service() 메서드의 영역
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection(url,user,password);
	
	String sql = "select * from order by board_id desc"; // 내림차순
	PreparedStatement pstmt = con.prepareStatement(sql); // 준비
	ResultSet rs = pstmt.executeQuery(); // 쿼리문 수행
	rs.next(); // 커서 한칸이동
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>
</head>
<body>
	<table width="100%" border="1px" align="center">
		<tr>
			<td>No</td>
			<td>제목</td>
			<td>작성자</td>
			<td>작성일</td>
			<td>조회수</td>
		</tr>
		<% while(rs.next()) { %>
		<tr>
			<td><a href="/board/content.jsp?board_id=<%=rs.getInt("board_id")%>"><%=rs.getString("title")%></a></td>
			<td><%=rs.getString("writer")%></td>
			<td><%=rs.getString("regdate")%></td>
			<td><%=rs.getInt("hit")%></td>
		</tr>
		<%} %>
		<tr>
			<td colspan="5" align="right">
				<!-- 하나의 문서내에서 생성되는 객체를 DOM이라하고, 문서밖 영역에서 브라우저를 제어하기 위해 생성되는 객체들을
				가리켜 비공식적으로 BOM(Browser Objecvt Model) -->
				<button onClick="location.href='/board/regist.jsp'">글등록</button>
			</td>
		</tr>
	</table>
</body>
</html>
<%
if(rs!=null) rs.close();
if(pstmt!=null) pstmt.close();
if(con!=null) con.close(); 
%>