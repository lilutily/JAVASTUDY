package Import.Pakage;

public class Article {
	String name;
	int price;
	public Article() {
		// TODO Auto-generated constructor stub
	}
	public Article(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public void print() {
		System.out.println(name);
		System.out.println(price);
	}
}
