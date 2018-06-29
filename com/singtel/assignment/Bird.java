package com.singtel.assignment;

public class Bird implements IFlyable, IWalkable, ISingable {
	
	@Override
	public void fly() {
		System.out.println("I'm flying");
	}

	@Override
	public void walk() {
		System.out.println("I'm walking");
	}
	
	@Override
	public void sing() {
		System.out.println("I'm singing");
	}

}
