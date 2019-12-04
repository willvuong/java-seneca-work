package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUISaveStudent {
	private static ObjectOutputStream output;
	static String stdIDHolder;
	static String firstNameHolder;
	static String lastNameHolder;
	static String coursesHolder;
	
	public static void main(String[] args) {
		
		try {
			JFrame frame = new JFrame();
			frame.setTitle("Student Frame");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setBounds(0, 0, 600, 200);
	        frame.setLayout(new GridLayout(10, 10));
	        
	        JLabel studentIDLabel = new JLabel("Student ID: ");
	        frame.add(studentIDLabel);
	        JTextField studentIDTextField = new JTextField();
	        frame.add(studentIDTextField);       
	        
	        JLabel firstNameLabel = new JLabel("First Name: ");
	        frame.add(firstNameLabel);
	        JTextField firstNameTextField = new JTextField();
	        frame.add(firstNameTextField);      
	        
	        JLabel lastNameLabel = new JLabel("Last Name: ");
	        frame.add(lastNameLabel);
	        JTextField lastNameTextField = new JTextField();
	        frame.add(lastNameTextField);
	        
	        JLabel coursesLabel = new JLabel("Courses: (use ',' to separate course(s))");
	        frame.getContentPane().add(coursesLabel);
	        JTextField coursesTextField = new JTextField();
	        frame.add(coursesTextField);
	        
	        JButton save = new JButton("Save");
	        frame.add(save);
	        
	        JButton studentInfo = new JButton("Show Student Info");
	        frame.add(studentInfo);
	        
	        save.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						stdIDHolder = studentIDTextField.getText();
						firstNameHolder = firstNameTextField.getText();
						lastNameHolder = lastNameTextField.getText();
						coursesHolder = coursesTextField.getText();
						
						openFile();
						addRecords();
						closeFile();
					} catch (Exception ee) {
						System.out.println(ee.getMessage());
					}
					
				}
	        });
	        
	        studentInfo.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					GUIReadStudent.deserialize();
				}
	        });
	        
	        frame.setVisible(true);
	        
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}	
		
	public static void openFile() {
		try {
			output = new ObjectOutputStream(new FileOutputStream("Student.bin"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void addRecords() {
		try {
			ArrayList<String> coursesList = new ArrayList<String>(Arrays.asList(coursesHolder.split(",")));
			int tempStdIDHolder = Integer.parseInt(stdIDHolder);
			
			
			Student student = new Student(tempStdIDHolder, firstNameHolder, lastNameHolder, coursesList);
			output.writeObject(student);
			
		} catch (Exception e) {
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
		
