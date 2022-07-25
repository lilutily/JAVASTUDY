package MemberInfoPackage;
import java.sql.*;
import java.util.Scanner;


public class MemberInfo_Play {

	public static void main(String[] args) throws SQLException {
		// jdbc 드라이버를 로딩하고 접속하는 과정이 필요
       
        MemberInfo_Class md = new MemberInfo_Class();
       
			
			
			
			 boolean isExit = false;
				do {
					Scanner input = new Scanner(System.in);
					System.out.println("1. 회원정보등록"); 
				//  String sign=input.nextLine();
					System.out.println("2. 회원정보 불러오기"); 
				//	String ProductA=input.nextLine();
					System.out.println("3. 회원정보 출력하기"); 
				//	String select=input.nextLine();
					System.out.print("번호 선택 : "); 
			int menu = Integer.parseInt(input.nextLine());
			
			switch(menu) {
			case 1: // //회원정보등록00
			{
				md.sign();
				
			}				
			break;
			case 2: // 회원정보 불러오기
			{
				md.putMember();
					
			}		
				break;
			case 3: // 회원정보 출력하기
			{
				md.select();
				}
			case 4: // 종료
				isExit =true;
				break;
			}
		} while(!isExit);	
		
        	
         
       /* 	
          Connection conn;  // database에 연결할때 사용하는 레퍼런스변수
        	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/member_db","root", "");
        		MemberInfo_Class s = new MemberInfo_Class();
                s.setMember();
        		//정보반환 
        		String m_name=s.getMembername();
        		String m_phone=s.getMemberid();
        		String m_id=s.getMemberpw();
        		String m_pw=s.getMembernumber();
        		
        		String str = "INSERT INTO member_t(m_name,m_phone,m_id,m_pw) VALUES(?,?,?,?)";
        	    PreparedStatement p_stmt;
                p_stmt=conn.prepareStatement(str);
                p_stmt.setString(1, m_name);
                p_stmt.setString(2, m_phone);
                p_stmt.setString(3, m_id);
                p_stmt.setString(4, m_pw);
                    
                int result = p_stmt.executeUpdate();
                if(result == 1) System.out.println("저장성공"); else System.out.println("저장실패");
                s.putMember();
                conn.close(); */
          	       
	}

}
/*
 * 데이터베이스에 저장될 데이터들의 타입과 동일한 멤버변수들을 가지고있음
 * 기존적인 get/set/putter 들을 가지고있음
 * 데이터베이스에 접속하고 SQL을 처리하는 메소드를 가짐
 * -접속정보는 "localhost"의 "3306"번 포트, 접속아이디 "root", 암호는 "" - 일단은 member_t 테이블에 저장하는 용도로만 제작(INSERT)
 * 작업이 끝나면 반드시 종료(close)
 * 검색기능을 추가한다. (일단 한가지 필드로만 검색이 가능하도록한다. ex)이름)
 * -검색어를 입력받는 기능을 구현함.
 * 입력받은 검색어를 SQL과 조합하는 부분을 구현(PrepareStatement)
 * 완성된 SQL을 서버로 전송
 * 받아온 결과를 검사해서 결과가있으면 출력, 없으면 에러 메시지 출력
 * */
