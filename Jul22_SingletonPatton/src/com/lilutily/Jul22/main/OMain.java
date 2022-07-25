package com.lilutily.Jul22.main;

import java.util.Calendar;

import com.lilutily.Jul22.me.Myphone;
import com.lilutily.Jul22.me.Myself;

public class OMain {
public static void main(String[] args) {
	//Myself me = new Myself();
	Myself me = Myself.getMe();
	Myself me2 = Myself.getMe();
	Myself me3 = Myself.getMe();
	System.out.println(me);
	System.out.println(me2);
	System.out.println(me3);
	
	// 객체를 만들때 new 를 쓰는것보다 이런식
	Calendar c = Calendar.getInstance();
	
	// 핸드폰 이름,번호 ONLY ONE
	
	Myphone mp = Myphone.getMp();
	System.out.println(mp);
}
}
