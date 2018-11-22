package garage;

public class MotorisedUnicycle extends Vehicle {
	
	int sizeOfWheel;

	public MotorisedUnicycle(int numberOfWheels, boolean hasDoors, int costOfFuel, boolean isAutomatic, String typeOfFuel, int sizeOfWheel) {
		super(numberOfWheels, hasDoors, costOfFuel, isAutomatic, typeOfFuel);
		this.sizeOfWheel = sizeOfWheel;
	}

}
