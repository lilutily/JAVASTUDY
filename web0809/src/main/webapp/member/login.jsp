<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page import="java.sql.*" %>
<%!
	String url="jdbc:oracle:thin:@localhost:1521:XE";
	String user="java";
	String password="1234";
%>
<%
	/* 클라이언트가 전송한 아이디, 패스워드를 DB에서 조회하여 만일 가입된 회원이면
		Tomcat이 추후에 다시 접속해도 기억을 해준다
		
		jsp의 내장객체 중 session 이라는 객체가 바로 세션을 구현해 준다...
		최초의 접속자가 들어오면, 세션객체를 생성한 후 고유ID를 할당하고, 다시 이 I
		응답정보에 심어놓아(쿠키) 다음번 클라이언트 방문시 만일 이 ID가 존재한다면 아는체하고,
		없다면? 새로운 세션을 만들고 ID발급
	*/
	String user_id = request.getParameter("user_id");
	String pass = request.getParameter("pass");
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con =null;
	PreparedStatement pstmt = null;
	ResultSet rs= null;
	
	con=DriverManager.getConnection(url, user, password);
	String sql="select * from member where user_id=? and pass=?";
	
	pstmt = con.prepareStatement(sql);
	pstmt.setString(1, user_id);
	pstmt.setString(2, pass);
	rs=pstmt.executeQuery();
	
	String sid = session.getId();
	out.print("당신이 할당받은 세션 ID : " +sid);
	
	if(rs.next()) { // 커서를 내렸을때 다음 레코드가 있다면.. 즉 회원이 존재한다면
		// 세션 인스턴스에는 개발자가 넣고 싶은 데이터를 넣을 수 있는데, map 구조로 되어있다.
		// java collection framework : 자료구조	java.util
		// map구조는 key-value의 쌍으로 데이터를 처리하는 방법을 말한다.
		session.setAttribute("user_id", rs.getString("user_id"));
		session.setAttribute("pass", rs.getString("pass"));
		session.setAttribute("regdate", rs.getString("regdate"));
		
		out.print("정보 <br> ");
		out.print("ID : " + session.getAttribute("user_id") +"<br>");
		out.print("PW : " + session.getAttribute("pass") +"<br>");
		out.print("가입일 : " + session.getAttribute("regdate") +"<br>");
	}
	else {
		out.print("<script>");
		out.print("alert('회원정보가 올바르지 않습니다');");
		out.print("history.back();"); // 브라우저 뒤로 가기
		out.print("</script>");
	}
	
	// db 자원해제
	if(rs!=null) rs.close();
	if(pstmt!=null) pstmt.close();
	if(con!=null) con.close();

	
%>