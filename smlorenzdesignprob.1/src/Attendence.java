import java.util.ArrayList;

public class Attendence {
	
	ArrayList<Student> attendence;
	Student s;
	
	public Attendence() { //making a list so the teaxher can see it at the end of the day
		attendence = new ArrayList<Student>();
		attendence.add(s);
	}
	
	public ArrayList<Student> toStudent() {
		return attendence;
	}

}
