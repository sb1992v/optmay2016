package July09.sabarish.assign;

public class GenericTestClass {

	public static void main(String[] args) {
		GenericVehicle<Vehicle> gaadi = new GenericVehicle<Vehicle>();
		gaadi.register(new Car("Honda Odessy", "2003"));
		System.out.println("\n.........................\n");
		
		gaadi.register(new Truck("Ashok Leyland","2005"));

	}

}
