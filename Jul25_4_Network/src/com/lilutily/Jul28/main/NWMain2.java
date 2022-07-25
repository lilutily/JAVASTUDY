package com.lilutily.Jul28.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class NWMain2 {
	public static void main(String[] args) {
		String addr ="http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1154551000";
		try {
			URL u =new URL(addr);
//			Thread.sleep(3000);
			HttpURLConnection huc = (HttpURLConnection) u.openConnection();
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);
			String line = null;
			while ((line =br.readLine()) != null) {
				System.out.println(line);
				
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
}
}
