package com.singtel.assignment;

public class Chicken extends Bird {
	@Override
	public void sing() {
		System.out.println("Cluck, cluck");
	}
	
	@Override
	public void fly() {
		System.out.println("My wings are broken, i cannot fly!!");
	}
}
