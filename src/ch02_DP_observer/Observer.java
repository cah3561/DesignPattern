package ch02_DP_observer;

public interface Observer {
	
	public void update(float temp, 
			float humidity, float pressure);

}
