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
//			�����͸� HTML������� ǥ���� ������
//			 DOM ��ü
//			<xxx �Ӽ���="��" �Ӽ���="��" ...> : �����±�
//				YYY : ����
//			</xxx> : �����±�
			
			XmlPullParserFactory xppf= XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is,"utf-8");
			int what = xpp.getEventType();
//			xpp.next();
			String t = null; // t�� else if���� �����ʰ� xpp.next()�� ����
			// ���⼭ text�� hour�� ������ �׶� else if������ ��
			while(what !=XmlPullParser.END_DOCUMENT) { // ������ ���� ���������� � int�� ��(���� 1�ε�?)���ְ� �������� ��� while�� ����
//				while(what !=1) // ���� 1�̰� �������� ������
				if(what == XmlPullParser.START_TAG) { // �����±׸� ����ϰ������
//					System.out.println(xpp.getName());
					t = xpp.getName();
					// hour�� �������� start_tag�� ���� �ٽ� next�� �̵�
					// �׷��� t = hour�� ����Ǿ�����
				} else if(what == XmlPullParser.TEXT) { // ���ڸ� ����ϰ������
					if(t.equals("hour")) {
						System.out.printf("%s�ñ��� ", xpp.getText()); 
						// getText ="\r\n" ��
					} 
					else if(t.equals("temp")) {
						System.out.printf("%sC ", xpp.getText()); 
					} else if(t.equals("wfKor")) {
						System.out.println(xpp.getText());
					}
//					System.out.println(xpp.getName()); 
				} else if(what == XmlPullParser.END_TAG) { // �����±׸� ����ϰ������ 
//					System.out.println(xpp.getName());
					t="";
					// ���û rss �ҽ� �ڵ带 ���� �±׸� �ݰ� �����̽��ٸ� �ѹ� ������ �Ѿ
					// xml ���������� �ν��ع���
					// t�� ���� �� ��Ʈ�� ���� �־�� �׷��� ��������Ѱ��� �ƹ��͵� ���ϰ� ��
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
