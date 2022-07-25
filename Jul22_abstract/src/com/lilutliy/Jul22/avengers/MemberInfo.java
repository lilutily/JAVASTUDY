package com.lilutliy.Jul22.avengers;

import com.lilutily.Jul22.smoker.Smoker;

// abstract 클랙스 : 객체를 만들수가 없음
public abstract class MemberInfo implements Smoker {
	private String name;
	private int age;
	public MemberInfo() {
		// TODO Auto-generated constructor stub
	}
	public MemberInfo(String name, int age) {
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
		System.out.println(age);
	}
	
	// 어벤져스들의 공통적인 기능이라 만들었는데
	// 어벤져스라는게 추상적인 개념...
	// 만약에 abstract 메소드가 하나라도 있으면 그 클래스가 abstract
	public abstract void Attack();
}
