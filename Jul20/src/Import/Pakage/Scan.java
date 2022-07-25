package Import.Pakage;

public class Scan extends Article {
	int kg;
	public Scan() {
		// TODO Auto-generated constructor stub
	}
	public Scan(String name, int price, int kg) {
		super(name, price);
		this.kg = kg;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println(kg);
	}

}
