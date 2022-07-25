package Jul.Package;

public class OMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Cumputer.MADE);
		System.out.println(Math.PI);
	//	Math.PI = 1234;
		
		Cumputer cc = new Cumputer();
		
		cc.cpu="i7-10600KF";
		cc.ram="16G";
		cc.hdd="1T";
	//	cc.made="APPLE";
		
		cc.print();
	}

}
