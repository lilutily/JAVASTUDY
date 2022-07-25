package Convenience_Store;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings({ "rawtypes", "unchecked", "nls" })
public class Product implements Serializable {
	private int Number;
	private String Name;
	private int Price;
	private int Count;
	private String Date_Limit; 
	
	public void ProductA(int no, String name, int price, int count, String dlimit) {
		Number=no;
		Name=name;
		Price=price;
		Count=count;
		Date_Limit=dlimit;
	}
	
	public void PrintAll() { // 모든 정보를 출력한다
		System.out.print(Number+Name+Price+Count+Date_Limit);
	}

	
	public static void main(String[] args) throws IOException, ClassNotFoundException{


		FileOutputStream fileStream = new FileOutputStream("C:\\Users\\에스엘아카데미\\eclipse-workspace\\read\\test.txt");

		BufferedOutputStream bufferedStream = new BufferedOutputStream(fileStream);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedStream);

		ArrayList<Product> userNames = new ArrayList<Product>();
		Product p1=new Product();
		Product p2=new Product();
		p1.ProductA(1, "water", 900, 100, "2099-12-31");
		p2.ProductA(2, "mon", 900, 100, "2999-12-31");
		userNames.add(p1);
		userNames.add(p2);;
		System.out.println("저장되었습니다");
		objectOutputStream.writeObject(p1);

		objectOutputStream.writeObject(p2);

		objectOutputStream.writeObject(userNames);
		objectOutputStream.close();//스트림들을 닫는다.
	}
}