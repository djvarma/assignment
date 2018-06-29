package com.singtel.assignment;

public class SharkDecorator extends Fish {
	Fish fish;
	public SharkDecorator(Fish fish) {
		this.fish = fish;
	}
	
	@Override
	public void getColor() {
		System.out.println("I'm gray in color");
	}
	
	@Override
	public void getSize() {
		System.out.println("I'm very large");
	}
}
