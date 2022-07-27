package com.lilutily.Jul26.main;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

// data.go.kr
// data.seoul.go.kr
// data.gg.go.kr
// 포털 사이트 // 네이버 // 카카오 에서 데이터 파싱해보기
/*
 *  <MSRRGN_NM>도심권</MSRRGN_NM>
	<MSRSTE_NM>중구</MSRSTE_NM>
	<PM10>21</PM10>
	<PM25>12</PM25>
	<IDEX_NM>보통</IDEX_NM>
*/
public class NWMain {
	public static void main(String[] args) {
		String addr="http://openapi.seoul.go.kr:8088/575a4655496b636839386f58586542/xml/RealtimeCityAir/1/25/";
		InputStream is =null;
		try {
			URL u = new URL(addr);
			HttpURLConnection huc = (HttpURLConnection) u.openConnection();
			is = huc.getInputStream();
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp= xppf.newPullParser();
			xpp.setInput(is,"utf-8");
			int what = xpp.getEventType();
			String t = null;
			while(what !=XmlPullParser.END_DOCUMENT) {
				if(what == XmlPullParser.START_TAG) {
					t= xpp.getName();
				} else if(what ==XmlPullParser.TEXT) {
					if(t.equals("MSRRGN_NM")) {
						System.out.print(xpp.getText()+" ");
					} else if(t.equals("MSRSTE_NM")) {
						System.out.print(xpp.getText()+" ");
					} else if(t.equals("PM10")) {
						System.out.printf("%s㎍/㎥ ", xpp.getText());;
					} else if(t.equals("PM25")) {
						System.out.printf("%s㎍/㎥ \r\n", xpp.getText());
					} else if(t.equals("IDEX_NM")) {
						System.out.print(xpp.getText()+" ");						
					}
				} else if(what ==XmlPullParser.END_TAG) {
					t="";
				}
				xpp.next();
				what=xpp.getEventType();
			} 
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
