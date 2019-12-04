
import java.util.Arrays;
import java.util.List; 
import java.util.Comparator;


public class StudentProcess {

	public static void main(String[] args) {
		
		Student[] students = {
				 new Student("Jack", "Smith", 50.0, "IT"),
				 new Student("Aaron", "Johnson", 76.0, "IT"),
				 new Student("Maaria", "White", 35.8, "Business"),
				 new Student("John", "White", 47.0, "Media"),
				 new Student("Laney", "White", 62.0, "IT"),
				 new Student("Jack", "Jones", 32.9, "Business"),
				 new Student("Wesley", "Jones", 42.89, "Media")		 
		};
		
		List<Student>myStudentsList = Arrays.asList(students);
		
		//1
		myStudentsList
			.stream()
			.forEach(System.out::println);
		System.out.println('\n');
		//
		
		//2
		myStudentsList
			.stream()
			.filter(grade -> grade.getGrade() >= 50 && grade.getGrade() <= 100)	
			.sorted(Comparator.comparing(Student::getGrade))
			.forEach(System.out::println);
		System.out.println('\n');
		//
		
		//3
		Student task3 = myStudentsList
			.stream()
			.filter(grade -> grade.getGrade() >= 50 && grade.getGrade() <= 100)
			.findFirst()
			.get();
		System.out.println(task3);
		System.out.println('\n');
		//
		
		//4
		myStudentsList
			.stream()
			.sorted(Comparator.comparing(Student::getLastName)
			.thenComparing(Comparator.comparing(Student::getFirstName)))
			.forEach(System.out::println);
		System.out.println('\n');
		myStudentsList
			.stream()
			.sorted(Comparator.comparing(Student::getLastName)
			.thenComparing(Comparator.comparing(Student::getFirstName)).reversed())
			.forEach(System.out::println);
		System.out.println('\n');
		//
		
		//task5
		myStudentsList
			.stream()
			.sorted(Comparator.comparing(Student::getLastName))
			.map(Student::getLastName)
			.distinct()
			.forEach(System.out::println);//s -> System.out.println(s.toString());
		//
	}
}
