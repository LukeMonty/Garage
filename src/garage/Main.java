package garage;

public class Main {
	
	public static void main(String[] args) {
		Garage garage = new Garage();
		Motorbike bike = new Motorbike(2, false, 25, false,"Petrol", "Sports", "Orange");
		garage.storeVehicles();
		
	}

}
