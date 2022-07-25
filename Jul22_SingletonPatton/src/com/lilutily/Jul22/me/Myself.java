package com.lilutily.Jul22.me;
// static 멤버변수 -> 그 객체의 공통속성
public class Myself {
	private static String NAME="성태웅";
	private int age;
	private String bobby;
	// 2. 내부에서 만들기(수정불가능하게)
	private static final Myself me = new Myself(NAME,19,"loa");
	// 
	public static Myself getMe() {
		return me;
	}
	
	// Singleton Patton : 세상에 하나뿐인 객체
	// 언제쓰는지?
	// SPRING 						DB
	//SPRING에 객체가 들어오면 계속생성 -> 싱글톤패턴으로 하나의 객체로 만들어
	// 그 하나의 객체를 통해 DB로 전달
	
	// 1. 객체를 외부에서 못만들게 설정(생성자를 private)
	private Myself() {
		// TODO Auto-generated constructor stub
	}
	private Myself(String name, int age, String bobby) {
		super();
		this.NAME = name;
		this.age = age;
		this.bobby = bobby;
	}

	public static String getNAME() {
		return NAME;
	}

	public static void setNAME(String nAME) {
		NAME = nAME;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBobby() {
		return bobby;
	}

	public void setBobby(String bobby) {
		this.bobby = bobby;
	}

	
	
}
