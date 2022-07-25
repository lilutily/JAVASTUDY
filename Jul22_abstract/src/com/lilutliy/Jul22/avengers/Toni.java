package com.lilutliy.Jul22.avengers;


// 아이언맨 -> 어벤져스
// 아이언맨 -> 사람
// 다중상속 : java 라는 언어가 지원해주지않음. 
// 뿐만 아니라 대두분의 언어는 상속을 지원해주지 않는다.
public class Toni extends MemberInfo {
	private String company;
	public Toni() {
		// TODO Auto-generated constructor stub
	}
	public Toni(String name, int age, String company) {
		super(name, age);
		this.company = company;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println(company);
	}
	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		System.out.println("졸림");
	}
	@Override
	public void d() {
		// TODO Auto-generated method stub
		
	}
}
