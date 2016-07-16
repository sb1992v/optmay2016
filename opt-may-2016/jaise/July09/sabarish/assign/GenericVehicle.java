package July09.sabarish.assign;

public class GenericVehicle<Vehicle> {
	private Vehicle v;

	public void register(Vehicle v){
		this.v = v;
		System.out.println(".........................");
		System.out.println("The vehicle registration is complete with the following details");
		System.out.println(v);
		
	}
}
