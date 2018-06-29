package com.singtel.assignment;

public class Caterpillar implements IFlyable, IWalkable {

	@Override
	public void fly() {
		System.out.println("I'm a catterpillar. I can fly");
	}

	@Override
	public void walk() {
		System.out.println("I'm a catterpillar. I can crawl");
	}

}
