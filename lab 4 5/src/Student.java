import java.util.ArrayList;
import java.io.Serializable;

public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	int stdID;
	String firstName;
	String lastName;
	ArrayList<String> courses = new ArrayList<String>(); //String courses[];
	
	public Student(int tempStdID, String tempFirstName, String tempLastName, ArrayList<String> tempCourses) {
		this.stdID = tempStdID;
		this.firstName = tempFirstName;
		this.lastName = tempLastName;
		this.courses = tempCourses;
	}
	
	//getters
	public int getStdID() {
		return stdID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public ArrayList<String> getCourses() {
		return courses;
	}
	
	//setters
	public void setStdID (int tempStdID) {
		this.stdID = tempStdID;
	}
	
	public void setFirstName (String tempFirstName) {
		this.firstName = tempFirstName;
	}
	
	public void setLastName (String tempLastName) {
		this.lastName = tempLastName;
	}
	
	public void setCourses (ArrayList<String> tempCourses) {
		this.courses = tempCourses;
	}
}
