package com.lilutily.Jul29.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

// �ڹ� ���α׷� -> DB ���� ��� ����� ���� ����� ����

public class DBMain {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			String addr="jdbc:oracle:thin:@192.168.25.10:1521:xe"; // ����Ŀ���� �ۼ��ϴ� ������ �ٸ�
			conn = DriverManager.getConnection(addr, "lilutily", "9902");
//			������ sql�� �ۼ�
			String sql ="insert into run2 values(run2_seq.nextval, '01022154545','ABC��')";
			pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, "90119090");
			pstmt.setString(2, "��");
			int a = pstmt.executeUpdate(); // sql���� -> ���� - > ����ޱ�
			if(a >=1) {
				System.out.println("������ �Է� �Ϸ�");
			} 
//			System.out.println("login");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} try {pstmt.close();} catch (Exception e1) {} // �������� ���� ���� �ݾ��ִ°�
		try {conn.close();} catch (Exception e){}
	}
}
