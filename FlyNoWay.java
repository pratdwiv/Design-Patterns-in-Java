package designPatterns.strategy;

public class FlyNoWay implements FlyBehavior{
	public void fly() {
		System.out.println("This duch doesn't fly!!");
	}
}
