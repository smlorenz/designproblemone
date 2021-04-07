import java.util.ArrayList;

public class Main {
	
	 public static void main(String[] args) {
	
	ArrayList<Students> a = new ArrayList<Students>();
	Students m = new Students(737456, "Meep Moop");
	Students d = new Students(789654, "Dustin Cates");
	Students s = new Students(737157, "Sam Lorenz");
	
	System.out.println(m); //this reads back not present,no swipe
	
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
