package com.singtel.assignment;

public class Solution {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		
		Bird duck = new Duck();
		duck.sing();
		
		Bird chicken = new Chicken();
		chicken.sing();
		
		Rooster rooster = new Rooster(chicken);
		rooster.sing();
		
		Parrot parrotWithDogs = ParrotFactory.getParrotLivingWith("dogs");
		parrotWithDogs.sing();
		
		Parrot parrotWithCats = ParrotFactory.getParrotLivingWith("cats");
		parrotWithCats.sing();
		
		Parrot parrotWithRoosters = ParrotFactory.getParrotLivingWith("roosters");
		parrotWithRoosters.sing();
		
		Animal[] animals = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(new Chicken()),
				new Fish(),
				new Parrot(),
				new SharkDecorator(new Fish()),
				new ClownfishDecorator(new Fish()),
				new Dolphin(),
				new Butterfly(),
				new Caterpillar()
		};
		
		//Finding animal counts based on their abilities
		int flyableAnimalCount = 0;
		int swimmableAnimalCount = 0;
		int walkableAnimalCount = 0;
		int singableAnimalCount = 0;
		for(Animal animal : animals) {
			if(animal instanceof IFlyable) {
				flyableAnimalCount++;
			} 
			if(animal instanceof ISwimmable) {
				swimmableAnimalCount++;
			} 
			if(animal instanceof ISingable) {
				singableAnimalCount++;
			} 
			if(animal instanceof IWalkable) {
				walkableAnimalCount++;
			}
		}
		System.out.println("Flyable animals:"+flyableAnimalCount);
		System.out.println("Swimmable animals:"+swimmableAnimalCount);
		System.out.println("Walkable animals:"+walkableAnimalCount);
		System.out.println("Singable animals:"+singableAnimalCount);
	}
}
