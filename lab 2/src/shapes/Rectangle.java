package shapes;

public class Rectangle extends Parallelogram { 
	//Parallelogram already extends main which implements shape
	//Main > Shape > Parallelogram > Rectangle
	
	public Rectangle (double tempWidth, double tempHeight) throws ParallelogramException{ 
		super(tempWidth, tempHeight); 
		//class superclass constructor, which already checks for validity
		//uses ParallelogramException because Rectangle is a subclass of Parallelogram so it must use the superclass' exception
	}
	
	/*getters and setters are already implemented in Parallelogram class 
	  so Rectangle class doesn't need it because a parallelogram*/ 
	
	//perimeter
	/*@Override
	public double getPerimeter() {
		return (getWidth() * 2) + (getHeight() * 2);
	}*/
	
	//toString (output statement)
	@Override
	public String toString() {
		return ("Rectangle {w=" + getWidth() + ", h=" + getHeight() +"} perimeter = " + getPerimeter());
	}
}
