package MemberInfoPackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

	public class Play {

	public static void main(String[] args) throws SQLException {

		Connection conn;//database 에 연결할때 사용하는 레퍼런스변수
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/member_db", "root", "");
		java.sql.Statement stmt = conn.createStatement() ;
		String query = "select * from member_t";
		ResultSet rs = stmt.executeQuery(query);
		
	 //	stmt.excuteQuery(SQL) : select

		while(rs.next())
	 // if(rs.next())

    {

     System.out.println("현재처리하고있는 레코드의 번호: "+ rs.getRow()); 

     System.out.println( (String)rs.getObject(1)  
  // System.out.println( (String)rs.getObject(1));  

         + (String)rs.getObject(2) 

         + (String)rs.getObject(3)

         + (String)rs.getObject(4)); 

    		}     
		}
	}