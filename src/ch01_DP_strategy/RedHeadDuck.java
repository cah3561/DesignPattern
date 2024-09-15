package ch01_DP_strategy;

public class RedHeadDuck extends Duck {
	 
	public RedHeadDuck() {
		//행동 규정
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
 
	public void display() {
		System.out.println("빨간 오리입니다.");
	}
}
