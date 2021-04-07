import java.util.ArrayList;

public class DaysAttendence {
	ArrayList<Students> attendence;
	Students s;
	
	public DaysAttendence() { //making a list so the teaxher can see it at the end of the day
		attendence = new ArrayList<Students>();
		attendence.add(s);
	}
	
	public ArrayList<Students> toStudent() {
		return attendence;
	}

}
