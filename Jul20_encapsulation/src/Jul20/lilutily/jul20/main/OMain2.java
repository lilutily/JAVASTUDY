package Jul20.lilutily.jul20.main;

import Jul20.lilutily.jul20.computer.Computer;

public class OMain2 {
	public static void main(String[] args) {
	Computer com = new Computer("ASUS", "16G", "i7-9800K", "1T");
	System.out.println(com.getHdd());
	
	com.setHdd("2T");
	
	System.out.println(com.getHdd());
}
}
