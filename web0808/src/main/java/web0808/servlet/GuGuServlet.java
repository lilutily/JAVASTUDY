package web0808.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GuGuServlet extends HttpServlet {
	@Override
	// POST 등을 명시하지 않는 한 기본적으로 브라우저의 요청을 default가 GET방식이고, GET방식으로 들어온 요청은
	// doGet() 메서드가 처리한다
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter(); // 문자기반의 출력 스트림	
		// jsp가 아닌 서블릿을 직접 작성하여 사용할 경우 단점
		// 디자인 코드에 취약.. 너무 효율성이 떨어진다.. 모든 html을 문자열취급하여 쌍따옴표 안에 넣어야한다.
		// 만일 아래와 같이 단순한 html이 아니라, 엄창난 태그를 갖는 html 페이지 경우 개발이 힘들어진다.
		// 결론 : 개발시 디자인 코드가 들어가지않는 컨트롤러 등에 사용하기 적당
		out.print("<table width='200px' border='1px'>");
		for(int i=1; i<=9; i++) {
		out.print("<tr>");
		out.print("<td>5*"+i+"="+(i*5)+"</td>");
		out.print("</tr>");
		}
		out.print("</table>");
	}

}
