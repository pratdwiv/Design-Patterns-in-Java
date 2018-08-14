package designPatterns.strategy;

public class Quack implements QuackBehavior{
	public void quack() {
		System.out.println("This duck Quacks!!");
	}
}
