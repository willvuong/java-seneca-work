import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class CarClient {
	public static void main(String[] args) {
		try {
			CarInterface c = (CarInterface) Naming.lookup("rmi://localhost:1099/CarService");
			System.out.println("CarClient is running");
			Car tempCar = new Car("Toyota", "Silver", 75891);			
			System.out.println(tempCar.toString());
			tempCar.setPlate(c.registerCar(tempCar));
			System.out.println(tempCar.toString());
		} catch (MalformedURLException murle) {
			System.out.println("MalformedURLException");
			System.out.println(murle);
		} catch (RemoteException re) {
			System.out.println("RemoteException");
			System.out.println(re);
		} catch (NotBoundException nbe) {
			System.out.println("NotBoundException");
			System.out.println(nbe);
		} catch (java.lang.ArithmeticException ae) {
			System.out.println("java.lang.ArithmeticException");
			System.out.println(ae);
		}
	}
}
