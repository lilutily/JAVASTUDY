package com.lilutily.Jul29.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

// 자바 프로그램 -> DB 서버 통신 기능은 따로 만들어 놨음

public class DBMain {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			String addr="jdbc:oracle:thin:@192.168.25.10:1521:xe"; // 메이커마다 작성하는 형식이 다름
			conn = DriverManager.getConnection(addr, "lilutily", "9902");
//			실헹할 sql문 작성
			String sql ="insert into run2 values(run2_seq.nextval, '01022154545','ABC샵')";
			pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, "90119090");
			pstmt.setString(2, "샵");
			int a = pstmt.executeUpdate(); // sql전송 -> 실행 - > 결과받기
			if(a >=1) {
				System.out.println("데이터 입력 완료");
			} 
//			System.out.println("login");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} try {pstmt.close();} catch (Exception e1) {} // 마지막에 연거 먼저 닫아주는것
		try {conn.close();} catch (Exception e){}
	}
}
