package Constructor.Package;

public class Pen {
	String name;
	int price;
	String color;
	public Pen() {
		// TODO Auto-generated constructor stub
	}
	public Pen(String name, int price, String color) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
	}
	public void printP() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(color);
	}
}
