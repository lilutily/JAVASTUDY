package Jul20.lilutily.jul20.computer;


// javabean
// DTO (data temp/transfer object)
public class Computer {
	private String name;
	private String ram;
	private String cpu;
	private String hdd;
	public Computer() {
		// TODO Auto-generated constructor stub
	}
	public Computer(String name, String ram, String cpu, String hdd) {
		super();
		this.name = name;
		this.ram = ram;
		this.cpu = cpu;
		this.hdd = hdd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getHdd() {
		return hdd;
	}
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	public void print() {
		System.out.println(name);
		System.out.println(ram);
		System.out.println(cpu);
		System.out.println(hdd);
	}
}
