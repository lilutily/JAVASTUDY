package com.lilutily.Jul26.main;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class NWMain5 {
	public static void main(String[] args) {
		String addr= "http://openapi.seoul.go.kr:8088/575a4655496b636839386f58586542/json/RealtimeCityAir/1/25/";
		try {
			URL u = new URL(addr);
			HttpURLConnection huc = (HttpURLConnection) u.openConnection();
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
//			BufferedReader br = new BufferedReader(isr);
//			System.out.println(br.readLine()); check 용도
			
			JSONParser jp = new JSONParser();
			JSONObject jo = (JSONObject) jp.parse(isr);
			JSONObject cssn = (JSONObject) jo.get("RealtimeCityAir");
			JSONArray ja = (JSONArray) cssn.get("row");
			System.out.println("미세먼지 상황\r\n");
			for(int i=0; i<ja.size(); i++) {
				JSONObject station = (JSONObject) ja.get(i);
				
				System.out.println(station.get("MSRSTE_NM"));
				System.out.println(station.get("IDEX_NM"));
				System.out.println("===========");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
