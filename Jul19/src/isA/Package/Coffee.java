package isA.Package;

public class Coffee extends CafeTeria {
	String size;
	String temp;
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println(size);
		System.out.println(temp);
	}
}
