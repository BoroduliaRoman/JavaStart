package ua.com.localhost.carmanager;

public class CarManager {

	public static void main(String[] args) {

		Car prius = new Car("Toyota Prius", 2008, 15000, 1200, Color.GREEN);

		Car renault = new Car("Renault Laguna", 2000, 9700, 1600, Color.WHITE);
		
		Car renault2 = new Car("Renault Laguna", 2000, 9700, 1600, Color.WHITE);
		
		System.out.println(prius);
		System.out.println(renault);
		System.out.println(renault2.equals(prius));
		System.out.println(renault2.equals(renault));
	}
}