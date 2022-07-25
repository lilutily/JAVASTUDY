package jdbc_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Member {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn;  // database에 연결할때 사용하는 레퍼런스변수
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root", "");
        System.out.println("접속 성공");

        String str = "INSERT INTO table_sample(m_name,m_phone) VALUES(tname, tid, tpw, tnumber)";
	       PreparedStatement p_stmt;
          p_stmt=conn.prepareStatement(str);            
          p_stmt.setString(1, "admin");
          p_stmt.setString(2, "010-1245-9983");
	}

}
