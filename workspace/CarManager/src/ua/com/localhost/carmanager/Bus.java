package ua.com.localhost.carmanager;

public class Bus extends Car {

	public Bus(String name, int yearOfProduction, int price, int weight, Color color) {
		super(name, yearOfProduction, price, weight, color);
	}

	public boolean isReadyToService() {
		if (distanceOnService > 50000) {
			return true;
		} else {
			return false;
		}
	}

}