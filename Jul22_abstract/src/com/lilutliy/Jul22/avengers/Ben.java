package com.lilutliy.Jul22.avengers;

public class Ben extends MemberInfo {
	private int size;
	public Ben() {
		// TODO Auto-generated constructor stub
	}
	public Ben(String name, int age, int size) {
		super(name, age);
		this.size = size;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println(size);
	}
	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		System.out.println("찢");
	}
	@Override
	public void d() {
		// TODO Auto-generated method stub
		
	}

}
