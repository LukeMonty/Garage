package garage;

import java.util.ArrayList;

public class Garage {
	ArrayList<Vehicle> garage = new ArrayList<Vehicle>();
	
	public void goThroughGarage() {
		
		for (Vehicle vehicle : garage) {
			System.out.println(vehicle);
		}
		
	}
	
	public int costOfMaintenance() {
		int costOfMaintenance = 0;
		for (Vehicle vehicle : garage) {
			 costOfMaintenance = vehicle.costOfFuel * 40;
		}
		
		return costOfMaintenance;
	}
	
	public void addVehicle(Vehicle typeOfVehicle) {
		
		
		
	}
	
	public void storeVehicles() {
		
		Car carOne = new Car(4,true,45,true,"Petrol","Sports","Black",4);
		MotorisedUnicycle what = new MotorisedUnicycle(1, false, 1, true, "Electric", 1);
		Motorbike bike = new Motorbike(2, false, 15, false, "Petrol", "Sports", "Orange");
		Motorbike bikey = new Motorbike(2, false, 25, false,"Petrol", "Chopper", "Orange");
		garage.add(carOne);
		garage.add(bike);
		garage.add(bikey);
		garage.add(what);
		System.out.println(garage);
		
		
	}
}
