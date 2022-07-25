package com.lilutily.Jul22.Human;

public class Human {
	private String name;
	private int age;
	public Human() {
		// TODO Auto-generated constructor stub
	}
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void print() {
		System.out.println(name);
//		System.out.println(this.name); this를 붙이는게 정석이였었다.
		System.out.println(age);		
	}
//	public void print(String name) {
//		System.out.println(name); // 파라미터는 이 네임을 가르킨다.
//		System.out.println(age);		
//	}
}
