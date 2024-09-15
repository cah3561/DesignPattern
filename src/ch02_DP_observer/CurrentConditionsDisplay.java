package ch02_DP_observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure) {
		
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	public void display() {
		
		System.out.println("현재 기상 상태: 기온 " + temperature 
			+ "도 & 습도 " + humidity + "%");
	}
}
