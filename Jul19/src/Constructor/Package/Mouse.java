package Constructor.Package;

public class Mouse {
	String name;
	int price;
	static String maker="logetech";
	
	//생성자들
	public Mouse() {
		// TODO Auto-generated constructor stub
	}
	
	// 많이 사용함
	public Mouse(String name, int price) {
		super();
		// super은 지워도 되긴함
		this.name = name;
		this.price = price;
	}
	public void printM() {
		System.out.println(name);
		System.out.println(price);
	}
	
	
	

}

