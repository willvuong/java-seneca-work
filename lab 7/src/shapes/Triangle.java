package shapes;

public class Triangle implements Shape{

	double length1;
	double length2;
	double length3;
	
	//constructor
	public Triangle (double tempLength1, double tempLength2, double tempLength3) throws TriangleException{
		if (tempLength1 > 0 && tempLength2 > 0 && tempLength3 > 0 &&
				tempLength1 + tempLength2 > tempLength3 &&
				tempLength1 + tempLength3 > tempLength2 &&
				tempLength2 + tempLength3 > tempLength1) {
			this.length1 = tempLength1;
			this.length2 = tempLength2;
			this.length3 = tempLength3;
		} else {
			throw new TriangleException("Invalid side(s)!");
		}
	}
	
	//getter
	public double getLength1() {
		return length1;
	}
	public double getLength2() {
		return length2;
	}
	public double getLength3() {
		return length3;
	}
	
	//setter
	public void setLength1(double tempLength1) throws TriangleException {
		if(length1 > 0) {
			this.length1 = tempLength1;
		} else {
			throw new TriangleException("Invalid side(s)!");
		}
	}
	public void setLength2(double tempLength2) throws TriangleException {
		if(length1 > 0) {
			this.length2 = tempLength2;
		} else {
			throw new TriangleException("Invalid side(s)!");
		}
	}
	public void setLength3(double tempLength3) throws TriangleException {
		if(length3 > 0) {
			this.length3 = tempLength3;
		} else {
			throw new TriangleException("Invalid side(s)!");
		}
	}
	
	//perimeter
	@Override
	public double getPerimeter() {
		return (getLength1() + getLength2() + getLength3());
	}
	
	//toString (output statement)
	@Override
	public String toString() {
		return ("Triangle {s1=" + getLength1() + ", s2=" + getLength2() + ", s3=" + getLength3() + "} perimeter = " + getPerimeter());
	}
}
