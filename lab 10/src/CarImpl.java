
public class CarImpl extends java.rmi.server.UnicastRemoteObject implements CarInterface {
	public CarImpl() throws java.rmi.RemoteException {
		super();
	}

	@Override
	public String registerCar(Car tempCar) throws java.rmi.RemoteException {
		return "" + tempCar.hashCode();
	}
}
