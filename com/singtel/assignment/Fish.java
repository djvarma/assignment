package com.singtel.assignment;

public class Fish implements ISwimmable {

	@Override
	public void swim() {
		System.out.println("I'm swimming");
	}
	
	public void getColor() {
		System.out.println("Default color");
	}
	
	public void getSize() {
		System.out.println("Default size");
	}
	
}
