package com.lilutily.Jul26.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class NWMain6 {
	public static void main(String[] args) {
		String addr = "https://api.openweathermap.org/data/2.5/weather?q=seoul&appid=baff8f3c6cbc28a4024e336599de28c4";
		try {
			URL u = new URL(addr);
			HttpsURLConnection huc = (HttpsURLConnection) u.openConnection();
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
//			BufferedReader br = new BufferedReader(isr);
//			System.out.println(br.readLine());

			
			// �ϸ鼭 ���ο� ���ߵȴٰ� �����ؼ� jsonobject coord�� ���� ���ߵȴٰ� �����ع���
			JSONParser jp = new JSONParser();
			JSONObject jo = (JSONObject) jp.parse(isr);
			JSONArray ja = (JSONArray) jo.get("weather");
			// ������ �ͼ� ������ ���� ��������
			JSONObject station = (JSONObject) ja.get(0);
			System.out.println(station.get("id"));
			System.out.println(station.get("main"));
			System.out.println(station.get("description"));
			System.out.println(station.get("icon"));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
