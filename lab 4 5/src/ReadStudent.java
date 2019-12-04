import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class ReadStudent {
	private static ObjectInputStream input;
	
	public static void deserialize() {
		openFile();
		readRecords();
		closeFile();
	}
	
	public static void openFile() {
		try {
			input = new ObjectInputStream(new FileInputStream("Student.txt"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void readRecords() {
		try {
			while (input != null) {
				Student student = (Student) input.readObject();
				
				//int studentNumber = 1;
				//System.out.println("Student #" +studentNumber);
				//studentNumber++;
				
				System.out.println("Student: " + student.getStdID());
				System.out.println("First Name: " + student.getFirstName());
				System.out.println("Last Name: " + student.getLastName());
				System.out.println("Courses: " + student.getCourses());
				System.out.println("\n");
			} 
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void closeFile() {
		try{
			if (input != null)
				input.close();
		}catch (IOException ioException){
			System.err.println("Error closing file. Terminating.");
			System.exit(1);
		}

	}
}
