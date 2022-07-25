package Import.Pakage;

public class Book extends Article {
	String writer;
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(String name, int price, String writer) {
		super(name, price);
		this.writer = writer;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println(writer);
	}
}
