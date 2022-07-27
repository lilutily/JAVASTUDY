package com.lilutily.Jul26.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public class NWMain2 {
	public static void main(String[] args) {
		String addr="http://openapi.seoul.go.kr:8088/575a4655496b636839386f58586542/xml/RealtimeCityAir/1/25/";
		InputStream is =null;
		try {
			FileOutputStream fos = new FileOutputStream("C:\\javatest\\Jul26.txt", true); // 더 낮은 단계로 입력
			OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
			BufferedWriter bw = new BufferedWriter(osw);
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

