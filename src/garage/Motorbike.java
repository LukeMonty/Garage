package garage;

public class Motorbike extends Vehicle {
	
	String typeOfBike;
	String colour;
	
	public Motorbike(int numberOfWheels, boolean hasDoors, int costOfFuel, boolean isAutomatic, String typeOfFuel, String type, String colour) {
		super(numberOfWheels, hasDoors, costOfFuel, isAutomatic, typeOfFuel);
		this.typeOfBike = type;
		this.colour = colour;
	}

}
