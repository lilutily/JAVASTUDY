package com.lilutily.Jul22.main;

import com.lilutily.Jul22.product.Monitor;
import com.lilutily.Jul22.product.Mouse;
import com.lilutily.Jul22.product.Product;

public class OMain2 {
	public static void main(String[] args) {
		Product p = new Product();
		p.print();
		Product p1 = new Mouse();
		p1.print();
		Product p2 = new Monitor();
		p2.print();		
	}
}
