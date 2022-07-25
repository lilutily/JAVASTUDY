package Jul20.lilutily.jul20.human;
public class Human {
	// 캡슙화 : 
	// 앞으로 멤버 변수들은 private 해주는것이 약속이다
	private String name;
	private int age;
	public Human() {
		// TODO Auto-generated constructor stub
	}
	
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void print() {
		System.out.println(name);
		System.out.println(age);
	}
}
