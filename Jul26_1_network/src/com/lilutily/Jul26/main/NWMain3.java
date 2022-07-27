package com.lilutily.Jul26.main;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.lilutily.Jul26.stringclass.StringCleaner;
// https://openapi.naver.com/v1/search/news.xml
// 주소/?/변수명 = 값/&/변수명 = 값/
// 하면서 느낀것 : 코딩하는데 순서가 중요함
// https://developers.naver.com/docs/serviceapi/search/news/news.md#%EB%89%B4%EC%8A%A4
public class NWMain3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 : ");
		String q =scan.next();
		InputStream is = null;
		try {
			q=URLEncoder.encode(q,"utf-8"); // 주소창을 utf-8형식으로바꿈
			String addr="https://openapi.naver.com/v1/search/news.xml?sort=sim&display=50&query="+q;
			URL u = new URL(addr);
			HttpURLConnection huc = (HttpURLConnection) u.openConnection();
			huc.addRequestProperty("X-Naver-Client-Id","ERPZTWwjHAxnCnarI8us");
			huc.addRequestProperty("X-Naver-Client-Secret","Mnbc34aR0p");
			is = huc.getInputStream();
//			InputStreamReader isr = new InputStreamReader(is, "utf-8");
//			BufferedReader br = new BufferedReader(isr);
//			System.out.println(br.readLine());
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp= xppf.newPullParser();
			xpp.setInput(is,"utf-8"); // xml을 utf-8로 
			int what = xpp.getEventType(); // 지금 커서가 ts.xml의 첫번째 줄<rss> 에 가있는상황 
			String t = null;
			boolean data = false;
			while (what !=1) { // 탐색이 끝날때까지 반복한다 여기서 1은 탐색이 끝날때 출력되는 값이라 1로 입력해도된다. (XmlPullParser.END_DOCUMENT) 이것도 가능 
				if(what == XmlPullParser.START_TAG) { //<>안에 있는걸 의미함
					t=xpp.getName();
					if(t.equals("item"))
						data = true;
				}
				else if(what == XmlPullParser.TEXT) { // 텍스트일때
					if(data) {
						if(t.equals("title")) {
							System.out.println(StringCleaner.clean(xpp.getText()));
						}
						else if(t.equals("description")) {
							System.out.println(StringCleaner.clean(xpp.getText()));
						}
						else if(t.equals("pubDate")) {
							System.out.println(StringCleaner.clean(xpp.getText()));
						}
					}
				} 
//				else if(what== XmlPullParser.END_TAG) { // 아까까지 쓴 이유는 띄워쓰기 한칸이 있기때문에 그것을 없애줄려고 t="";해준것 근데 여기서는 없으니 써줄필요가있을까?
//				}
				xpp.next();
				what=xpp.getEventType();
			} scan.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}try {is.close();} catch (IOException e) {e.printStackTrace();}
	}
}
