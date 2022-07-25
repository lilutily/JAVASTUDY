package Jul20.lilutily.jul20.main;

import java.util.Scanner;

import Jul20.lilutily.jul20.human.Human;

public class OMain {
public static void main(String[] args) {
	Human h = new Human("나", 19);
	h.print();
	
	Scanner scan = new Scanner(System.in);
	System.out.print("수정할 이름 : ");
	String name=scan.nextLine();
	System.out.print("수정할 나이 : ");
	int age =scan.nextInt();
	
//	h.name=name;
//	h.age=age;
	h.setName(name);
	h.setAge(age);
	
	h.print();
	} 			
} 