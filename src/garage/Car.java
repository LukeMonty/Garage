package garage;

public class Car extends Vehicle {
	
	int numberOfSeats;
	String type;
	String colour; 
	
	public Car(int numberOfWheels, boolean hasDoors, int costOfFuel, boolean isAutomatic, String typeOfFuel, String type, String colour, int noOfSeats) {
		super(numberOfWheels, hasDoors, costOfFuel, isAutomatic, typeOfFuel);
		this.numberOfSeats = noOfSeats;
		this.type = type;
		this.colour = colour;
	}

}
