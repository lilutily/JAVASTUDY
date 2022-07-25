package MemberInfoPackage;
import java.sql.*;
import java.util.Scanner;

public class MemberInfo_Class {
	private String m_name;
	private String m_id;
	private String m_pw;
	private String m_phone;
	private Connection conn;
	private ResultSet rs;
	

	public void setMember() {
		//Scanner 클래스를 이용한 사용자 입력부분 처리
		Scanner input = new Scanner(System.in);
		System.out.print("이름을 입력해주세요 : "); 
		m_name=input.nextLine();
		System.out.print("휴대폰 번호를 입력해주세요 : "); 
		m_phone=input.nextLine();
		System.out.print("아이디를 입력해주세요 : "); 
		m_id=input.nextLine();
		System.out.print("패스워드를 입력해주세요 : "); 
		m_pw=input.nextLine();
		
	}
	public void putMember() {
		// 회원의 모든 정보를 출력
		System.out.println(m_name+" "+m_phone+" "+m_id+" "+m_pw);

	}
	
	
	public void setName(String n) {
		Scanner input = new Scanner(System.in);
		System.out.print("검색하실 이름을 입력해주세요 : ");
		if(n.equals(m_name)) {
			m_name=input.nextLine();
			System.out.println(m_name);
		} else System.out.print("존재하지 않는 이름입니다. ");
			return;
	}
	
	public void sign() throws SQLException {
		// database에 연결할때 사용하는 레퍼런스변수
		Scanner input = new Scanner(System.in);
		System.out.print("이름을 입력해주세요 : "); 
		m_name=input.nextLine();
		System.out.print("휴대폰 번호를 입력해주세요 : "); 
		m_phone=input.nextLine();
		System.out.print("아이디를 입력해주세요 : "); 
		m_id=input.nextLine();
		System.out.print("패스워드를 입력해주세요 : "); 
		m_pw=input.nextLine(); 
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
        conn.close();
	}
	
	public int select() {
		try {
			// database에 연결할때 사용하는 레퍼런스변수
	        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/member_db","root", "");
	        
			PreparedStatement pst = conn.prepareStatement("SELECT userPassword FROM user WHERE userID = ?");
			pst.setString(1, m_id);
			rs = pst.executeQuery();
			if (rs.next()) {
				return rs.getString(1).equals(m_pw) ? 1 : 0;
			} else {
				return -2;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
	public boolean ID_Check(String m_id) { // 중복체크
		try {
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM user WHERE userID = ?");
			pst.setString(1, m_id);
			rs = pst.executeQuery();
			if (rs.next()) {
				return false;
			} else {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public String getMembername() {return(m_name);}
	public String getMembernumber() {return(m_phone);}
	public String getMemberid() {return(m_id);}
	public String getMemberpw() {return(m_pw);}
	
	
	
}
