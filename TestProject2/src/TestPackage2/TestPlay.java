package TestPackage2;

import java.util.ArrayList;

public class TestPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Animal a= new Animal("소", 10000, false);
		a.AnimalInfo();
		
		
		Bird b = new Bird("chos", 4000, true);
		b.putBirdInfo(); 
		Bird b2 = new Bird(); 
		b2.putBirdInfo();
		b2.fly(); 
		
		Fish f = new Fish("방어", 100000, true);
		f.putFishInfo(); */
		ArrayList<Animal> AnimalList = new ArrayList<Animal>();
		Bird bw =new Bird("황새", 10000, true);
		Fish fw =new Fish("방어", 100000, true);
		AnimalList.add(bw);
		AnimalList.add(fw);
	//	Animal ob1 = AnimalList.get(0);
		// Bird ob1 = (Bird)AnimalList.get(0);
	//	Animal ob2 =AnimalList.get(1);
		// Fish ob2 = (Fish)AnimalList.get(1);
	//	Animal ob3 =AnimalList.get(2);
	//	bw.putBirdInfo(); 
	//	fw.putFishInfo(); 
		
		String objectType=AnimalList.get(0).getClass().getName();
		System.out.println("objectType :" + objectType);
	//	String objectType2=AnimalList.get(1).getClass().getName();
		
		
		//컨테이너에서 꺼내온 객체가 어떤타입인지를 알아볼때
		if("TestPackage2.Bird".equals(objectType)) {
			System.out.println("새다");
		}
		else if("TestPackage2.Fish".equals(objectType)) {
			System.out.println("물고기다");
		}
	}

}
