import java.io.Serializable;

public class Car implements Serializable {
	
	String model;
	String color;
	int mileage;
	String plate;
	
	public Car(String tempModel, String tempColor, int tempMilage) {
		this.model = tempModel;
		this.color = tempColor;
		this.mileage = tempMilage;
		plate = "unregistered";
	}
	
	public void setModel(String tempModel) {
		this.model = tempModel;
	}
	
	public void setColor(String tempColor) {
		this.color = tempColor;
	}

	public void setMileage(int tempMileage) {
		this.mileage = tempMileage;
	}
	
	public void setPlate(String tempPlate) {
		this.plate = tempPlate;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getMileage() {
		return mileage;
	}
	
	public String getPlate() {
		return plate;
	}
	
	public String toString() {
		return "Model: " + getModel() + " | " + 
				" Color: " + getColor() + " | " + 
				" Mileage: " +  getMileage() + " | " + 
				getPlate();
	}
	
}
