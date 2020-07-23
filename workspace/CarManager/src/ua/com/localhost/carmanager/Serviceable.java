package ua.com.localhost.carmanager;

public interface Serviceable {
	
	public void addDistance(int additionalDistance);
	
	public void addDistance(double additionalDistance);

	public void service();

	public boolean isReadyToService(); 
	
	public int getDistanceOnService();
}