package July09.sabarish.assign;

public class Truck extends Vehicle {

	public Truck(String make, String model) {
		super(make, model);
	
	}
	@Override
	public String toString() {
		return "Truck [make=" + getMake()+ ", model=" + getModel() + "]";
	}

}
