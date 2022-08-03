package com.lilutily.Jul29.main;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class FMain {
	public static void main(String[] args) {
		String addr2="http://openapi.seoul.go.kr:8088/575a4655496b636839386f58586542/json/RealtimeCityAir/3/3/";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			String addr="jdbc:oracle:thin:@192.168.25.10:1521:xe"; // ����Ŀ���� �ۼ��ϴ� ������ �ٸ�
			conn = DriverManager.getConnection(addr, "lilutily", "9902");
//			������ sql�� �ۼ�
			URL u = new URL(addr2);
			HttpURLConnection huc = (HttpURLConnection) u.openConnection();
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			JSONParser jp = new JSONParser();
			JSONObject jo = (JSONObject) jp.parse(isr);
			JSONObject cssn = (JSONObject) jo.get("RealtimeCityAir");
			JSONArray ja = (JSONArray) cssn.get("row");

				JSONObject station = (JSONObject) ja.get(0);
				String sql ="insert into live2 values(?,?,?,?)";
				System.out.println(station.get("MSRDT")); // date
				System.out.println(station.get("MSRSTE_NM")); // varchar primary
				System.out.println(station.get("IDEX_NM")); // varchar
				System.out.println(station.get("IDEX_MVL")); // number(3)
				pstmt =conn.prepareStatement(sql);
				pstmt.setString(1, (String) (station.get("MSRDT")));
				pstmt.setString(2, (String) station.get("MSRSTE_NM"));
				pstmt.setString(3, (String) station.get("IDEX_NM"));
				pstmt.setDouble(4, (double) station.get("IDEX_MVL"));
//				pstmt.setDate(1, "l_msrdt"); // ��¥
//				pstmt.setString(2, "l_msrste_nm");// ��ġ
//				pstmt.setString(3, "l_idex_nm"); 
//				pstmt.setDouble(4, "l_idex_mvl"); // �Ҽ���
						
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

