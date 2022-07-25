package jdbc_package;

import java.sql.*;

public class jdbc_play {

	 public static void main(String[] args) throws SQLException {
		
		// 어제가 내일 그러면 오늘 금요일 -> 그러면 오늘은? 1 2 3 4 5 6 7 
	        // jdbc 드라이버를 로딩하고 접속하는 과정이 필요
	        Connection conn;  // database에 연결할때 사용하는 레퍼런스변수
	        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root", "");
	        System.out.println("접속 성공");

	        
	      
	        // jdbc를 이용해서 어떤작업(저장/검색/삭제/수정)을 실행하는 부분
	        // jdbc는 프리페어드라는 기능을 사용할수있음.(Prepared)
	        // 이 기능은 SQL명령어에서 특정한 부분(데이터가 들어가는)을 변수 처리한다음 나중에 채워주는 방식
	        //== insert 부분=================================================================//
	       //  String str = "INSERT INTO table_sample(m_name,m_phone) VALUES(?, ?)";
	      //  PreparedStatement p_stmt;
         //   p_stmt=conn.prepareStatement(str);            
        //    p_stmt.setString(1, "admin");
        //    p_stmt.setString(2, "010-1245-9983");
	        //== insert 부분=================================================================//
	     
	       //== delete 부분 ================================// 
	          String str = "DELETE FROM table_sample";	 	
	          PreparedStatement p_stmt = null;
	          p_stmt=conn.prepareStatement(str);
	       //== delete 부분 ================================//
	           
	           
	            
	            // 서버로 SQL명령어를 전송한다
	            p_stmt.execute();
	            // JDBC 사용시 발생할수 있는 에러를 처리하는 부분(Exception) 
	       
	         
	    } 
	}