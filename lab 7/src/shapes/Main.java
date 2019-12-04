package shapes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[100];  //array of shapes
		int shapeIndex = 0;               //shape number
		String line;                      //text file line
		
		System.out.println("------->JAC 444 Assignment 1<-------");
		System.out.println("------->Task 1 ... <-------");
		
		try (BufferedReader br = new BufferedReader(new FileReader("shapes.txt"))) {
			while ((line = br.readLine()) != null) {
				String[] tokens = line.split(",");
			
				for(int i = 0; i < tokens.length; i++) {
					if(tokens[i].equals("Circle") && tokens.length == 2) { //tokens.length will check right amount of inputs (*shape*, number(s))
						try {
							shapes[shapeIndex] = new Circle(Double.parseDouble(tokens[i+1]));
							/*create new object by converting string to double (using Double.parseDouble) 
							 of value after the word *shape*, which is the first number value*/
							shapeIndex++;
						} catch (CircleException exception) {
							System.out.println(exception.getMessage());
						}
					}
					else if(tokens[i].equals("Square") && tokens.length == 2) {
						try {
							shapes[shapeIndex] = new Square(Double.parseDouble(tokens[i+1]));
							shapeIndex++;
						} catch (ParallelogramException exception) {
							System.out.println(exception.getMessage());
						}
					}
					else if(tokens[i].equals("Rectangle") && tokens.length == 3) {
						try {
							shapes[shapeIndex] = new Rectangle(Double.parseDouble(tokens[i+1]), Double.parseDouble(tokens[i+2]));
							shapeIndex++;
						} catch (ParallelogramException exception) {
							System.out.println(exception.getMessage());
						}
					}
					else if(tokens[i].equals("Parallelogram") && tokens.length == 3) {
						try {
							shapes[shapeIndex] = new Parallelogram(Double.parseDouble(tokens[i+1]), Double.parseDouble(tokens[i+2]));
							shapeIndex++;
						} catch (ParallelogramException exception) {
							System.out.println(exception.getMessage());
						}
					}
					else if(tokens[i].equals("Triangle") && tokens.length == 4) {
						try {
							shapes[shapeIndex] = new Triangle(Double.parseDouble(tokens[i+1]), Double.parseDouble(tokens[i+2]), Double.parseDouble(tokens[i+3]));
							shapeIndex++;
						} catch (TriangleException exception) {
							System.out.println(exception.getMessage());
						}
					}
					else {
					
					}
				}
			}
			
			System.out.println("\n" + shapeIndex + " shapes were created:");	
			
			for(Shape tempShapes : shapes) { //must create new tempShapes obj array reffering to shapes
				if(tempShapes != null) {
					System.out.println(tempShapes);					
				}
			}
			
			System.out.println("\n------->Task 2 ... <-------");
			double trianglelowestPerimeter = 0;
			double circleHighestPerimeter = 0;
			
			/*double triangleMinimumPerimeter(Shape[] tempShapes) {
			//did not work for some reason - wont allow this method
			double lowP;
			
			for (int i = 0; i < shapeIndex + 1; i++) {
				if (shapes[i] instanceof Triangle) {
					if (shapes[i].getPerimeter() < lowP) {
						lowP = shapes[i].getPerimeter();	
					}		 
				}
			}
			return lowP;
			}*/
			
			//triangle
			//triangle check what is the lowest
			for (int i = 0; i < shapeIndex; i++) {
				if (shapes[i] instanceof Triangle) {
					if (shapes[i].getPerimeter() < trianglelowestPerimeter || trianglelowestPerimeter == 0) {
						trianglelowestPerimeter = shapes[i].getPerimeter();
					}
				}
			}
			
			//check which is lowest, then remove
			for (int i = 0; i < shapeIndex; i++) {
				if (shapes[i] instanceof Triangle) {
					if (shapes[i].getPerimeter() == trianglelowestPerimeter) {
							shapeIndex--;
							shapes[i] = null;
					}
				}
			}
			
			//circle
			//circle check what is the highest
			for (int i = 0; i < shapeIndex; i++) {
				if (shapes[i] instanceof Circle) {
					if (shapes[i].getPerimeter() > circleHighestPerimeter) {
						circleHighestPerimeter = shapes[i].getPerimeter();
					}
				}
			}
			
			//check which is highest, then remove
			for (int i = 0; i < shapeIndex; i++) {
				if (shapes[i] instanceof Circle) {
					if (shapes[i].getPerimeter() == circleHighestPerimeter) {
							shapeIndex--;
							shapes[i] = null;
					}
				}
			}
			
			System.out.println("\n" + shapeIndex + " shapes were created:");	
			
			for(Shape tempShapes : shapes) {
				if(tempShapes != null) {
					System.out.println(tempShapes);					
				}
			}
			
			System.out.println("\n------->Task 3 ... <-------");
			
			double totalParallelogramPerimeter = 0;
			double totalTrianglePerimeter = 0;
			
			for (int i = 0; i < shapeIndex + 1; i++) {
				if (shapes[i] instanceof Parallelogram && !(shapes[i] instanceof Rectangle)) {
					totalParallelogramPerimeter += shapes[i].getPerimeter();
				}		
			}
			
			for (int i = 0; i < shapeIndex + 1; i++) {
				if (shapes[i] instanceof Triangle) {
					totalTrianglePerimeter += shapes[i].getPerimeter();
				}		
			}
			
			System.out.println("Total perimeter of Parallelogram is: " +totalParallelogramPerimeter);
			System.out.println("Total perimeter of Triangle is: " +totalTrianglePerimeter);
			
			
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
