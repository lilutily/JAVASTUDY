package com.lilutily.Jul26.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class NWMain4 {
	public static void main(String[] args) {
		
		try {
			String addr = "http://openapi.seoul.go.kr:8088/575a4655496b636839386f58586542/json/CardSubwayStatsNew/1/548/20151101";
			URL u = new URL(addr);
			HttpURLConnection huc = (HttpURLConnection) u.openConnection();
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");			
//			BufferedReader br = new BufferedReader(isr);
//			System.out.println(br.readLine());
			// {} : ��ü
			// [1,2,3] : �迭
			
			JSONParser jp = new JSONParser();
//			JSONArray = jp.parse(isr) // [ ���� ���۵Ǹ� array
			JSONObject jo = (JSONObject) jp.parse(isr); // { �����̴� ��ü��
			JSONObject cssn = (JSONObject) jo.get("CardSubwayStatsNew");
			JSONArray r=  (JSONArray) cssn.get("row");
			for(int i=0; i<r.size(); i++) {
				JSONObject station = (JSONObject) r.get(i);
				System.out.println(station.get("RIDE_PASGR_NUM"));
				System.out.println("===========");
			} 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
