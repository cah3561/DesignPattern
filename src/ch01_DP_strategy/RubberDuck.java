package ch01_DP_strategy;

public class RubberDuck extends Duck {
	 
	public RubberDuck() {
		//행동 규정
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
 
	public void display() {
		System.out.println("러버 오리입니다.");
	}
}