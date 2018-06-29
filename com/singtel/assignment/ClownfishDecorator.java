package com.singtel.assignment;

public class ClownfishDecorator extends Fish {
	Fish fish;
	public ClownfishDecorator(Fish fish) {
		this.fish = fish;
	}
	
	@Override
	public void getColor() {
		System.out.println("I'm orange in color");
	}
	
	@Override
	public void getSize() {
		System.out.println("I'm small in size");
	}
}
