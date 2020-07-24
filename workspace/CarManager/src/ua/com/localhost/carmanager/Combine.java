package ua.com.localhost.carmanager;

public class Combine implements Serviceable {

	String name;
	int yearOfProduction;
	int price;
	int weight;
	Color color;
	private int distance = 0;
	protected int distanceOnService = 0;

	public Combine(String name, int yearOfProduction, int price, int weight, Color color, int distance,
			int distanceOnService) {
		super();
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.color = color;
		this.distance = distance;
		this.distanceOnService = distanceOnService;
	}

	@Override
	public void addDistance(int additionalDistance) {

	}

	@Override
	public void addDistance(double additionalDistance) {

	}

	@Override
	public void service() {

	}

	@Override
	public boolean isReadyToService() {
		if (distanceOnService > 1500) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int getDistanceOnService() {
		return 0;
	}

	@Override
	public String toString() {
		return "Combine [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight="
				+ weight + ", color=" + color + ", distance=" + distance + ", distanceOnService=" + distanceOnService
				+ "]";
	}	

}