package com.lilutily.Jul28.main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;




public class NWMain {
	public static void main(String[] args) {
		String addr ="https://www.naver.com/";
		InputStream is =null;
//while ������ close ���� �ع����ٸ�? ����Ʈ�� �����ϴ� ���°� �ǹ���
			try {
				URL u =new URL(addr);
				Thread.sleep(3000);
				HttpsURLConnection huc = (HttpsURLConnection) u.openConnection();
				is = huc.getInputStream();
				InputStreamReader isr = new InputStreamReader(is, "utf-8");
				BufferedReader br = new BufferedReader(isr);
				String line = null;
				while ((line =br.readLine()) != null) {
					System.out.println(line);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} try {is.close();} catch (IOException e) {}
	}
}
