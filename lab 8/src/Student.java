
public class Student {
	
	String firstName;
	String lastName;
	double grade;
	String department;
	
	public Student(String tempFirstName, String tempLastName, double tempGrade, String tempDepartment) {
		this.firstName = tempFirstName;
		this.lastName = tempLastName;
		this.grade = tempGrade;
		this.department = tempDepartment;
	}
	
	/************************************************/
	
	public void setFirstName (String tempFirstName) {
		this.firstName = tempFirstName;
	}
	
	public void setLasttName (String tempLastName) {
		this.lastName = tempLastName;
	}
	
	public void setGrade (double tempGrade) {
		this.grade = tempGrade;
	}
	
	public void setDepartment (String tempDepartment) {
		this.department = tempDepartment;
	}
	
	/************************************************/
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public double getGrade() {
		return grade;
	}
	
	public String getDepartment() {
		return department;
	}
	
	/************************************************/
	
	public String getName() {
		return getFirstName() + ' ' + getLastName();
	}
	
	/************************************************/
	
	public String toString() {
		return getName() + ' ' + getGrade() + ' ' + getDepartment();
	}
	
	/************************************************/
}
