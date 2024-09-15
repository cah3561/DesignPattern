package ch01_DP_strategy;

public class FlyWithWings implements FlyBehavior {
	// 날개를 이용해 나는 행동 - 인터페이스 '나는 행위'
	
	public void fly() {
		System.out.println("날개짓을 해서 날고 있습니다.");
	}
}
