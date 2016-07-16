package July09.sabarish.assign;

public class Car extends Vehicle {

	public Car(String make, String model) {
		super(make, model);

	}

	@Override
	public String toString() {
		return "Car [make=" + getMake()+ ", model=" + getModel() + "]";
	}
}
