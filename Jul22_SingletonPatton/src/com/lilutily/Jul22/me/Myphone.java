package com.lilutily.Jul22.me;

public class Myphone {
	private String name;
	private String p_number;
	
	private static final Myphone mp = new Myphone("갤럭시 S20+","010-1234-5678");
//	public static final Myphone mp = new Myphone("갤럭시 S20+","010-1234-5678");
	//public으로 써도 되긴함 (final이 붙어있으니까 외부에서 수정못)
	public static Myphone getMp() {
		return mp;
	}
	private Myphone() {
		// TODO Auto-generated constructor stub
	}
	private Myphone(String name, String p_number) {
		super();
		this.name = name;
		this.p_number = p_number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getP_number() {
		return p_number;
	}
	public void setP_number(String p_number) {
		this.p_number = p_number;
	}
	
}
