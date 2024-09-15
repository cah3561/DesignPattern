package ch01_DP_strategy;

public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		//행동 규정
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}
	
	public void display() {
		System.out.println("가짜 오리입니다.");
	}
}