package com.lilutily.jul20.pen;

import java.nio.channels.Pipe;

public class Pen {
	String name;
	int price;
	public Pen() {
		// TODO Auto-generated constructor stub
	}
	public Pen(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public void print() {
		System.out.println(name);
		System.out.println(price);
	}
}
