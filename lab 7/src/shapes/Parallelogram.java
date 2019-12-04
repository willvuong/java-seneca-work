package shapes;

public class Parallelogram implements Shape {
	double width;
	double height;
	
	//constructor
	public Parallelogram (double tempWidth, double tempHeight) throws ParallelogramException{
		if (tempWidth > 0 && tempHeight > 0) {
			this.width = tempWidth;
			this.height = tempHeight;
		} else {
			throw new ParallelogramException("Invalid side(s)!");
		}
	}
	
	//getter
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	
	//setter
	public void setWidth(double tempWidth) throws ParallelogramException {
		if (tempWidth > 0) {
			this.width = tempWidth;
		} else {
			throw new ParallelogramException("Invalid side!");
		}
	}
	public void setHeight(double tempHeight) throws ParallelogramException {
		if (tempHeight > 0) {
			this.height = tempHeight;
		} else {
			throw new ParallelogramException("Invalid side!");
		}
	}
	
	//perimeter
	@Override
	public double getPerimeter() {
		return (getWidth() * 2) + (getHeight() * 2);
	}
	
	//toString (output statement)
	@Override
	public String toString() {
		return ("Parallelogram {w=" + getWidth() + ", h=" + getHeight() +"} perimeter = " + getPerimeter());
	}
}
