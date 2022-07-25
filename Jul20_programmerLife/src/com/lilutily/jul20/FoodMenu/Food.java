package com.lilutily.jul20.FoodMenu;

public class Food {
	String name;
	int price;
	
	public Food() {
		// TODO Auto-generated constructor stub
	}

	public Food(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(price);
	}
}
