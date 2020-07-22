package ua.com.localhost.carmanager;

public enum Color {
	WHITE("white"), GREEN("green"), BLACK("black"), BLUE("blue"), ORANGE("orange");
	
	private String color;

	Color(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return color;
	}
}