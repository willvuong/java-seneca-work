package shapes;

public class Square extends Rectangle implements FunctionalShapeInterface{
	//Main > Shape > Parallelogram > Rectangle > Square
	
	public Square(double tempWidth) throws ParallelogramException {
		super(tempWidth, tempWidth);
	}
	
	//perimeter
	/*@Override
	public double getPerimeter() {
		return (getWidth() * 4);
	}*/
		
	//lambda
	
			
	@Override
	public double getArea() {
		FunctionalShapeInterface squareArea = () -> getWidth() * getWidth();
		return squareArea.getArea();
	}
	//
	
	//toString (output statement)
	@Override
	public String toString() {
		return ("Square {s=" + getWidth() +"} perimeter = " + getPerimeter() + " area = " + getArea());
	}
}
