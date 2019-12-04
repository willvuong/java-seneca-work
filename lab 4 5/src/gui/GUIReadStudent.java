package gui;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class GUIReadStudent {
	private static ObjectInputStream input;
	
	public static void deserialize() {
		openFile();
		readRecords();
		closeFile();
	}
	
	public static void openFile() {
		try {
			input = new ObjectInputStream(new FileInputStream("Student.bin"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void readRecords() {
		try {
			while (input != null) {
				Student student = (Student) input.readObject();
				JFrame frame = new JFrame();
				frame.setTitle("Student Info Frame");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.setBounds(0, 0, 600, 70);
		        
		        JTextArea textArea = new JTextArea(20, 40);
		        textArea.append("Student ID: " + student.getStdID() + ", ");
		        textArea.append("First Name: " + student.getFirstName() + ", ");
		        textArea.append("Last Name: " + student.getLastName() + ", ");
		        textArea.append("Courses: " + student.getCourses());
		        frame.add(textArea);
				
				frame.setVisible(true);
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
