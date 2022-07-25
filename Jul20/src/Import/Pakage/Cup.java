package Import.Pakage;

public class Cup extends Article {
	String size;
	public Cup() {
		// TODO Auto-generated constructor stub
	}
	
	public Cup(String name, int price, String size) {
		super(name, price);
		this.size = size;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println(size);
	}
}
