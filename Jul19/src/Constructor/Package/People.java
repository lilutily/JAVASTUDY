package Constructor.Package;

public class People {
	String name;
	int age;
	static Terraforming home = new Terraforming("지구");
	public People() {
		// TODO Auto-generated constructor stub
	}
	public People(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void printP() {
		System.out.println(name);
		System.out.println(age);
	}
}
