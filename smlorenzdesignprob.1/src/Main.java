import java.util.ArrayList;

public class Main {
	
	 public static void main(String[] args) {
	
	ArrayList<Student> a = new ArrayList<Student>();
	Student m = new Student(737456, "Meep Moop");
	Student d = new Student(789654, "Dustin Cates");
	Student s = new Student(737157, "Sam Lorenz");
	
	//System.out.println(m); //this reads back not present,no swipe
	
	m.Swipe(737456);
	//System.out.println(m); //present
	a.add(m);
	
	d.Swipe(789654);
	//System.out.println(d); //present
	a.add(d);
	
	//System.out.println(s); //not present
	a.add(s);
	
	System.out.println(a);
	
	
	
	 }
}
