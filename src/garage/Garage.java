package garage;

import java.util.ArrayList;

public class Garage {
	ArrayList<Vehicle> garage = new ArrayList<Vehicle>();
	
	public void storeVehicles() {
		
		Car carOne = new Car(4,true,45,true,"Petrol","Sports","Black",4);
		Motorbike bike = new Motorbike(2, false, 15, false, "Petrol", "Sports", "Orange");
		garage.add(carOne);
		System.out.println(carOne.toString() + " and " + bike.toString());
		
		
	}
}
