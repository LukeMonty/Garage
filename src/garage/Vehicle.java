package garage;

public abstract class Vehicle {
	
	int numberOfWheels;
	boolean hasDoors;
	String typeOfFuel;
	int costOfFuel;  //this is based per mile, random meaningless number
	boolean isAutomatic;
	
	
	public Vehicle(int numberOfWheels, boolean hasDoors, int costOfFuel, boolean isAutomatic, String typeOfFuel) {
		this.numberOfWheels = numberOfWheels;
		this.hasDoors = hasDoors;
		this.costOfFuel = costOfFuel;
		this.isAutomatic = isAutomatic;
		this.typeOfFuel = typeOfFuel;
	}
	
	public String getTypeOfVehicle() {
		
		return this.getClass().getName().substring(7); // This is because the name is called from the garage class first, e.g "garage.Car" as the Vehicles are stored in "garage"
		
	}
	
	public String toString() {
		
		return "This is a " + this.getTypeOfVehicle();
		
	}
	
}
