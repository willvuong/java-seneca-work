import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SaveStudent {
	private static ObjectOutputStream output;
	
	public static void main(String[] args) {
		/*openFile();
		addRecords();
		closeFile();*/
		ReadStudent.deserialize();
	}	
		
	public static void openFile() {
		try {
			output = new ObjectOutputStream(new FileOutputStream("Student.txt"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void addRecords() {
		try {
			Scanner scan = new Scanner(System.in);
			
			int stdIDHolder;
			String firstNameHolder;
			String lastNameHolder;
			
			int studentRecords;
			int coursesAmount;
			
			System.out.print("How many student records would you like to add?: ");
			studentRecords = scan.nextInt();
			
			for (int i = 0; i < studentRecords; i++) {
				ArrayList<String> coursesHolder = new ArrayList<String>();
				int stuNum = i + 1;
				
				System.out.print("Student#" + stuNum + "\n");
				
				System.out.print("Student ID: ");
				stdIDHolder = scan.nextInt();
				
				System.out.print("First Name: ");
				firstNameHolder = scan.next();
				
				System.out.print("Last Name: ");
				lastNameHolder = scan.next();
			
				System.out.print("How many courses would you like to add?: ");
				coursesAmount = scan.nextInt();
				
				for (int j = 0; j < coursesAmount; j++) {
					int k = j + 1;
					System.out.print("Course #" + k +": ");
					coursesHolder.add(scan.next());	
				}	
				System.out.print("----------------------------\n");
				Student student = new Student(stdIDHolder, firstNameHolder, lastNameHolder, coursesHolder);
				output.writeObject(student);
						
			}
			scan.close();
			ReadStudent.deserialize();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void closeFile() {
		try{
			if (output != null)
				output.close();
		}catch (IOException ioException){
			System.err.println("Error closing file. Terminating.");
			System.exit(1);
		}
	}
	
}
		