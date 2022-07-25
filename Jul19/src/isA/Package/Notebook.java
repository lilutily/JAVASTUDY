package isA.Package;

public class Notebook extends Computer {
	double weight;
	int bettery_time;
	
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println(weight);
		System.out.println(bettery_time);
	}
}
