package isA.Package;

public class OMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성자 없이
		// 컴퓨터
		// 이름, 가격, cpu, ram, hdd
		// 정보 출력
		
		Computer c = new Computer();
		c.name="ASUS";
		c.price=1450000;
		c.cpu="i9-8700K";
		c.ram="16G";
		c.hdd="1T";
		
		c.print();
		System.out.println("======================");
		// 노트북 / 이름, 가격, cpu, ram, hdd, weight, 배터리 
		// 정보 출력
		Notebook nb = new Notebook();
		nb.name="LG 그램";
		nb.price=2000000;
		nb.cpu="i7-9700K";
		nb.ram="32G";
		nb.hdd="500G";
		nb.weight=2.3;
		nb.bettery_time=2;
		nb.print();
	}

}
