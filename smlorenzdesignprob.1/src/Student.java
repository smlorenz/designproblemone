//import java.util.ArrayList;
//import java.util.HashMap;

public class Student {
	private int id;
	private String name;
	private boolean here;
	
	public Student(int id, String name) {
		this.id = id; //students id 
		this.name = name; //students name
	}
	
	public void Swipe(int id) {//needs id since we swiping and cannot swipe w/o id
		here = true; //they were here today
	}
	
	public String toString() { //this checks the attendence of individual student and helps with other list
		if(here == true) {
		return String.format("Student %s was here today.", this.name); //no need for id... they were here
		}
		else {
			return String.format("Student %s was not present.", this.name); //show missing
		}
	}
}
