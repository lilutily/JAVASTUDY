package com.lilutily.Jul22.Human;

public class UStudent extends Human {
	
	private String uni;
	public UStudent() {
		// TODO Auto-generated constructor stub
	}
	public UStudent(String name, int age, String uni) {
		super(name, age);
		this.uni = uni;
	}
	public String getUni() {
		return uni;
	}
	public void setUni(String uni) {
		this.uni = uni;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println(uni);
	}
	
	
	
}
