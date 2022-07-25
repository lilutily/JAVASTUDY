package Constructor.Package;

public class Dog {
	String name;
	int age;
	Student owner;
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	public Dog(String name, int age, Student owner) {
		super();
		this.name = name;
		this.age = age;
		this.owner = owner;
	}
	public void printD() {
		System.out.println(name);
		System.out.println(age);
		owner.printS();
	}
	
	
}
