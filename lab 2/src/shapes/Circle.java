package shapes;

public class Circle implements Shape {
	double radius;
	
	//constructor
	public Circle(double tempRadius) throws CircleException {
		if (tempRadius > 0) { //check input: tempRadius
			this.radius = tempRadius;
		} else {
			throw new CircleException("Invalid radius!");
		}
	}
	
	//getter
	public double getRadius() {
		return radius;
	}
	
	//setter
	public void setRadius(double tempRadius) throws CircleException {
		if(tempRadius > 0) {
			this.radius = tempRadius;
		} else {
			throw new CircleException("Invalid radius!");
		}
	}
	
	//perimeter
	@Override
	public double getPerimeter() {
		return (2 * Math.PI * getRadius());
	}
	
	//toString (output statement)
	@Override
	public String toString() {
		return ("Circle {r=" + getRadius() + "} perimeter = " + getPerimeter());
	}
	
	
}
