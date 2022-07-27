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

			
			// 하면서 메인에 들어가야된다고 생각해서 jsonobject coord로 먼저 들어가야된다고 생각해버림
			JSONParser jp = new JSONParser();
			JSONObject jo = (JSONObject) jp.parse(isr);
			JSONArray ja = (JSONArray) jo.get("weather");
			// 뇌정지 와서 생각이 굳음 ㄴㅁㅇㄹ
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
