package web0809.board;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* 수정 요청을 처리하는 서블릿 */
public class EditServlet extends HttpServlet{
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String board_id = request.getParameter("board_id");
		String sql="update board set title=?, writer=?, content=?";
		sql += "where board_id="+board_id;
		PrintWriter out = response.getWriter();
		out.print(sql);
	}
}
