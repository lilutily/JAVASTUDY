package com.lilutily.Jul22.Human;
// private 판정기준 : 현재 클래스가 기준이라 상속을 해줘도
// 게터를 통해 불러와야된다.
public class Sol extends Human {
	
	private String classes;
	public Sol() {
		// TODO Auto-generated constructor stub
	}
	public Sol(String name, int age, String classes) {
		super(name, age);
		this.classes = classes;
	}
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println(classes);
	}
	public void p_Name() {
		System.out.println(getName());
	}
	
	
	
}
