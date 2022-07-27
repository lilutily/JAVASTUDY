package com.lilutily.Jul28.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import java.net.URL;

import javax.swing.plaf.SeparatorUI;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public class NWMain3 {
	public static void main(String[] args) {
		String addr="http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4146353500";
		try {
			URL u = new URL(addr);
			HttpURLConnection huc = (HttpURLConnection) u.openConnection();
			InputStream is = huc.getInputStream();
//			InputStreamReader isr = new InputStreamReader(is, "utf-8");
//			BufferedReader br = new BufferedReader(isr);
//			XML(Extended Markup Language)
//			데이터를 HTML모양으로 표현해 놓은거
//			 DOM 객체
//			<xxx 속성명="값" 속성명="값" ...> : 시작태그
//				YYY : 글자
//			</xxx> : 종료태그
			
			XmlPullParserFactory xppf= XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is,"utf-8");
			int what = xpp.getEventType();
//			xpp.next();
			String t = null; // t는 else if문을 돌지않고 xpp.next()를 돈다
			// 여기서 text에 hour이 있으면 그때 else if문으로 들어감
			while(what !=XmlPullParser.END_DOCUMENT) { // 문서의 끝에 도달했을때 어떤 int의 값(값은 1인듯?)을주고 그전까지 계속 while을 돌림
//				while(what !=1) // 끝은 1이고 그전까지 돌린다
				if(what == XmlPullParser.START_TAG) { // 시작태그를 출력하고싶으면
//					System.out.println(xpp.getName());
					t = xpp.getName();
					// hour을 만났을때 start_tag에 들어가고 다시 next로 이동
					// 그러면 t = hour이 저장되어있음
				} else if(what == XmlPullParser.TEXT) { // 글자를 출력하고싶으면
					if(t.equals("hour")) {
						System.out.printf("%s시까지 ", xpp.getText()); 
						// getText ="\r\n" 임
					} 
					else if(t.equals("temp")) {
						System.out.printf("%sC ", xpp.getText()); 
					} else if(t.equals("wfKor")) {
						System.out.println(xpp.getText());
					}
//					System.out.println(xpp.getName()); 
				} else if(what == XmlPullParser.END_TAG) { // 종료태그를 출력하고싶으면 
//					System.out.println(xpp.getName());
					t="";
					// 기상청 rss 소스 코드를 보면 태그를 닫고 스페이스바를 한번 누르고 넘어감
					// xml 띄워쓰기까지 인식해버림
					// t의 값을 빈 스트링 값을 넣어둠 그래서 띄워쓰기한것을 아무것도 못하게 함
				} 
				xpp.next();
				what = xpp.getEventType();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
