// pen is computer -> x
// computer is product -> o


package isA.Package;

public class Computer extends Product {
	
	String cpu;
	String ram;
	String hdd;
	
	public void print() {
		super.Print();
//		System.out.println(name);
//		System.out.println(price);
		System.out.println(cpu);
		System.out.println(ram);
		System.out.println(hdd);
	}
}
