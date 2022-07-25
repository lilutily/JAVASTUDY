package com.lilutily.jul20.Animal;
/**
 * 
 * @author 에스엘아카데미
 *
 */
public class Cat {
	String name;
	int age;
	public Cat() {
		// TODO Auto-generated constructor stub
	}
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void cat_print() {
		System.out.println(name);
		System.out.println(age);
	}
}

/*
 * 이런 소스가 아니라 다른 소스를 줌
 * export해서 줬었는데...
 * Export -> JAR File
 */
