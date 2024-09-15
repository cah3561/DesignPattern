package ch01_DP_strategy;

public class FlyNoWay implements FlyBehavior {
	// 날지 못하는 행동 - 인터페이스 '나는 행위'
	
	public void fly() {
		System.out.println("날지 못합니다.");
	}
}
