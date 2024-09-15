package ch01_DP_strategy;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		// 행동 규정
		quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
        
 

	}
 
	public void display() {
		System.out.println("청둥오리입니다.");
	}
}
