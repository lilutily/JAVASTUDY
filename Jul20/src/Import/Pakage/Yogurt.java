package Import.Pakage;

public class Yogurt extends Article {
	String date;
	public Yogurt() {
		// TODO Auto-generated constructor stub
	}
	
	public Yogurt(String name, int price, String date) {
		super(name, price);
		this.date = date;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println(date);
	}
}
