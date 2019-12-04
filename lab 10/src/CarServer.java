import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class CarServer {
	
	public CarServer() {
		try {
			CarInterface c = new CarImpl();
			LocateRegistry.createRegistry(1099);
			Naming.rebind("rmi://localhost:1099/CarService", c);
		} catch (Exception e) {
			System.out.println("Trouble: " + e);
		}
	}
	
	public static void main(String args[]) {
		new CarServer();
		System.out.println("CarServer is running");
	}
	
}
