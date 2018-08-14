package designPatterns.strategy;

public class MuteQuack implements QuackBehavior{
	public void quack() {
		System.out.println("This duck is Mute!!");
	}
}
