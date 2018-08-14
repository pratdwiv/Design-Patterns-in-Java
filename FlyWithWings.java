package designPatterns.strategy;

public class FlyWithWings implements FlyBehavior{
	public void fly() {
		System.out.println("This duck flys with wings.");
	}
}
