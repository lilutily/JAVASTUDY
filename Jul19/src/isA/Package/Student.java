package isA.Package;

public class Student extends Human {
	String college;
 public Student() {
	// TODO Auto-generated constructor stub
}
public Student(String name, int age, String college) {
	super(name, age);
	this.college = college;
}
@Override
public void print() {
	// TODO Auto-generated method stub
	super.print();
	System.out.println(college);
}
 
}
