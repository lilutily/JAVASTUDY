package com.lilutily.Jul29.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public class InsertMain {
	public static void main(String[] args) {
//		String addr= "http://openapi.seoul.go.kr:8088/575a4655496b636839386f58586542/xml/RealtimeCityAir/3/3/";
		InputStream is =null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			String addr="jdbc:oracle:thin:@192.168.25.10:1521:xe"; // 메이커마다 작성하는 형식이 다름
			conn = DriverManager.getConnection(addr, "lilutily", "9902");
			String sql ="insert into live values(run2_seq.nextval, '01022154545','ABC샵')";
			pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, "90119090");
			pstmt.setString(2, "샵");
			int a = pstmt.executeUpdate(); // sql전송 -> 실행 - > 결과받기
			if(a >=1) {
				System.out.println("데이터 입력 완료");
			} 
			FileOutputStream fos = new FileOutputStream("C:\\javatest\\Jul26.txt", true); // 더 낮은 단계로 입력
			OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
			BufferedWriter bw = new BufferedWriter(osw);
			URL u = new URL(addr);
			HttpURLConnection huc = (HttpURLConnection) u.openConnection();
//			is = huc.getInputStream();
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp= xppf.newPullParser();
//			xpp.setInput(is,"utf-8");
			int what = xpp.getEventType();
			String t = null;
			while(what !=XmlPullParser.END_DOCUMENT) {
				if(what == XmlPullParser.START_TAG) {
					t= xpp.getName();
				} else if(what ==XmlPullParser.TEXT) {
					if(t.equals("MSRDT")) {
						bw.write(xpp.getText()+",");
					} else if(t.equals("MSRRGN_NM")) {
						bw.write(xpp.getText()+",");
					} else if(t.equals("MSRSTE_NM")) {
						bw.write(xpp.getText()+",");
					} else if(t.equals("PM10")) {
						bw.write(xpp.getText()+",");
					} else if(t.equals("PM25")) {
						bw.write(xpp.getText()+",");
					} else if(t.equals("IDEX_NM")) {
						bw.write(xpp.getText()+"\r\n");				
					}
				} else if(what ==XmlPullParser.END_TAG) {
					t="";
				}
				xpp.next();
				what=xpp.getEventType();
				
			} 
			bw.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}