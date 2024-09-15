package ch01_DP_strategy;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
 
	public Duck() {
	}
 
	public void setFlyBehavior (FlyBehavior fb) {
		flyBehavior = fb;
	}
 
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
 
	abstract void display();
 
	public void performFly() {
		flyBehavior.fly();
	}
 
	public void performQuack() {
		quackBehavior.quack();
	}
 
	public void swim() {
		System.out.println("수영하고 있습니다.");
	}
}




