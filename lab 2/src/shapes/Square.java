package shapes;

public class Square extends Rectangle{
	//Main > Shape > Parallelogram > Rectangle > Square
	
	public Square(double tempWidth) throws ParallelogramException {
		super(tempWidth, tempWidth);
	}
	
	//perimeter
	/*@Override
	public double getPerimeter() {
		return (getWidth() * 4);
	}*/
		
	//toString (output statement)
	@Override
	public String toString() {
		return ("Square {s=" + getWidth() +"} perimeter = " + getPerimeter());
	}
}
