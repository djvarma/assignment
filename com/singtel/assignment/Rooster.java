package com.singtel.assignment;

public class Rooster implements IFlyable, IWalkable, ISingable {
	private Bird chicken;
	
	public Rooster(Bird chicken) {
		this.chicken = chicken;
	}

	@Override
	public void walk() {
		chicken.walk();
	}

	@Override
	public void fly() {
		chicken.fly();
	}

	@Override
	public void sing() {
		System.out.println("Cock-a-doodle-doo");
	}
	
	
}
