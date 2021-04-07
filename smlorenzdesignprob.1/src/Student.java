import java.util.ArrayList;
//import java.util.HashMap;

public class Student {
	private int id;
	private String name;
	private ArrayList<String> record;
	private boolean here;
	
	public Student(int id, String name) {
		this.id = id; //students id 
		this.name = name; //students name
	}
	
	public void Swipe(int id) {//needs id since we swiping and cannot swipe w/o id
		record = new ArrayList<String>(); //stores names instead of id
		record.add(this.name); //add name
		here = true; //they were here today
	}
	
	public String toString() { //this checks the attendence of individual student 
		if(here == true) {
		return String.format("Student %s was here today.", this.name); //no need for id... they were here
		}
		else {
			return String.format("Student %s with id %d not present.", this.name, this.id); //show missing id
		}
	}
	
	public ArrayList<String> Record(ArrayList<String> s) {
		for (String str : s)
	      { 		      
           System.out.println(str); 		
	      }
		return s;
	}
	
	public ArrayList<String> dayList() { //this prints the entire list of names (?)
		return Record(record);
	}
	//making class for attenmdencde list type student then use tostring to print
}
