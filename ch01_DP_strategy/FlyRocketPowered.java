package ch01_DP_strategy;

public class FlyRocketPowered implements FlyBehavior {
	// 로켓을 이용해 나는 행동 - 인터페이스 '나는 행위'
	
	public void fly() {
		System.out.println("로켓을 달고 날고 있습니다.");
	}
}