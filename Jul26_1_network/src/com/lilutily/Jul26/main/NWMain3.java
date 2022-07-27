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
// �ּ�/?/������ = ��/&/������ = ��/
// �ϸ鼭 ������ : �ڵ��ϴµ� ������ �߿���
// https://developers.naver.com/docs/serviceapi/search/news/news.md#%EB%89%B4%EC%8A%A4
public class NWMain3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�Է� : ");
		String q =scan.next();
		InputStream is = null;
		try {
			q=URLEncoder.encode(q,"utf-8"); // �ּ�â�� utf-8�������ιٲ�
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
			xpp.setInput(is,"utf-8"); // xml�� utf-8�� 
			int what = xpp.getEventType(); // ���� Ŀ���� ts.xml�� ù��° ��<rss> �� ���ִ»�Ȳ 
			String t = null;
			boolean data = false;
			while (what !=1) { // Ž���� ���������� �ݺ��Ѵ� ���⼭ 1�� Ž���� ������ ��µǴ� ���̶� 1�� �Է��ص��ȴ�. (XmlPullParser.END_DOCUMENT) �̰͵� ���� 
				if(what == XmlPullParser.START_TAG) { //<>�ȿ� �ִ°� �ǹ���
					t=xpp.getName();
					if(t.equals("item"))
						data = true;
				}
				else if(what == XmlPullParser.TEXT) { // �ؽ�Ʈ�϶�
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
//				else if(what== XmlPullParser.END_TAG) { // �Ʊ���� �� ������ ������� ��ĭ�� �ֱ⶧���� �װ��� �����ٷ��� t="";���ذ� �ٵ� ���⼭�� ������ �����ʿ䰡������?
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
